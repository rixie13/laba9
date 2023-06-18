package org.example;

public class User implements Reader{
    public String name;
    public String surname;
    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public void read(Book book) {
        System.out.println("Пользователь читает книгу "+book.getName());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Книга "+book.getName()+" возвращена");
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Пользователю "+this.name+" "+this.surname+" выдана администратором "+Administrator1.getName()+" книга "+book.getName());
    }
}
