package com.pb.sukhov.hw4;

import java.util.Scanner;

import java.util.Arrays;

public class Anagram {

    static void print(String text){                                                       // Метод void вывод на экран
        System.out.println(text);
    }

    public static boolean anagrStrFunction(String str1, String str2) {                    //Блок метод сравнение строк (явл. ли анаграммами)

        String strOnePr = str1.replaceAll("[^A-Za-zА-Яа-я]", "");               // убираем знаки препинания, спец символы и цифры
        String strOnePrLow = strOnePr.toLowerCase();                                            // все прописными буквами
        char[] array1 = strOnePrLow.toCharArray();                                              // строку в => массив
        Arrays.sort(array1);                                                                    // сортировка массива

        String strTwoPr = str2.replaceAll("[^A-Za-zА-Яа-я]","");                // убираем знаки препинания, спец символы и цифры
        String strTwoPrLow = strTwoPr.toLowerCase();                                            // все прописными буквами
        char[] array2 = strTwoPrLow.toCharArray();                                              // строку в => массив
        Arrays.sort(array2);                                                                    // сортировка массива

            boolean equiv=false;
        if (array1.length!=array2.length)                                                       // сравниваем "размер" массивов
            equiv = false;
                   else {
            for(int n = 0; n<array1.length; n++ ){                                              //сравнение массивов посимвольно
                if (array1[n]!=array2[n]) {
                    equiv = false;
                    break;
                }
                else if (array1[n]==array2[n])
                    equiv =  true;
            }
        }
        return equiv;                                                                           //возвращаем ложь или истину
}

    public static void main(String[] args) {
        print("          << A N A G R A M >>        ");
        print(" ___________________________________ ");
        print("|  Программа для проверки, являются |");
        print("| ли строки анаграммами.            |");
        print("|___________________________________|");
            Scanner scan = new Scanner(System.in);
                 print("Введите первую строку:");
                    String strOne = scan.nextLine();
                 print("Введите вторую строку:");
                    String strTwo = scan.nextLine();

        boolean equival = anagrStrFunction(strOne, strTwo);
            if (!equival)                                                                        // проверка булевой переменной и вывод соотв. сообщения на экран
                print("Строки НЕ являются анаграммами!");
            else print("Строки являются анаграммами!");
    }
}