package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.

public abstract class Clothes {

    private String size;
    private String color;
    private String price;
    public String type;

    public Clothes(String type, String color, String size, String price) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;

    }


    public Clothes() {

    }


}
