package com.company.singleton;

public  class Singleton {
    private static Singleton instance;
    private String name;

    public String getName() {
        return name;
    }

    public Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name){
        if(instance==null){
            return instance = new Singleton(name);
        }
        System.out.println("instance already done");
        return instance;

    }
}
