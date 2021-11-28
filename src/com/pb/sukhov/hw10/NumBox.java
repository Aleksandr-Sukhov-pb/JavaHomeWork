package com.pb.sukhov.hw10;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NumBox <T extends Number>  {

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
}



