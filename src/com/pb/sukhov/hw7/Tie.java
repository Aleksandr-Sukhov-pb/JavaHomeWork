package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,

//- Tie (галстук) реализует интерфейс ManClothes.

public class Tie extends Clothes implements ManClothes{

    public Tie() {
        String type = "Галстук";
        String color = "Синий";
        String size = "XS";
        String price = "180";

    }



    @Override
    public void dressMan() {

    }
}
