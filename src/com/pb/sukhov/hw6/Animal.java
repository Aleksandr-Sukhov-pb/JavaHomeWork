package com.pb.sukhov.hw6;

import java.util.Objects;

//Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод sleep, например, может выводить на консоль "Такое-то животное спит".
public class Animal {

    private String food;
    private String location;

    public String getFood() { return food; }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void makeNoise() { System.out.println("Животное шумит."); }

    public void eat() {                                                       // Метод void вывод на экран
        System.out.println("Животное кушает.");
    }

    public void sleep() {                                                       // Метод void вывод на экран
        System.out.println("Животное спит." );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return food.equals(animal.food) && location.equals(animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }
}

