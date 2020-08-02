package com.company.builder;

public class Main {
    public static void main(String[] args) {
        Baker baker = new Baker();
        // создаем билдер для ржаного хлеба
        BreadBuilder builder = new RyeBreadBuilder();
        // выпекаем
        Bread ryeBread = baker.Bake(builder);
        System.out.println(ryeBread.toString());
        // оздаем билдер для пшеничного хлеба
        builder = new WheatBreadBuilder();
        Bread wheatBread = baker.Bake(builder);
        System.out.println(wheatBread.toString());
    }
}
