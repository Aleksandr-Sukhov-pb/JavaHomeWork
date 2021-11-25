package com.pb.sukhov.hw10;
import java.util.Scanner;


public class Main {


    public static void print(String text) {                                //Метод void вывод на экран
        System.out.println(text);
    }

    static int generation() {                                               //Метод генератор чисел от 1 до 99
        int gen = (int) (Math.random() * 100);
        if (gen < 1) gen++;
        return gen;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        print(" ___________________________________ ");
        print("|      << N u m    B o x >>         |");
        print("|___________________________________|");

        NumBox<Integer> number = new NumBox<>();

        print("Введите кол-во элементов массива (4-100: ");

        int elem;
        elem = scan.nextInt();

        int operMas;
       // int[] array = new int[elem];

        for (int n = 0; n < elem; n++) {
            operMas = generation();
            number.add(operMas);
        }

        System.out.print(" Массив чисел: ");  // "блок" вывод массива экран
        for (int n = 0; n < elem; n++) {
            System.out.print(number.get(n) + " ");
        }








        //  number.add(new []masInt);
                try{
                    number.add(2);
                    number.get(2);

                }
                catch (Exception ex){
                    ex.printStackTrace();
                }


      //  System.exit(0);






        while (true) {
            System.out.println();
            System.out.println("Введите номер меню: ");
            System.out.println("1. Sign up as new user");
            System.out.println("2. Sign in");
            System.out.println("3. Exit");

            String option = scan.nextLine();

            switch (option) {
                case "1":
                    System.out.println(number.get(1));
                    //         signUp(scan, auth);
                    break;
                case "2":
                    print("2");
                    //         signIn(scan, auth);
                    break;
                case "3":
                    print("3");
                    //       System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Введите номер меню: ");
            }
        }
    }

}
