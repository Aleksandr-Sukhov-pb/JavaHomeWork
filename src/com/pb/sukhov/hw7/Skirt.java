package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,

//- Skirt (юбка) реализует интерфейс WomenClothes,

//- Tie (галстук) реализует интерфейс ManClothes.

public class Skirt extends Clothes{

    public Skirt() {

    }

    String type;

    {
        type = "Юбка";
    }

    private Skirt(String size) {
        super("M");
    }


    public static Skirt createSkirt(String size) {
        return new Skirt(size);
    }


    private Skirt(int price) {
        super(350);
    }

    public static Skirt createSkirt(int price) {
        return new Skirt(price);
    }


    String colour = "Красный";


}
