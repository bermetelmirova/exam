package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LawerDep extends Department {
    private static int countBooks;

    public LawerDep(Book[] books) {
        super(books);
        countBooks = books.length;
    }

    public LawerDep() {
    }

    @Override
    public String toString() {
        return "Художественный отдел\n" + "Кол-во книг в отделе: " + countBooks +
                '\n';
    }
    @Override
    public String wholeInfo(){
        return "Художественный отдел\n" + "Кол-во книг в отделе: " + countBooks +
                "\nКниги: \n" + Arrays.toString(getBooks()) +
                '\n';
    }
    public static int getCountBooks() {
        countBooks = getCountBooks();
        return countBooks;
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        int year;
        String id, name, author;
        if (books.length == 0) {
            books = new Book[1];
            System.out.print("Введите ID книги: ");
            id = sc.nextLine();
            System.out.print("Введите название книги: ");
            name = sc.nextLine();
            System.out.print("Введите автора книги: ");
            author = sc.nextLine();
            System.out.print("Введите год выпуска: ");
            year = sc.nextInt();
            books[0] = new Book(id, name, author, year);
            countBooks++;
        } else {

            Book [] temp= new Book[books.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i]= books[i];
            }
            int n = books.length + 1;
            books = new Book[n];
            for (int i = 0; i < temp.length; i++) {
                books[i]= temp[i];
            }
            System.out.print("Введите ID книги: ");
            id = sc.nextLine();
            System.out.print("Введите название книги: ");
            name = sc.nextLine();
            System.out.print("Введите автора книги: ");
            author = sc.nextLine();
            System.out.print("Введите год выпуска: ");
            year = sc.nextInt();
            books[n - 1] = new Book(id, name, author, year);
            countBooks++;
        }

    }
}
