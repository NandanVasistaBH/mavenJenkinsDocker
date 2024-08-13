package com.telstra.app;

public class App{
    public String greetings(){
        return "Good Morning";
    }
    public static void main(String[] args){
        System.out.println(new App().greetings());
    }
}