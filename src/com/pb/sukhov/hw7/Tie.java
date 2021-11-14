package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,

//- Tie (галстук) реализует интерфейс ManClothes.

public class Tie extends Clothes{
    String type;

    {
        type = "Галстук";
    }

    private Tie(String size) {
        super("L");
    }

    public Tie() {

    }

    public static Tie createTie(String size) {
        return new Tie(size);
    }

    private Tie(int price) {
        super(120);
    }

    public static Tie createTie(int price) {
        return new Tie(price);
    }

    String colour = "Orange";


}
