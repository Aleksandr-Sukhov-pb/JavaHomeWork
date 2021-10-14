package com.pb.sukhov.hw2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        System.out.println("<< I N T E R V A L >>");
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println(" Имеем диапазоны чисел: [0 -14] [15 - 35] [36 - 50] [51 - 100]");
        System.out.println(" Введите целое число: ");
        number = scan.nextInt();
        if ((number >= 0) & (number <= 14)) {
            System.out.println(" Введенное число находится в диапазоне числе от 0 до 14 (включительно)! ");
        } else if ((number >= 15) & (number <= 35)) {
            System.out.println(" Введенное число находится в диапазоне числе от 15 до 35 (включительно)! ");
        } else if ((number >= 36) & (number <= 50)) {
            System.out.println(" Введенное число находится в диапазоне числе от 36 до 50 (включительно)! ");
        }
        else if ((number >= 51) & (number <= 100)) {
            System.out.println(" Введенное число находится в диапазоне числе от 51 до 100 (включительно)! ");
        }
        else System.out.println(" Введенное число не попадает ни в один из промежутков! ");
        }
}
