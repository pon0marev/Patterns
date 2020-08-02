package com.company.factoryMethod;

public class WoodDeveloper extends Developer {

    public WoodDeveloper(String name) {
        super(name);
    }

    @Override
    public House create() {
        return new WoodHouse();
    }
}
