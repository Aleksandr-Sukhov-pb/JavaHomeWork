package com.pb.sukhov.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NumBox  <T extends Number> {

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

    public String curNumElem() throws Exception {                               //метод текущее кол-во єлементов массива
        String mes=null;
        try {
            int index = 0;
            while (get(index) != null) {
                if (get(index) != null) {
                    index++;
                }
            }
        } catch (Exception ex) {
            mes = ex.getMessage();
        }
        return mes;
    }

    public double sumAverage() throws Exception {                              // метод среднее арифметическое
        double roundOff=0;
        double sumAverage;
        double sum=0;
        int index = 0;
        try {
            while (get(index) != null) {
                if (get(index) != null) {
                    sum = sum + get(index).intValue();                        // суммирование тек. значение + приведение типов
                    index++;
                }
            }
        } catch (Exception ex) {
            sumAverage = sum / index;
            roundOff = Math.round(sumAverage*100)/100D;                      // с точностью до 2-х знаков после запятой
        }
        return roundOff;
    }


    public int sumAll()throws Exception{                                     // метод сумма элементов
        int sumAll=0;
        int sum = 0;
        int index = 0;
        try {
            while (number.get(index) != null) {
                if (number.get(index) != null) {
                    sum = sum + get(index).intValue();                        // суммирование тек. значение + приведение типов
                    index++;
                }
            }
        } catch (Exception ex) {
            sumAll=sum;
        }
        return sumAll;
    }

    public int maxElem()throws Exception{                                   //  метод максимальный элемент
        int index=0;
        int indexMaxElem=0;
        int elemMax = 0;
        int elemCurrent = 0;
        try {
            while (number.get(index) != null) {
                elemCurrent=get(index).intValue();
                if (elemMax < elemCurrent) {
                    elemMax=elemCurrent;
                    indexMaxElem=index;
                    index++;
                }
                else index++;
            }
        } catch (Exception ex) {

        }
        return elemMax;
    }

}



