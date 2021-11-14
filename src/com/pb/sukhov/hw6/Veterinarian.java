package com.pb.sukhov.hw6;
//Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
//        Пусть этот метод печатает на экран food и location пришедшего на прием животного.
//Объект класса Veterinarian создайте с помощью рефлексии.
public class Veterinarian {
    public static void treatAnimal(){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();

       VetClinic.print("");

        cat.setLocation("3");
        cat.catLocation();
        cat.setFood("Kitekat");
        cat.eat();

        dog.setLocation("12");
        dog.dogLocation();
        dog.setFood("Pedigree");
        dog.eat();

        horse.setLocation("2");
        horse.horseLocation();
        horse.setFood("Овес");
        horse.eat();

        Class clazz = horse.getClass();
        System.out.println("Рефлексия: " + clazz.getName());
    }

}








