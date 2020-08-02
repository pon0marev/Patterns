package com.company.factoryMethod;

public abstract class Developer {
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer(String name) {
        this.name = name;
    }


    abstract public House create();
}
