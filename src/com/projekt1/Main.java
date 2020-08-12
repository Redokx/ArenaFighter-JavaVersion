
package com.projekt1;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String nick1= "";
        String nick2= "";
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj nick pierwszego gracza: ");
        nick1 = input.nextLine();//

        System.out.println("Podaj nick drugiego gracza: ");
        nick2 = input.nextLine();//



// stworzenie obiektów
        RollKostka kostka = new RollKostka(10);
        Gracz pierwszy = new Warrior(
                nick1,
                1,
                100,
                200,
                200,
                25,
                5,
                5,
                kostka
        );

        Gracz drugi = new Mage(
                nick2,
                2,
                200,
                25,
                200,
                200,
                1,
                1,
                1,
                100,
                kostka
                );

        Arena arena = new Arena(pierwszy, drugi, kostka);

// Walka
        arena.fight();

    }
}
