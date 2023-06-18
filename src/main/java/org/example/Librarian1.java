package org.example;

public class Librarian1 implements librarian, Administarator{
    private static String name;
    public Librarian1(String name){
        this.name = name;
    }

    @Override
    public void order(Book book) {
        System.out.println(this.name+" заказал книгу "+book.getName());
    }

    public static String getName() {
        return name;
    }

    @Override
    public void findBook(Book book, User user) {
        System.out.println("Книга "+book.getName()+" возвращена читателем "+user.getName());
    }


    @Override
    public void issueBook(Book book, User user) {
        System.out.println("Книга "+book.getName()+" выдана читателю "+user.getName()+" Библиотекарем "+this.name);
    }

    @Override
    public void overdueNotification(User user) {
        System.out.println("Пользователь "+user.getSurname()+" уведомлен и уволен");
    }
}
