package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,

//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,

//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.

public class Pants extends Clothes implements ManClothes{

    public Pants() {
        String type = "Штаны";
        String color = "Черный";
        String size = "XL";
        String price = "850";

    }


    @Override
    public void dressMan() {

    }
}
