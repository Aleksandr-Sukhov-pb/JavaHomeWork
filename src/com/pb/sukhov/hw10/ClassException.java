package com.pb.sukhov.hw10;

public class ClassException extends Exception {

        private String detail;

        public ClassException() {
            detail = "Ошибка";
        }

        public ClassException(String message) {
            super(message);
            detail = message;
        }

        @Override
        public String toString() {
            return "Исключение при ошибке: " + detail;
        }
}


