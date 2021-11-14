package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,

//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,

//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.

public class Pants extends Clothes{
    String type;

    {
        type = "Штаны";
    }

    private Pants(String size) {
        super("XS");
    }

    public Pants() {

    }

    public static Pants createPants(String size) {
        return new Pants(size);
    }

    private Pants(int price) {
        super(850);
    }

    public static Pants createPants(int price) {
        return new Pants(price);
    }

    String colour = "Blue";

}
