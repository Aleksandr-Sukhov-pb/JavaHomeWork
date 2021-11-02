package com.pb.sukhov.hw5;

import java.util.Scanner;

public class Book {
    private String title;                            // название книги
    private String author;                           // автор книги
    private int year;                                // год издания книги

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){

        return author;
    }

    public void setAuthor(String author){

        this.author = author;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }


}
