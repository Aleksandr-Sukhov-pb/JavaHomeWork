package com.pb.sukhov.hw11;
//Создать в пакете hw11 консольное приложение "Телефонная книга".
//Каждый элемент должен иметь:
//ФИО
//дата рождения
//телефоны (количество не ограничено)
//адрес
//дата и время редактирования

//Обеспечить следующий функционал:
//добавление элемента
//удаление элемента
//поиск элементов
//вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
//редактирование элемента
//запись в файл всех данных
//загрузка из файла всех данных

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//import org.json.simple.JSONObject;

public class Main  {

     List<String> myBook = new ArrayList<>();



    public static void println(String text) {                               //Метод void println вывод на экран
        System.out.println(text);
    }

    public static void print(String text) {                                //Метод void print вывод на экран
        System.out.print(text);
    }




    public static void printMenu(){                                                         // 0. метод отображение меню
        println("");
        println(" 0. МЕНЮ НА ЭКРАН: ");
        println(" 1. Добавлнение элемента: ");
        println(" 2. Удаление элемента: ");
        println(" 3. Поиск элементов: ");
        println(" 4. Вывод всех записей (с сортировкой): ");
        println(" 5. Редактирование элемента: ");
        println(" 6. Запись в файл всех данных: ");
        println(" 7. Загрузка из файла всех данных: ");
        println(" 8. Выход из программы.");
        println("");
        println(" ВВЕДИТЕ НОМЕР МЕНЮ: ");
    }
    static boolean matches(String input, String regex) {                                              //Метод void сравнение строки
        boolean result = input.matches(regex);                                                        //с шаблоном
        return result;
    }
    public static void addElem(int index) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        // для работы с полями типа LocalDate
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);


        Scanner scan = new Scanner(System.in);
        println("Введите фамилию абонента: ");
        String lastName = scan.nextLine();
        println("Введите имя абонента: ");
        String firstName = scan.nextLine();
        println("Введите телефон: ");
        String phone = scan.nextLine();
        println("Введите адрес: ");
        String addres = scan.nextLine();
        println("Введите год рождения: ");
        int year = scan.nextInt();
        println("Введите месяц рождения: ");
        int month = scan.nextInt();
        println("Введите день рождения: ");
        int dayOfMonth = scan.nextInt();
       // String person="person";
       // String s="s";
       // String persons=person + s + index;
        List<Person> persons = Arrays.asList(
                new Person(index, lastName, firstName, phone, addres, LocalDate.of(year,month, dayOfMonth))
        );

        String personsJson = mapper.writeValueAsString(persons);
     //   JsonArray jArray = (JsonArray)  new JsonTokener(strJSON).nextValue();


        JSONObject jo = new JSONObject();
        JsonArray jo = new JsonArray();


    //    Concate JSONArray










     //   ja.put(personsJson);

        //   personsJson.add("sjdcfkljS");
        print(personsJson);
      //  List<String> myBook = Arrays.asList();

        //    myBook.add(personsJson);
          //  System.out.println(myBook);

       // Cat myCat = new Cat();
       // myBook.add(personsJson);


        //  personsJson.add("We add an element to ArrayList!");
       //

    }

    //   private static String personsJson(int i) {
    //  }

    private JSONArray concatArray(JSONArray... arrs)
            throws JSONException {
        JSONArray result = new JSONArray();
        for (JSONArray arr : arrs) {
            for (int i = 0; i < arr.length(); i++) {
                result.put(arr.get(i));
            }
        }
        return result;
    }



    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int currElem=0;


        println(" ___________________________________ ");
        println("|    << P H O N E    B O O K >>     |");
        println("|___________________________________|");
        printMenu();

        while (true)  {
            println("");
            String option = scan.nextLine();

            switch (option) {
                case "0": {
                    printMenu();
                    break;
                }
                case "1": {
                    print(" Добавление элемента: ");                                                           //  1. Добавленение элемента

                    addElem(currElem);
                  //  print(personsJson);

                    currElem++;
                    print(" Данные сохранены! ");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "2": {
                    println (" Удаление элемента: ");                                                        //   2. Удаление элемента

                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "3": {
                    println (" Поиск элементов: ");                                                            //  3. Поиск элементов

                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "4": {                                                                             //  4. Вывод всех записей (с сортировкой)
                    println("Вывод всех записей (с сортировкой): ");
                    //          println(book[]);
                    //   Arrays.sort(person);
                    //   String per = Person.toString();
                    //    println(Arrays.toString(person));

                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "5":{                                                                              //  5.  Редактирование элемента
                    println("Редактирование элемента: ");
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "6": {                                                                             //  6. Запись в файл всех данных
                    println("Запись в файл всех данных: ");
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "7": {                                                                             //   7. Загрузка из файла всех данных

                    println("загрузка из файла всех данных:");
                    println("");
                    println(" ВВЕДИТЕ НОМЕР МЕНЮ (меню на экран - 0): ");
                    break;
                }
                case "8": {
                    println("Выход!");

                    System.exit(0);

                }
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
    }

}