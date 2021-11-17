package com.pb.sukhov.hw8;

//Создать класс OnlineShop с методом main.
//В main создать один объект класса Auth.
//Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
//Обработать исключения методов signUp signIn с помощью блоков try-catch.

public class OnlineShop {

    static void print(String text){
        System.out.println(text);
    }

    public static void main(String[] args) {
        print(" ___________________________________ ");
        print("|   << O n l i n e    S h o p >>    |");
        print("|___________________________________|");


        new Auth();





    }
}

