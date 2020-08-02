package com.company.prototype;

public abstract class Prototype {
    protected String id;

    public Prototype(String id) {
        this.id = id;
    }

    public abstract Prototype Clone();
}
