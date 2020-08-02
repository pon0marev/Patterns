package com.company.builder;


class Bread
{
    // мука
    public Flour Flour ;
    // соль
    public Salt Salt ;
    // пищевые добавки
    public Additives Additives ;
    @Override
    public String toString()
{
    StringBuilder sb = new StringBuilder();

    if (Flour != null)
        sb.append(Flour.sort + "\n");
    if (Salt != null)
        sb.append("Соль \n");
    if (Additives != null)
        sb.append("Добавки: "+Additives.name+" \n");
    return sb.toString();
}
}

class Flour
{
    public Flour(String sort) {
        this.sort = sort;
    }

    // какого сорта мука
    public String sort ;
}
// соль
class Salt
{
    public String salt;
}
// пищевые добавки
class Additives
{
    public Additives(String name) {
        this.name = name;
    }

    public String name;
}

