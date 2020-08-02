package com.company.myTest;

public class TestClass {
    public TestClass() {
    }

    public void action(){
        TestInterface testInterface= new TestInterface() {
            @Override
            public void printMessage() {

            }
        };
        testInterface.printMessage();
    }

    public class ImplementsInterface {

    }
}
