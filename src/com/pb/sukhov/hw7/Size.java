package com.pb.sukhov.hw7;

//Создать пакет hw7 и в нем создать перечисление (enum) Size
// со значениями XXS, XS, S, M, L. Перечисление содержит метод getDescription(),
// возвращающий строку для XXS "Детский размер", для остальных "Взрослый размер".
// Так же перечисление должно иметь метод getEuroSize() возвращающий числовое значение (32, 34, 36, 38, 40)
// соответствующее каждому размеру. Создать конструктор принимающий на вход description и euroSize.

//import com.sun.org.apache.xpath.internal.operations.String;

public class Size{

        public int getEuroSize(String size){
                int sizeEu = 0;
                if (size == "XXS") {
                    sizeEu = 32;
                }
                else if (size == "XS"){
                    sizeEu = 34;
                }
                else if (size == "M") {
                    sizeEu = 36;
                }
                else if (size == "L") {
                    sizeEu = 38;
                }
                else if (size == "XL") {
                sizeEu = 40;
                }
                  return sizeEu;
        }


        public String getDescription(String size){
                String sizeChild;
                if (size == "XXS") {
                    sizeChild = "Детский размер";
                }
                    else { sizeChild = "Взрослый размер";
                }
                    return sizeChild;
        }


}

    //    enum sizeE {
    //        L,
    //        M,
    //        S,
    //        XS,
    //        XXS
    //   }



