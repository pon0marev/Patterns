package com.company.prototype;

public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() {
        return new ConcretePrototype1(id);
    }
}
