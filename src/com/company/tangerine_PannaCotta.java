package com.company;

class tangerine_PannaCotta extends PannaCotta {
    tangerine_jelly jelly;
    int water;
    boolean chocolate;
    public tangerine_PannaCotta(String name, int prise) {
        super(name, prise);
        this.water = 50;
        this.chocolate = true;
    }
}
