package com.company;

class Biscuit_Cake extends Dish {
    Biscuit classic_biscuit;
    int cream;
    int lemon_juice;
    int water;
    boolean sprinkling;

    public Biscuit_Cake(String name, int prise, boolean sprinkling) {
        super(name, prise);
        this.sprinkling = sprinkling;
        this.cream = 100;
        this.lemon_juice = 100;
        this.water = 40;
    }
}
