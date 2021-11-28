package com.pb.sukhov.hw10;


public class NumberException extends Exception {

    private String detail;

    public NumberException () {
        detail = "Ошибка";
    }

    public NumberException (String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "Исключение при ошибке: " + detail;
    }
}
