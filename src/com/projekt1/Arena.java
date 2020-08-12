package com.projekt1;

public class Arena {
    private Gracz gracz1;
    private Gracz gracz2;
    private RollKostka kostka;

    public Arena(Gracz gracz1, Gracz gracz2, RollKostka kostka) {
        this.gracz1 = gracz1;
        this.gracz2 = gracz2;
        this.kostka = kostka;
    }

    private void renderuj() {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-");
        System.out.println("Zdrowie graczy: \n");
        System.out.println(gracz1 + " " + gracz1.hitPoints + "HP");
        System.out.println(gracz1 + " ma jeszcze " + gracz1.staminaPoints + " staminy" );
        System.out.println("");
        System.out.println(gracz2 + " " + gracz2.hitPoints + "HP");
        System.out.println(gracz1 + " ma jeszcze " + gracz2.staminaPoints + " staminy" );
        System.out.println();
    }

    private void printuj(String message) {
        System.out.println(message);
        try {
            Thread.sleep(450);
        } catch (InterruptedException ex) {
            System.err.println("Nie można uśpić");
        }
    }

    public void fight() {

        Gracz g1 = gracz1;
        Gracz g2 = gracz2;

        System.out.println("Walka pomiędzy " + gracz1 + " oraz " + gracz2 + "! \n");
        // zamiana graczy
        boolean gracz2Starts = (kostka.roll() <= kostka.getliczbaOczek() / 2);
        if (gracz2Starts) {
            g1 = gracz2;
            g2 = gracz1;
        }

        System.out.println(g1 + " Zaczyna jako pierwszy! \n");
        // pętla walki

        while (g1.alive() && g2.alive()) {
            g1.BasicAttack( g2);
            renderuj();
            printuj(g1.getLastMessage()); // attack message
            printuj(g2.getLastMessage()); // defense message
            if (g2.alive()) {
                g2.BasicAttack(g1);
                renderuj();
                printuj(g2.getLastMessage()); // attack message
                printuj(g1.getLastMessage()); // defense message
            }
            System.out.println();
        }
    }
}
