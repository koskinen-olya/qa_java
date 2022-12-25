package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    private Feline feline;
    public Feline(Feline feline){
        this.feline = feline;
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return feline.getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return feline.getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
