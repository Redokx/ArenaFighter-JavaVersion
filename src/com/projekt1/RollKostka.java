package com.projekt1;

import java.util.Random;

public class RollKostka {
    private Random random;
    private int liczbaOczek;

    public RollKostka() {
        liczbaOczek = 6;
        random = new Random();
    }

    public RollKostka(int liczbaOczek) {
        this.liczbaOczek = liczbaOczek;
        random = new Random();
    }

    public int getliczbaOczek() {
        return liczbaOczek;
    }

    public int roll() {
        return random.nextInt(liczbaOczek) + 1;
    }

    @Override
    public String toString() {
        return "Wyrzucił " + liczbaOczek + " ilość oczek na kostce";
    }

}
