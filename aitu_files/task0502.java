//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//        ФИО,
//        номер читательского билета,
//        факультет,
//        дата рождения,
//        телефон.
//        Методы takeBook(), returnBook().
//        Разработать программу, в которой создается массив объектов данного класса.
//        Перегрузить методы takeBook(), returnBook():

//        - takeBook, который будет принимать количество взятых книг.
//        Выводит на консоль сообщение "Петров В. В. взял 3 книги".

//        - takeBook, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

//        - takeBook, который будет принимать переменное количество объектов класса Book
//        (создать новый класс, содержащий имя и автора книги).
//
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        Аналогичным образом перегрузить метод returnBook().
//
//        Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//        Или  "Петров В. В. вернул 3 книги".
//
//        Add try\catch in the cases when arguments will be some different types.

package Bek.aitu_files;

import java.time.LocalDate;

public class task0502 {

}
    abstract class Reader{
    private String name, ticket, faculty, telephone, birthDate;
    abstract protected void takeBook();
    abstract protected void readBook();
    Reader(String name,String ticket,String faculty,String telephone,String birthDate){
        this.name = name;
        this.ticket = ticket;
        this.faculty = faculty;
        this.telephone = telephone;
        this.birthDate = birthDate;
    }
    }

