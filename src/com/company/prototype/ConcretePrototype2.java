package com.company.prototype;

public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() {
        return new ConcretePrototype2(id);
    }
}
