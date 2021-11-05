package com.pb.sukhov.hw6;

import java.util.Objects;

//..расширяющие его классы Dog, Cat, Horse.
 //        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
 //        Метод sleep, например, может выводить на консоль "Такое-то животное спит".
 //        Dog, Cat, Horse переопределяют методы makeNoise, eat.
 //        Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
 //        В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
public class Horse extends Animal {
     String horseName = "Мустанг";
     String horseBreed = "лошадь Пржевальского";
     int horseAge = 3;

     public static void eat(String text) {                                                       // Метод void вывод на экран
         System.out.println(text + " кушает ");
     }

     public void makeNoise() {                                                       // Метод void вывод на экран
         System.out.println(horseName + " шумит.");
     }

     public void horseBreed() { System.out.println(horseName + " породы " + horseBreed); }

     public void horseLocation() { System.out.println("Лошадь " + horseName + " находится в отделении № " + getLocation()); }

     @Override
     public String toString() {
         return "Horse{" +
                 "horseName='" + horseName + '\'' +
                 ", horseBreed='" + horseBreed + '\'' +
                 ", horseAge=" + horseAge +
                 '}';
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return horseAge == horse.horseAge && horseName.equals(horse.horseName) && horseBreed.equals(horse.horseBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horseName, horseBreed, horseAge);
    }
}
