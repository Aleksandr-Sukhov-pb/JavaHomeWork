package com.pb.sukhov.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static void print(String text) {                             // метод Вывод строки
        System.out.println(text);
    }

    static void print(char text) {                               // метод Вывод символа  (перегрузка метода print)
        System.out.print(text);
    }

    static void printUp(char text){                              // метод Вывод символа заглавным
        System.out.print(Character.toUpperCase(text));
    }


    static void upCase(String str){                              // метод преобразование и вывод первых букв строки заглавными
        char[] mas = str.toCharArray();                               // преобразование строки в массив
        boolean prob=true;
        for(int i = 0; i<mas.length; i++) {
            if (mas[i] == ' ') {                                  // ищем пробел
                prob = true;
                print(mas[i]);                                    // вызов метода print (из метода upCase)
            }
            else if ((mas[i] != ' ') && (prob==true)) {           // если нет пробела и перед этим символом был пробел или если "истина" (вдруг начало строки не с пробела)
                printUp(mas[i]);                                  // вызов метода printUP (из метода upCase)
                prob = false;
            } else print(mas[i]);                                 // вызов метода print (из метода upCase)
        }
    }


    public static void main(String[] args) {
        print("        <<Capital Letter>> ");
        print(" ________________________________ ");
        print("|  Программа для перевода первых |");
        print("| букв слов в верхний регистр    |");
        print("|________________________________|");
        Scanner scan = new Scanner(System.in);
            print("Введите строку: ");
        String str = scan.nextLine();                               // ввод строки
            print("Строка с преобразованием:");
        upCase(str);                                                //Вызов метода upCase

    }

}
