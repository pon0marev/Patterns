package com.company.builder;

public abstract class BreadBuilder {


    private Bread bread;
    public void CreateBread()
    {
        bread = new Bread();
    }
    public abstract void SetFlour();
    public abstract void SetSalt();
    public abstract void SetAdditives();
    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }
}
