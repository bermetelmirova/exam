package com.company.taskB;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread("Java");
        thread.setName("Thread 1");
        thread.join();

        MyThread thread2 = new MyThread("Python");
        thread2.setName("Thread 2");
        thread2.join();

        MyThread thread3 = new MyThread("GO");
        thread3.setName("Thread 3");
        thread3.join();

        MyThread thread4 = new MyThread("JavaScript");
        thread4.setName("Thread 4");
        thread4.join();

        MyThread thread5 = new MyThread("PHP");
        thread5.setName("Thread 5");
        thread5.join();

        MyThread thread6 = new MyThread("C#");
        thread6.setName("Thread 6");
        thread6.join();

        thread.start();
        thread.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

        thread4.start();
        thread4.join();

        thread5.start();
        thread5.join();

        thread6.start();
        thread6.join();
    }
}
