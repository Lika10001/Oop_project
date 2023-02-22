package com.company;

enum syrup_type {
    CARAMEL,
    CHOCOLATE,
    STRAWBERRY,
    ERR_VAL
}

class Marshmallow extends Dish {

    syrup_type syrup;
    int water;
    int gelatin;
    int sugar;
    int vanilla;
    boolean coconut;

    public Marshmallow(String name, int prise, int water, int gelatin, int sugar, int vanilla, boolean coconut, String inp_syrup) {
        super(name, prise);
        this.water = water;
        this.gelatin = gelatin;
        this.sugar = sugar;
        this.vanilla = vanilla;
        switch(inp_syrup){
            case "caramel":
            case "Caramel":
                this.syrup = syrup_type.CARAMEL;
                break;
            case "chocolate":
            case "Chocolate":
                this.syrup = syrup_type.CHOCOLATE;
                break;
            case "strawberry":
            case "Strawberry":
                this.syrup = syrup_type.STRAWBERRY;
                break;
            default:
                this.syrup = syrup_type.ERR_VAL;
        }
    }
}
