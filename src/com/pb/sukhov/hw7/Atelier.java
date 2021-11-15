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


    static String toStr(String type, String size, String color, String price) {
        //переопределите данный метод по вашему усмотрению, чтобы получать корректный вывод в консоль
        return "Одежда{ тип:" + type +"размер: " + size + ", цвет: " + color + ", цена: " + price +  "}";
    }


    static void print(String text) {
        System.out.println(text);
    }


    public static void dressWoman(Clothes[] collectionAll){
        for (Clothes collection: collectionAll){
            if (collection instanceof WomenClothes){
                Skirt skirt= (Skirt) collection;
               //       print("Тип одежды:" + collection.type);
           //     print("Размер: " + size);
               // print("Цвет: " + skirt.colour);
               // print("Цена: " );



            }

        }

    }

    static void dressMan (Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes collection: clothes) {
            if (collection instanceof ManClothes) {
                System.out.println("Мужская одежда:");
                 ((ManClothes) collection).dressMan();
            }
        }
    }




    public static void main(String[] args) {
               
         Skirt skirt = new Skirt();
         Tshirt tshirt = new Tshirt();
         Tie tie = new Tie();
         Pants pants = new Pants();

            Clothes[] clothes = {tshirt, tie, pants, skirt};
                print("Мужская коллекция: ");
              //      dressMan(clothes);
                    print(" ");
                print("Женская коллекция: ");
               //     dressWoman(clothes);
              //  print(Skirt.type);
        //System.out.println(price);

    }


}
