package com.pb.sukhov.hw10;

//Реализовать параметризованный класс NumBox, T - параметр типа.
//Параметром должен быть любой класс-наследник Number (задать необходимое условие при объявлении класса NumBox).
//Класс содержит:
//- массив из объектов класса T, инициализировать массив в конструкторе.
//- конструктор принимающий параметр - максимальную длину массива.
//- метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
//- метод T get(int index) возвращающий число по индексу.
//- метод int length() возвращает текущее количество элементов.
//- метод double average() - подсчет среднего арифметического среди элементов массива.
//- метод double sum() - сумма всех элементов массива.
//- метод T max() - максимальный элемент массива.
//При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
//
//Создать класс Main с методом main где протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>



import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NumBox <T extends Number> {

    private final List<T> number;

    public NumBox() {
        number = new ArrayList<>();
    }

    public void add(T t) {
        number.add(t);
    }

    public T get(int index) {
        return number.get(index);
    }

    public void addAll(List<T> list) {
        number.addAll(list);
    }

    public void forEach(Consumer<T> consumer) {
        for (T numbers : number) {
            consumer.accept(numbers);
        }
    }
//    int[] ints = {1, 2, 3};
//    List<Integer> intList = new ArrayList<Integer>(ints.length);
// for (int i : ints)
//    {
//        intList.add(i);
//    }



}



