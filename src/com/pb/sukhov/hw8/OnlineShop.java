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
                try {
                    boolean scanCheck = Auth.SignUp(login, password, confirmPassword);
                        if(scanCheck) scanChecker=false;
                    }
                catch (WrongLoginException ex) {
                    System.out.println("Код ошибки: " + ex.getMessage());
                }
                    loginSave = login;
                    passwordSave = password;
            }

                    print("Сохраняем логин и пароль!");

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
            try {
                boolean scanCheck = Auth.SignIn(login, loginSave, password, passwordSave);
                    if(scanCheck) scanChecker=false;
                }
            catch (WrongLoginException ex) {
                System.out.println("Код ошибки: " + ex.getMessage());
                    print("Введите заново логин/пароль:");
                }
            }

        print(" ___________________________________ ");
        print("|      << Вы зашли на сайт! >>      |");
        print("|___________________________________|");

    }

}

