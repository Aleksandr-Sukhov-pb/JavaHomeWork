package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,

//- Skirt (юбка) реализует интерфейс WomenClothes,

//- Tie (галстук) реализует интерфейс ManClothes.

public class Skirt extends Clothes implements WomenClothes{


    public Skirt() {
        String type = "Юбка";
        String color = "Серый";
        String size = "M";
        String price = "625";

    }


    @Override
    public void dressWoman() {

    }
}
