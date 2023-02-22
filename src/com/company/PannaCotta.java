package com.company;

class PannaCotta extends Dish {
    int gelatin;
    int sugar;
    int cream;
    int vanilla_Sugar;

    public PannaCotta(String name, int prise) {
        super(name, prise);
        this.cream = 89;
        this.sugar = 100;
        this.gelatin = 11;
        this.vanilla_Sugar = 1;
    }
}
