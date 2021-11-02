package com.pb.sukhov.hw5;

public class Reader<readTitle> {
    String fio;                                      // ФИО
    int number;                                      // Номер читательского билета
    String faculty;                                  // Факультет
    String date;                                        // Дата рождения
    int telephone;                                   // Телефон


    String takeBook(int countBook) {
        if (countBook == 1)                                                                   // - takeBook, который будет принимать количество взятых книг
            return "[" + fio + " взял " + countBook + " книгу]";                              // Выводит на консоль сообщение
        else if ((countBook >= 2) & (countBook <= 4))                                        // "Петров В. В. взял 3 книги"
            return "[" + fio + " взял " + countBook + " книги]";
        else
            return "[" + fio + " взял " + countBook + " книг]";
    }

    public void takeBook(String... books) {                                                     // takeBook, который будет принимать переменное количество названий книг.
        System.out.print("[" + this.fio + " взял следующие книги: ");                           // Выводит на консоль сообщение
        for (String book : books) {                                                             // "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
            System.out.print(book);
            System.out.print("; ");
        }
        System.out.println("]");
    }

    public void takeBook(Book... books) {                                                                  // takeBook, который будет принимать переменное количество объектов класса Book.
        System.out.print(this.fio + " взял следующие книги: ");                                            // Выводит на консоль сообщение
        for (Book book : books) {                                                                          //"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
            System.out.print(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear() + "; ");
        }
        System.out.println();
    }
//*******************************************
// Аналогичным образом перегрузить метод returnBook()
// Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
//            - "Петров В. В. вернул 3 книги"
//            - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//           - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
//                    ||
//                   \  /
//                    \/

    String returnBook(int countBook) {
        if (countBook == 1)
            return "[" + fio + " вернул " + countBook + " книгу]";
        else if ((countBook >= 2) & (countBook <= 4))
            return "[" + fio + " вернул " + countBook + " книги]";
        else
            return "[" + fio + " вернул " + countBook + " книг]";
    }


    public void returnBook(String... books) {
        System.out.print("[" + this.fio + " вернул следующие книги: ");
        for (String book : books) {
            System.out.print(book);
            System.out.print("; ");
        }
        System.out.println("]");
    }

    public void returnBook(Book... books) {
        System.out.print(this.fio + " вернул следующие книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear() + "; ");
        }
        System.out.println();
    }



}



















