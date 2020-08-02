package com.company.builder;

class WheatBreadBuilder extends BreadBuilder {
    public void SetFlour() {
        this.getBread().Flour = new Flour ("Пшеничная мука высший сорт") ;
    }

    public void SetSalt() {
        this.getBread().Salt = new Salt();
    }

    public void SetAdditives() {
        this.getBread().Additives = new Additives ("улучшитель хлебопекарный");
    }
}
