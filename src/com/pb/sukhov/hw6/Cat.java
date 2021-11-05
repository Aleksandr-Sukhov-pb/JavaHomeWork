package com.pb.sukhov.hw6;

import java.util.Objects;

//..расширяющие его классы Dog, Cat, Horse.
//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод sleep, например, может выводить на консоль "Такое-то животное спит".
//        Dog, Cat, Horse переопределяют методы makeNoise, eat.
//        Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
//        В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
public class Cat extends Animal{
    String catName="Вася";
    String catBreed="Ангорская кошка";
    int catAge=2;

    @Override
    public void makeNoise() { System.out.println(catName + " шумит."); }

    @Override
    public void eat() {                                                       // Метод void вывод на экран
        System.out.println(catName + " кушает "+ getFood());
    }

    public void catBreed(){
        System.out.println(catName + " породы " + catBreed);
    }

    public void catLocation() { System.out.println("Кот " + catName + " находится в клетке № " + getLocation()); }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catBreed='" + catBreed + '\'' +
                ", catAge=" + catAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return catAge == cat.catAge && catName.equals(cat.catName) && catBreed.equals(cat.catBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catName, catBreed, catAge);
    }
}

