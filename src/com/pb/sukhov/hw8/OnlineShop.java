package com.pb.sukhov.hw8;

//Создать класс OnlineShop с методом main.
//В main создать один объект класса Auth.
//Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
//Обработать исключения методов signUp signIn с помощью блоков try-catch.

import java.util.Scanner;

public class OnlineShop {

    static void print(String text) {
        System.out.println(text);
    }

    public static String scanString() {                                                     //Метод ввод текста
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        return string;
    }



    public static void main(String[] args) throws Exception {
       //  public Auth() throws Exception {

            print(" ___________________________________ ");
            print("|   << O n l i n e    S h o p >>    |");
            print("|___________________________________|");
            String loginSave = null;
            String passwordSave = null;
            String password;
            String confirmPassword;
            String login;
            boolean scanChecker = true;
            while (scanChecker) {
                print("Введите ЛОГИН (a-z A-Z 5-20): ");
                login = scanString();
                print("Введите ПАРОЛЬ (a-z A-Z _ 5+): ");
                password = scanString();
                print("Введите ПАРОЛЬ повторно (a-z A-Z _ 5+): ");
                confirmPassword = scanString();
                boolean scanCheck = Auth.SignUp(login, password, confirmPassword);
                scanChecker = !scanCheck;
                if (!scanCheck)
                    print("Введенный логин и пароль не соответствуют условиям, регистрация заново!");
                else {
                    print("Сохраняем логин и пароль!");
                    loginSave = login;
                    passwordSave = password;
                    break;
                }
            }
            print("Регистрация прошла успешно!");
            print(" ___________________________________ ");
            print("|       << Вход на сайт: >>         |");
            print("|___________________________________|");

            scanChecker = true;
            while (scanChecker) {
                print("Введите ЛОГИН: ");
                login = scanString();
                print("Введите ПАРОЛЬ: ");
                password = scanString();
                boolean scanCheck = Auth.SignIn(login, loginSave, password, passwordSave);
                print(" ___________________________________ ");
                print("|      << Вы зашли на сайт! >>      |");
                print("|___________________________________|");
                break;


                // new Auth();
            }
        }
}


