package com.telstra.app;

public class App{
    public String greetings(){
        System.out.println("hello");
        return "good morning";
    }
    public static void main(String[] args){
        System.out.println(new App().greetings());
    }
}