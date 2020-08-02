package com.company.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Developer dev1=new PanelDeveloper("PanelDev");
        House h1= dev1.create();
        h1.build();
        Developer dev2=new WoodDeveloper("WoodDev");
        House h2= dev2 .create();
        h2.build();
    }
}
