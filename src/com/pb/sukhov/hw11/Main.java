package com.pb.sukhov.hw11;

//Создать в пакете hw11 консольное приложение "Телефонная книга".
//Каждый элемент должен иметь:
//ФИО
//дата рождения
//телефоны (количество не ограничено)
//адрес
//дата и время редактирования
//
//Обеспечить следующий функционал:
//добавление элемента
//удаление элемента
//поиск элементов
//вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
//редактирование элемента
//запись в файл всех данных
//загрузка из файла всех данных


import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class Main  {


    public static void println(String text) {                               //Метод void println вывод на экран
        System.out.println(text);
    }

    public static void print(String text) {                                //Метод void print вывод на экран
        System.out.print(text);
    }

    public static void printMenu(){                                                         // 0. метод отображение меню
        println("");
        println(" 0. МЕНЮ НА ЭКРАН: ");
        println(" 1. Добавление элемента: ");
        println(" 2. Удаление элемента: ");
        println(" 3. Поиск элементов: ");
        println(" 4. Вывод всех записей с сортировкой по указанному полю: ");
        println(" 5. Редактирование элемента: ");
        println(" 6. Запись в файл всех данных: ");
        println(" 7. Загрузка из файла всех данных: ");
        println(" 8. Выход из программы.");
        println("");
        println(" ВВЕДИТЕ НОМЕР МЕНЮ: ");
    }
    static boolean matches(String input, String regex) {                                              //Метод void сравнение строки
        boolean result = input.matches(regex);                                                        //с шаблоном
        return result;
    }

        public static void addElem() {
            Scanner scan = new Scanner(System.in);
            println("Введите фамилию абонента: ");
                String lastName = scan.nextLine();
            println("Введите имя абонента: ");
                String firstName = scan.nextLine();
            println("Введите телефон: ");
                String phone = scan.nextLine();
            println("Введите адрес: ");
                String addres = scan.nextLine();
        }


    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        println(" ___________________________________ ");
        println("|     << P H O N E    B O O K >>    |");
        println("|___________________________________|");

        ObjectMapper objectMapper = new ObjectMapper();

        int elem;
        elem = scan.nextInt();

        println("Массив сформирован!");
        printMenu();

        while (true)  {
            println("");
            String option = scan.nextLine();

            switch (option) {
                case "0": {
                    printMenu();
                    break;
                }
                case "1": {
                    print(" Добавление элементов: ");
                    addElem();
                    //Каждый элемент должен иметь:
//ФИО
//дата рождения
//телефоны (количество не ограничено)
//адрес
//дата и время редактирования





                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "2": {
                    println (" Добавляем число в массив. Введите число: ");                             //   2. добавляем число в массив

                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "3": {
                    println (" Возвратить число по индексу. Введите индекс: ");                         //  3. возврат числа по индексу

                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "4": {                                                                             //  4. текущее кол-во єлементов массива

                    println("Текущее количество элементов массива: " );
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "5":{                                                                              //  5.  среднее арифметическое массива


                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "6": {                                                                             //  6. сумма всех элементов массива

                    println("Сумма всех элементов массива: " );
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "7": {                                                                             //   7. максимальный элемент массива

                    println("Максимальный элемент массива:" );
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "8": {
                    println("Выход!");

                    System.exit(0);

                }
            }
        }
    }

}


