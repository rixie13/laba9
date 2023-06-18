package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Мёртвые души", "Николай Васильевич Гоголь");
        Librarian1 librarian1 = new Librarian1("Петров Максим");
        Administrator1 administrator1 = new Administrator1("Иванов Сергей");
        User user1 = new User("Мария","Морозова");
        Supplier1 supplier1 = new Supplier1("Пам");


        librarian1.issueBook(book, user1);
        supplier1.supply(book);
        librarian1.overdueNotification(user1);
    }
}