package com.pb.sukhov.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("   <<   Games B I N G O   >>   ");
        System.out.println(" ___________________________________ ");
        System.out.println("| Я загадаю целое число от 0 до 100 |");
        System.out.println("| а Вы попробуйте отгадать :-)      |");
        System.out.println("| Для выхода досрочно введите '111' |");
        System.out.println("|___________________________________|");
            int gen = (int) ( Math.random() *100 );
        // System.out.println(gen);  // Проверяем, что загадал рандом
            Scanner scan = new Scanner(System.in);
            int proba=101; // инициализация переменной, первичное значение не важно, но не входит в искомый диапазон
            int counter = 0;
            while (gen!=proba)
            {
                System.out.println("Введите число:");
                proba = scan.nextInt();
                counter++;
              //  System.out.println(proba); // временно для вывода  загаданной переменной
                if (proba==111) {
                    System.out.println("Вы решили прекратить игру?");
                    break;
                }
                else if (proba>gen)
                    System.out.println("Загаданное мною число меньше Вашего!");
                else if (proba<gen)
                    System.out.println("Загаданное мною число больше Вашего!");


            }
                if (proba == gen) {
                    System.out.println("Поздравляем, Вы угадали число " + gen);
                    System.out.println("Количество попыток: " + counter);
                }else
                        System.out.println("Вы проиграли. Загаданное мною число было: " + gen + " , количество попыток: " + (counter-1));
    }
}
