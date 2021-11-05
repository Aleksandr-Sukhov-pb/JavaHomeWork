package com.pb.sukhov.hw6;

import java.util.Objects;

//..расширяющие его классы Dog, Cat, Horse.
//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод sleep, например, может выводить на консоль "Такое-то животное спит".
//        Dog, Cat, Horse переопределяют методы makeNoise, eat.
//        Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
//        В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
public class Dog extends Animal{
    String dogName="Мухтар";
    String dogBreed="Немецкая овчарка";
    int dogAge=5;

    @Override
    public void eat() { System.out.println(dogName + " кушает " + getFood()); }

    @Override
    public void makeNoise() {                                                       // Метод void вывод на экран
        System.out.println(dogName + " шумит.");
    }

    public void dogBreed(){
        System.out.println(dogName + " породы " + dogBreed);
    }

    public void dogLocation() { System.out.println("Собака " + dogName + " находится в клетке № " + getLocation()); }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return dogAge == dog.dogAge && dogName.equals(dog.dogName) && dogBreed.equals(dog.dogBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dogName, dogBreed, dogAge);
    }
}




