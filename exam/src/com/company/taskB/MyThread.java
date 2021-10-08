package com.company.taskB;

public class MyThread extends Thread{
    private String nameOfGroup;

    public MyThread(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public MyThread() {
    }

    @Override
    public void run() {
        System.out.println(getName() + ": " + nameOfGroup);
    }
}
