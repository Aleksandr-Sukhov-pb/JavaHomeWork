package com.pb.sukhov.hw10;
//Реализовать параметризованный класс NumBox, T - параметр типа.
//Параметром должен быть любой класс-наследник Number (задать необходимое условие при объявлении класса NumBox).
//Класс содержит:
//- массив из объектов класса T, инициализировать массив в конструкторе.
//- конструктор принимающий параметр - максимальную длину массива.
//- метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
//- метод T get(int index) возвращающий число по индексу.
//- метод int length() возвращает текущее количество элементов.
//- метод double average() - подсчет среднего арифметического среди элементов массива.
//- метод double sum() - сумма всех элементов массива.
//- метод T max() - максимальный элемент массива.
//При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
//
//Создать класс Main с методом main где протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>

import java.util.Scanner;

public class Main  {


    public static void println(String text) {                               //Метод void println вывод на экран
        System.out.println(text);
    }

    public static void print(String text) {                                //Метод void print вывод на экран
        System.out.print(text);
    }


    static int generation() {                                                              //Метод генератор чисел от 1 до 99
        int gen = (int) (Math.random() * 100);
        if (gen < 1) gen++;
        return gen;
    }

    public static void printMenu(){                                                         // 0. метод отображение меню
        println("");
        println(" 0. МЕНЮ НА ЭКРАН: ");
        println(" 1. Вывод массива на экран: ");
        println(" 2. Добавить число в массив. В случае если массив полон - выбросить исключение: ");
        println(" 3. Возвратить число по индексу: ");
        println(" 4. Возвращает текущее количество элементов: ");
        println(" 5. Подсчет среднего арифметического среди элементов массива: ");
        println(" 6. Сумма всех элементов массива: ");
        println(" 7. Максимальный элемент массива: ");
        println(" 8. Выход из программы.");
        println("");
        println(" ВВЕДИТЕ НОМЕР МЕНЮ: ");
    }
    static boolean matches(String input, String regex) {                                              //Метод void сравнение строки
        boolean result = input.matches(regex);                                                        //с шаблоном
        return result;
    }

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        println(" ___________________________________ ");
        println("|      << N u m    B o x >>         |");
        println("|___________________________________|");

        NumBox<Integer> number = new NumBox<>();
        println("Введите кол-во элементов массива: ");
        int elem;
        elem = scan.nextInt();
        println("Заполняем массив случайными числами от 1 до 99...");
        int operMas;
        for (int n = 0; n < elem; n++) {
            operMas = generation();
            number.add(operMas);                                                                       // вызов метода добавляющий число в массив
        }
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
                    print(" Массив чисел: ");                                                           //  1. вывод массива экран
                    number.forEach(t-> System.out.print(t + " "));
                    println(" ");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "2": {
                    println (" Добавляем число в массив. Введите число: ");                             //   2. добавляем число в массив
                    operMas=scan.nextInt();
                    number.add(operMas);
                    elem++;
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "3": {
                    println (" Возвратить число по индексу. Введите индекс: ");                         //  3. возврат числа по индексу
                    operMas=scan.nextInt();
                    int indexMas=number.get(operMas);
                    System.out.println("Элемент массива с индексом[" + operMas +"]: " + indexMas);
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "4": {                                                                             //  4. текущее кол-во єлементов массива
                    String mes = number.curNumElem();
                    println("Текущее количество элементов массива: " + mes);
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "5":{                                                                              //  5.  среднее арифметическое массива
                    double roundOff=number.sumAverage();
                    println("Среднее арифметическое массива: " + roundOff);
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "6": {                                                                             //  6. сумма всех элементов массива
                    int sumAll = number.sumAll();
                    println("Сумма всех элементов массива: " + sumAll);
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "7": {                                                                             //   7. максимальный элемент массива
                    int elemMax = number.maxElem();
                    println("Максимальный элемент массива:" + elemMax);
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


