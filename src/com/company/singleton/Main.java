package com.company.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance("123");
        System.out.println(singleton.getName());
        Singleton singleton1=Singleton.getInstance("456");
        System.out.println(singleton1.getName());
    }
}
