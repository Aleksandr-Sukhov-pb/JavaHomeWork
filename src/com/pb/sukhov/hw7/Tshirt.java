package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//Создать классы наследники Clothes:

//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,

//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.


public class Tshirt extends Clothes{

    String type;

    {
        type = "Футболка";
    }

    private Tshirt(String size) {
        super("XXS");
    }

    public Tshirt() {
        super();
    }

    public static Tshirt createTshirt(String size) {
        return new Tshirt(size);
    }

    private Tshirt(int price) {
        super(99);
    }

    public static Tshirt createTshirt(int price) {
        return new Tshirt(price);
    }

    String colour = "White";

}
