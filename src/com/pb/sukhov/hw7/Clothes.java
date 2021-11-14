package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.

public abstract class Clothes {


    public Clothes(String size) {
        size = size;
    }

    protected String size;

    public Clothes(int price) {
        this.price = price;
    }

    private int price;


    protected String colour;


    public Clothes() {

    }
    public String type;
}
