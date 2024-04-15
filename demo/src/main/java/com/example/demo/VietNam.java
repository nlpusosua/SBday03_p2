package com.example.demo;

public class VietNam implements Greeting{

    @Override
    public void greet(String name) {
        System.out.println("xin chào "+ name);
    }
}
