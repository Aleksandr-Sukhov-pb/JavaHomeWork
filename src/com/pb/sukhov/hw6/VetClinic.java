package com.pb.sukhov.hw6;
//Создайте класс VetСlinic в его методе main создайте массив типа Animal,
// в который запишите животных всех имеющихся у вас типов.

public class VetClinic {

    static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();


        Animal animal = new Animal();
        String animalName[] = new String[]{cat.catName, dog.dogName, horse.horseName};
        String animalBreed[] = new String[]{cat.catBreed, dog.dogBreed, horse.horseBreed};

        System.out.print("Имена животных, находящихся на лечении в вет. клинике: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(animalName[i]);
            if(i<2)
                System.out.print(", ");
            else System.out.print(".");
        }

        print("");
        System.out.print("Породы животных, находящихся на лечении в вет. клинике: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(animalBreed[i]);
            if(i<2)
                System.out.print(", ");
            else System.out.print(".");
        }

        cat.setLocation("Одесса, ул. Пушкинская, 8 ");
        print("");
        print("Имя животного: " + cat.catName);
        print("Адрес проживания кота: " + cat.getLocation());
        cat.sleep();

        dog.setLocation("Одесса, Приморский бульвар, 2");
        print("Кличка собаки: " + dog.dogName);
        print("Адрес проживания собаки: " + dog.getLocation());
        dog.makeNoise();


        horse.setLocation("Конюшня, Одесса, ул. б.Арнаутская, 22");
        print("Коня зовут: " + horse.horseName);
        print("Адрес проживания коня: " + horse.getLocation());
        horse.horseBreed();

        Veterinarian.treatAnimal();

        print("hash cat: " + cat.hashCode());
        print("hash dog: " + dog.hashCode());
        print("hash horse: " + horse.hashCode());
        print(cat.toString());
        System.out.println("[Hash cat: " + cat.hashCode() + "; hash dog: " + dog.hashCode() + "; hash horse: " + horse.hashCode() + "]");


    }




}