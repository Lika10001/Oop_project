package com.company;

class Dish {
    private String name;
    private int prise;

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }

    public Dish(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public void printInfo() {
        System.out.printf("%s, %d", name, prise);
    }
}
