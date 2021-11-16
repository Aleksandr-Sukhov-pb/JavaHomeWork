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

public class Atelier {


    public static void print(String text) {
        System.out.println(text);
    }

    private static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }

        public static void main (String[]args){

            print(" ___________________________________ ");
            print("|        << A T E L I E R >>        |");
            print("|___________________________________|");

            Clothes[] clothes = new Clothes[]{
                    new Tshirt("футболка", "белый", Size.L, "250"),
                    new Pants("штаны", "черный",Size.M, "750"),
                    new Skirt("юбка", "серый",Size.S, "375"),
                    new Tie("галстук", "синий", Size.XXS, "180")
            };

            dressMan(clothes);

            print("");

            dressWomen(clothes);
        }

}

