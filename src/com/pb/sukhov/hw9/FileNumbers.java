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

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileNumbers {

    public static void print(String text) {                                                  //Метод void вывод на экран
        System.out.println(text);
    }


    static int generation() {
        int gen = (int) (Math.random() * 100);
        return gen;
    }

    void createOddNumbersFile() {
        try (InputStream is = new FileInputStream("files/s01-input-text.txt")) {

            int available = is.available();
            byte[] buffer = new byte[available];
            int i = 0;

            int data = is.read();
            while (data != -1) {
                buffer[i] = (byte) data;
                data = is.read();
                i++;
            }

            System.out.println(new String(buffer));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    void createNumbersFile() throws IOException {
        //   String data = "This is a line of text inside the file.";

        int[] array = new int[200];

        for (int n = 0; n < 199; n++) {
            int gen = generation();
            //  int t=n;
            array[n] = gen;
            n++;
            array[n] = ' ';
            n++;
            if (n == 20 | n == 40 | n == 60 | n == 80 | n == 100 | n == 120 | n == 140 | n == 160 | n == 180) {
                array[n] = '\n';
            }
        }


        OutputStream os = null;
        try {
            os = new FileOutputStream("files/s01-output-text.txt");

            // Converts the string into bytes
            //     byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            //      os.write(dataBytes);
            System.out.println("Data is written to the file.");
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }


    //   int b = 37;
    //      os.write(b); // записывает в выходной поток один байт, который представлен целочисленным параметром b

//        os.flush(); // очищает буфер вывода, записывая все его содержимое


    //      byte[] masBytes = new byte[]{32, 0, 15, 12};
    //     os.write(masBytes); // записывает в выходной поток массив байтов buffer.


    //      byte[] buffer = new byte[]{32, 0, 15, 12, 1, 7, 78, 4};
    //      int offset = 2;
    //      int length = 3;
    //      os.write(buffer, offset, length); // записывает в выходной поток некоторое число байтов, равное length,
    //      // из массива buffer, начиная со смещения offset, то есть с элемента buffer[offset].

    //     os.close(); // закрывает поток


    public static void main(String[] args) throws Exception {
        print(" ___________________________________ ");
        print("|  << F I L E     N U M B E R S >>  |");
        print("|___________________________________|");

        int[] array = new int[101];

        for (int n = 0; n < 101;) {
            int gen = generation();
            //  int t=n;
            array[n] = gen;
            n++;
        }
        System.out.print(" Массив чисел: ");  // "блок" вывод массива экран
        for (int n = 0; n < 101; n++) {
            System.out.print(array[n] + " ");
            int m = n;
            if (m % 10 == 0)
                System.out.println(" ");
            //  System.out.print(array[n] + "/n");
        }
            File out = new File("src/com/pb/sukhov/hw9/text.txt");
            FileWriter fw = null;



            int s = 100;
            // Try block: Most stream operations may throw IO exception
            try {
                // Create file writer object
                fw = new FileWriter(out);
                // Wrap the writer with buffered streams
                BufferedWriter writer = new BufferedWriter(fw);
                int line;

                while (s > 0) {
                    // Randomize an integer and write it to the output file
                    line = generation();
                    writer.write(line + " ");
                  //  int m=s;
                    if (s % 10 == 0)
                        writer.write(line + "\r\n");

                    s--;
                }
                // Close the stream
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }



        }



