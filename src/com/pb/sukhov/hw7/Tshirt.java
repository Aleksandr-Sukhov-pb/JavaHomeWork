package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:

//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,

//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.


public class Tshirt extends Clothes implements ManClothes{

    public Tshirt() {
        String type = "Футболка";
        String color = "Белый";
        String size = "XXL";
        String price = "250";
    }




    @Override
    public void dressMan() {

    }
}
