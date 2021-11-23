package com.pb.sukhov.hw8;

//Создать класс Auth, который содержит поля login и password и методы:
//
//- signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
//Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен
// содержать только латинские буквы и цифры. Если логин не соответствует требованиям
// нужно выбросить WrongLoginException.
//Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак
// подчеркивания. Также password и confirmPassword должны совпадать. Если password
// не соответствует требованиям нужно выбросить WrongPasswordException.
//Если проверки все пройдены успешно записать в свои поля значение login и password.
// Так сохраняем пользователя :)
//
//- signIn (вход на сайт) принимающий login и password.
//Проверяет что login и password соответствуют значениям из полей класса.
//Если нет - выбрасывает исключение WrongLoginException.
//
//WrongPasswordException и WrongLoginException - пользовательские классы исключения
// с двумя конструкторами – один по умолчанию, второй принимает сообщение
// и передает его в конструктор класса Exception

public class Auth {

    static boolean matches(String input, String regex) {                                                       //Метод void сравнение строки
        boolean result = input.matches(regex);                                                                 //с шаблоном
            return result;
    }

    public static Boolean SignUp (String log, String pass, String confPass) throws Exception {                                  //Метод проверка логина и паролей
        boolean rezSignUp;
        boolean loginCheck = matches(log, "^[A-Za-z0-9]\\w{5,20}");                                     //РЕГИСТРАЦИЯ
        boolean passwordCheck = matches(pass, "\\w{5,}");
        boolean confirmPasswordCheck = matches(confPass, "\\w{5,}");
        if ((loginCheck & passwordCheck & confirmPasswordCheck) & (pass.equals(confPass)))
            rezSignUp = true;                                                                                      //если все проверки пройдены - истина
        else {
            rezSignUp = false;
            throw new WrongLoginException("Введенный логин и пароль не соответствуют условиям, регистрация заново!");
              }
        if (rezSignUp)
            return true;                                                                                       //если все проверки пройдены - истина
        else
            return false;
    }

    public static Boolean SignIn(String log, String logSave, String pass, String passSave) throws Exception {   //Метод проверка логина и паролей
        boolean check = false;                                                                                  // ВХОД на сайт
        boolean loginCheck;
        boolean passwordCheck;
        if ((logSave).equals(log))
            loginCheck = true;
        else {
            loginCheck = false;
            throw new WrongLoginException("ЛОГИН/ПАРОЛЬ не корректные");                                       //Передача сообщение при исключении
        }

        if (passSave.equals(pass))
            passwordCheck = true;
        else {
            passwordCheck = false;
            throw new WrongPasswordException("ЛОГИН/ПАРОЛЬ не корректные");                                      //Передача сообщение при исключении
        }
        if (loginCheck & passwordCheck)
            return true;                                                                                       //если все проверки пройдены - истина
        else
            return false;
    }

}