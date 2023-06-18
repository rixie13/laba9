package org.example;

public interface Administarator {

    void findBook(Book book, User user);

    void issueBook(Book book, User user);
    void overdueNotification(User user);

}
