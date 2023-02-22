package com.company;

class Tiramisu_Cake extends Biscuit_Cake {
    char coffee_beans;
    boolean rom;
    int mascarpone;
    int cookies;

    public Tiramisu_Cake(String name, int prise, boolean sprinkling) {
        super(name, prise, sprinkling);
        this.coffee_beans = '9';
        this.cookies = 16;
        this.mascarpone = 500;
        this.rom = true;
    }
}
