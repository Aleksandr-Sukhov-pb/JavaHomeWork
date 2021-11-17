package com.pb.sukhov.hw8;

//WrongPasswordException и WrongLoginException - пользовательские классы исключения
// с двумя конструкторами – один по умолчанию, второй принимает сообщение и передает
// его в конструктор класса Exception.

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
        detail = "Неверный логин";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "Исключение при неверном логине: " + detail;
    }
}