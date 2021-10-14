package com.pb.sukhov.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("<< C A L C U L A T O R >>");
        double result;
        Scanner scan = new Scanner(System.in);
            double operand1;
            double operand2;
            String sign;
        System.out.println(" Введите первый операнд: ");
            operand1 = scan.nextDouble();
        System.out.println(" Введите второй операнд: ");
             operand2 = scan.nextDouble();
        System.out.println(" Введите арифметическую операцию ( + - * / ): ");
             sign = scan.next();

        switch (sign) {
            case "/": {
                if (operand2 != 0) {
                    result = (operand1 / operand2);
                    System.out.println(" Результат операции равен: " + result);
                } else System.out.println(" Деление на ноль запрещено! ");
            }
               break;
                case "+": {
                result = (operand1 + operand2);
                System.out.println(" Результат операции равен: " + result);
                }
                break;
            case "-": {
                result = (operand1 - operand2);
                System.out.println(" Результат операции равен: " + result);
            }
                break;
            case "*": {
                result = (operand1 * operand2);
                System.out.println(" Результат операции равен: " + result);
            }
                break;

            }

    }
}