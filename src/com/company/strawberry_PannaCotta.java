package com.company;

class strawberry_PannaCotta extends PannaCotta {
    int strawberry = 600;
    int mint;
    int milk;
    int sugar_powder;
    int water;
    public strawberry_PannaCotta(String name, int prise) {
        super(name, prise);
        this.milk = 100;
        this.mint = 100;
        this.sugar_powder = 50;
        this.water = 50;
    }
}
