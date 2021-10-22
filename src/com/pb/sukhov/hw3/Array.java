package com.pb.sukhov.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("          <<   A R R A Y   >>   ");
        System.out.println("  _____________________________________  ");
        System.out.println(" | Введите целые числа для одномерного | ");
        System.out.println(" | массива размерностью 10 элементов   | ");
        System.out.println(" |_____________________________________| ");


        Scanner scan = new Scanner(System.in);  // "блок" ввод элементов массива
        int operMas;
        int[] array = new int[10];
        for (int n = 0; n < 10; n++) {
            System.out.print("Введите " + (n + 1) + "-й элемент массива: ");
            operMas = scan.nextInt();
            array[n] = operMas;
        }


        System.out.print(" Массив чисел: ");  // "блок" вывод массива экран
        for (int n = 0; n < 10; n++) {
            System.out.print(array[n] + " ");
        }


            int summ=0;
        for (int n=0; n<10; n++){              // "блок" подсчет суммы элементов массива
          summ = summ + array[n];
        }
        System.out.println("\n Сумма элементов массива = " + summ);


            int positive=0;             //"блок" кол-во положительных элеменетов
        for (int n=0; n<10; n++){
                     if (array[n]>0)
                positive=positive+1;
                else positive=positive;

        }
        System.out.print(" Количество положительных элементов в массиве: " + positive);


        boolean isSorted = false;       // "блок" сортировка массива
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int n = 0; n < array.length-1; n++) {
                if (array[n]>array[n+1]) {
                    isSorted = false;
                    buf = array[n];
                    array[n] = array[n + 1];
                    array[n + 1] = buf;
                }
            }
        }


            System.out.print("\n Отсортированный массив: ");   // "блок" вывод массива на экран
            for (int n = 0; n < 10; n++) {
                System.out.print(array[n] + " ");

            }

        }
    }





