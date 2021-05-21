package com.company;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[0];
        ArtDep department = new ArtDep(books);
        department.addBook();
        System.out.println(department.wholeInfo());
    }
}
