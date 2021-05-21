package com.company;

public class Book {
    private String bookId;
    private String nameOfBook;
    private String nameOfAuthor;
    private int yearOfManufacture;

    public Book() {
    }

    public Book(String bookId, String nameOfBook, String nameOfAuthor, int yearOfManufacture) {
        this.bookId = bookId;
        this.nameOfBook = nameOfBook;
        this.nameOfAuthor = nameOfAuthor;
        if (yearOfManufacture > 2021)
            System.err.println("Вы из будущего?\n");
        else
            this.yearOfManufacture = yearOfManufacture;
    }

    public String getBookId() {
        return bookId;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "ID книги: " + bookId  + "\n Название книги: " + nameOfBook + "\n Автор книги: " + nameOfAuthor + "\n Год выпуска: " + yearOfManufacture +
                "\n\n";
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }
}
