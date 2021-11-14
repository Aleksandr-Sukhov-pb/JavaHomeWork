package com.pb.sukhov.hw7;

//Создать класс Atelier с методом main, и еще двумя статическими методами:
//dressMan(Clothes[] clothes)
//dressWomen(Clothes[] clothes)
//на вход которых будет поступать массив, содержащий все типы одежды.
//В методе main создать массив, содержащий все типы одежды,
// и вызвать методы dressMan и dressWomen передав туда этот массив.
//Метод dressWomen выводит на консоль всю информацию о женской одежде.
//Метод dressMan выводит на консоль всю информацию о мужской одежде.
//В методах dressWomen и dressMan использовать оператор instanceof
// для определения мужская это одежда или женская.
//
//По желанию можно использовать внутренние классы.

import java.util.Arrays;
import java.util.StringTokenizer;

public class Atelier {

   // private static Clothes[] collections;

    static void print(String text) {
        System.out.println(text);
    }


    public static void dressWoman(Clothes[] collectionAll){
        for (Clothes collection: collectionAll){
            if (collection instanceof Skirt){
                Skirt skirt= (Skirt) collection;
                print("Тип одежды:" + skirt.type);
                print("Размер: " + skirt.size);
                print("Цвет: " + skirt.colour);
                print("Цена: " );




            }

        }

    }


    public static void main(String[] args) {
        Clothes tshirt = new Tshirt();
        Clothes tie = new Tie();
        Clothes pants = new Pants();
        Clothes skirt = new Skirt();
            Clothes[] collectionAll = {tshirt, tie, pants, skirt};
                print("Мужская коллекция: ");
                   // dressMan(collectionAll);
                    print(" ");
                print("Женская коллекция: ");
                    dressWoman(collectionAll);


    }


}
