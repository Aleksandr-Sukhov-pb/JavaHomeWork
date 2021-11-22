package com.pb.sukhov.hw9;
//В пакете hw9 создать класс FileNumbers.
//В нем создать методы:

//- createNumbersFile - создает текстовый файл "numbers.txt"
// заполненный случайными целыми числами от 1 до 99.
// 10 строк и по 10 чисел в каждой строке. Числа разделять пробелами.
//
//- createOddNumbersFile - читает файл "numbers.txt", и создает
// на основе него новый файл "odd-numbers.txt" в который входят
// все числа из "numbers.txt" только все четные заменены на 0.
//
//В методе main продемонстрировать работу методов createNumbersFile и createOddNumbersFile.
//
//По желанию можно добавить логирование работы программы.

import java.io.*;

public class FileNumbers {

    public static void print(String text) {                                //Метод void вывод на экран
        System.out.println(text);
    }

    static int generation() {                                               //Метод генератор чисел от 1 до 99
        int gen = (int) (Math.random() * 100);
            if (gen<1) gen++;
                return gen;
    }

     public static int[] StringToMas(String str){                            //Метод конвертация строка в массив символов
            String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                numArr[i] = Integer.parseInt(strArr[i]);
          }
            return numArr;
    }

    static void createOddNumbersFile() throws IOException {                 //читаем файл, обрабатываем, записываем в новый
        String strOutFile = new String();
        try (InputStream is = new FileInputStream("C:/Users/km110/IdeaProjects/JavaHomeWork/src/com/pb/sukhov/hw9/numbers.txt")) {
            int available = is.available();
                byte[] buffer = new byte[available];
                    int i = 0;
            int data = is.read();
                while (data != -1) {
                    buffer[i] = (byte) data;
                data = is.read();
                    i++;
                }
            String strBuf = new String(buffer);
//                              System.out.println(strBuf);                   //Вывод на экран для проверки
            strOutFile = strBuf;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        String newString = strOutFile.replace('\n', ' ');      //заменяем переход на пробелы

        int[] arrTemp = new int[100];
        arrTemp = StringToMas(newString);                                     //вызов метода строка с пробелами в массив int


        int[] arrMasEven = new int[100];

        for (int i = arrTemp.length-1; i > 0;) {                            //блок разворот массива!!!
            for (int j = 0; j < arrTemp.length; j++) {
                arrMasEven[j] = arrTemp[i];
                i--;
            }
        }

        int[] arrMasEven2 = new int[100];

           int i = 100;                                                      //блок создаем новый массив с четными 0-ми
        while (i > 0) {
            if ((i-1) % 2 == 0) {
               arrMasEven2[i-1] = arrMasEven[i-1];
               i--;
           } else {
                arrMasEven2[i-1] = 0;
                i--;
            }
        }


        File out = new File("C:/Users/km110/IdeaProjects/JavaHomeWork/src/com/pb/sukhov/hw9/odd-numbers.txt");  //путь к файлу
        FileWriter fw = null;
        int s = 100;

        try {
            fw = new FileWriter(out);
            BufferedWriter writer = new BufferedWriter(fw);
            int line;

            while (s > 0) {
                line = arrMasEven2[s-1];
                if ((s-1) % 10 == 0){
                    writer.write(line + "\n");
                    s--;
                }
                else { writer.write(line + " ");
                    s--;
                }
            }
            writer.close();                                                     //закрываем поток
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createNumbersFile() throws IOException {
        int[] array = new int[100];
            int n=100;
                while (n > 0) {                                                    // создаем массив
            int gen = generation();                                        // вызываем метод сл. числа 1-99
                array[n-1] = gen;
            n--;
        }

        File out = new File("C:/Users/km110/IdeaProjects/JavaHomeWork/src/com/pb/sukhov/hw9/numbers.txt");  //путь к файлу
            FileWriter fw = null;
                int s = 100;
        try {
            fw = new FileWriter(out);
                BufferedWriter writer = new BufferedWriter(fw);
                    int line;
                while (s > 0) {
                    line = generation();
                       if ((s-1) % 10 == 0){
                    writer.write(line + "\n");
                    s--;
                }
                else { writer.write(line + " ");
                    s--;
                }
            }
            writer.close();                                                     //закрываем поток
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws Exception {
        print(" ___________________________________ ");
        print("|  << F I L E     N U M B E R S >>  |");
        print("|___________________________________|");

        createNumbersFile();
        createOddNumbersFile();
        System.exit(0);

    }

}

