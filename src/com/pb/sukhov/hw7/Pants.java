package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,

//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,

//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.

class Pants extends Clothes implements ManClothes, WomenClothes{

    Pants(String type, String color, Size size, String price) {
        super(type, color, size, price);
    }

    @Override
    public void dressMan() {
        Atelier.print("Одежда для мужчины: " + type + ", " + getInfo());
    }

    @Override
    public void dressWomen() {
        Atelier.print("Одежда для женщины: " + type + ", " + getInfo());
    }
}
