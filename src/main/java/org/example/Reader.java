package org.example;

public interface Reader {
    void read(Book book);

    void returnBook(Book book);

    void takeBook(Book book);
}
