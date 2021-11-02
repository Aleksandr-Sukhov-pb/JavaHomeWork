package com.pb.sukhov.hw5;

import java.util.Arrays;


public class Library {

    static void print(String text){                                                       // Метод void вывод на экран
        System.out.println(text);
    }

    static void allBook(String... text){
        System.out.print(Arrays.toString(text));
    }

    static void allRead(String... text){
        System.out.print(Arrays.toString(text));
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        book1.setAuthor("К.Маркс");
        book2.setAuthor("Ф.Энгельс");
        book3.setAuthor("В.И.Ленин");
        book4.setAuthor("Франке Г.В.");
        book5.setAuthor("Лем С.");
        book1.setTitle("Капитал");
        book2.setTitle("Положение рабочего класса в Англии");
        book3.setTitle("Развитие капитализма в России");
        book4.setTitle("Клетка для орхидей");
        book5.setTitle("Солярис");
        book1.setYear(1867);
        book2.setYear(1844);
        book3.setYear(1899);
        book4.setYear(1961);
        book5.setYear(1960);
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        reader1.fio = "Иванов И.И.";
        reader2.fio = "Петров П.П.";
        reader3.fio = "Сидоров С.С.";
        reader1.number = 101;
        reader2.number = 102;
        reader3.number = 103;
        reader1.faculty = "Электромеханический";
        reader2.faculty = "Экономический";
        reader3.faculty = "Менеджмента";
        reader1.date = "01.01.2001";
        reader2.date = "02.02.2002";
        reader3.date = "03.03.2003";
        reader1.telephone = 60512;
        reader2.telephone = 70713;
        reader3.telephone = 80814;


        print("          << L I B R A R Y >>        ");
        print(reader2.takeBook(3));                                            //  takeBook, который будет принимать количество взятых книг
        reader2.takeBook(book1.getTitle(), book2.getTitle(), book3.getTitle());          // takeBook, который будет принимать переменное количество названий книг.
        reader2.takeBook(book1, book2, book3);                                           // takeBook, который будет принимать переменное количество объектов класса Book.

        print(reader2.returnBook(3));
        reader2.returnBook(book2.getTitle(), book3.getTitle(), book5.getTitle());
        reader3.returnBook(book3, book4, book5);

//*******************************
//  Выполняются такие действия:
//  печатаются все книги.
//  печатаются все читатели.
//          ||
//         \  /
//          \/
        print("Список всех книг: ");
        allBook(book1.getTitle(), book2.getTitle(), book3.getTitle(), book4.getTitle(), book5.getTitle());

        print(" ");
        print("Все читатели: ");
        allRead(reader1.fio, reader2.fio, reader3.fio);



    }
}
