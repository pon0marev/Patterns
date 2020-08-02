package com.company.builder;

class RyeBreadBuilder extends BreadBuilder {
    public void SetFlour() {
        this.getBread().Flour = new Flour ("Ржаная мука 1 сорт" ) ;
    }

    public void SetSalt() {
        this.getBread().Salt = new Salt();
    }

    public void SetAdditives() {
        // не используется
    }
}