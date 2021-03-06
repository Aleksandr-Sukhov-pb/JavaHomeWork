package com.pb.sukhov.hw8;

//WrongPasswordException и WrongLoginException - пользовательские классы исключения
// с двумя конструкторами – один по умолчанию, второй принимает сообщение и передает
// его в конструктор класса Exception.

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "Неверный ПАРОЛЬ";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "Исключение при неверном пароле: " + detail;
    }
}