package com.pb.sukhov.hw7;

//Создать пакет hw7 и в нем создать перечисление (enum) Size
// со значениями XXS, XS, S, M, L. Перечисление содержит метод getDescription(),
// возвращающий строку для XXS "Детский размер", для остальных "Взрослый размер".
// Так же перечисление должно иметь метод getEuroSize() возвращающий числовое значение (32, 34, 36, 38, 40)
// соответствующее каждому размеру. Создать конструктор принимающий на вход description и euroSize.

//import com.sun.org.apache.xpath.internal.operations.String;

public enum Size{

        XXS(32, "Детский размер"),
        XS(34, "Взрослый размер"),
        S(36, "Взрослый размер"),
        M(38, "Взрослый размер"),
        L(40, "Взрослый размер");

        private final int euroSize;

        private final String description;

        private Size(int euroSize, String description) {
            this.euroSize = euroSize;
            this.description = description;
        }

        public int getEuroSize() {
            return euroSize;
        }

        public String getDescription() {
            return description;
        }

}








