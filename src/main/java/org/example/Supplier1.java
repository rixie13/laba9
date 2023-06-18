package org.example;

public class Supplier1 implements Supplier, Reader{
    private String name;

    public Supplier1(String name){
        this.name = name;
    }

    @Override
    public void supply(Book book) {
        System.out.println("Библиотекарь "+Librarian1.getName()+" заказал книгу у поставщика "+this.name);
    }


    @Override
    public void read(Book book) {
        System.out.println("Читатель "+this.name+" читает книгу "+book.getName());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Читатель "+this.name+" возвращает книгу "+book.getName());
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Читатель "+this.name+" берет книгу "+book.getName()+" у администратора "+Administrator1.getName());
    }
}
