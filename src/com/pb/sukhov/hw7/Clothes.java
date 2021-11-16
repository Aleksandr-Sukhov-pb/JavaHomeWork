package com.pb.sukhov.hw7;

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
//
//Создать классы наследники Clothes:
//- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
//- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
//- Skirt (юбка) реализует интерфейс WomenClothes,
//- Tie (галстук) реализует интерфейс ManClothes.

public abstract class Clothes {

    private Size size;
    private String color;
    private String price;
    protected String type;

    public Clothes(String type, String color, Size size, String price) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;

    }
    public Size getSize() {
        return size;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    public String getInfo() {
        return "размер " + size.name() + ", евро размер " + size.getEuroSize() + ", " + size.getDescription() +
                ", цвет " + color + ", цена " + price + ";";
    }

}
