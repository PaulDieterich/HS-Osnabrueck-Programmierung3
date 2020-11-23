package de.hsos.ab04.aufg1;

import de.hsos.ab04.util.EinUndAusgabe;
import de.hsos.ab04.util.Interaktionsbrett;

public class Gamemaster {

    public Gamemaster() {
        EinUndAusgabe input = new EinUndAusgabe();

        System.out.println("Wie viele Runden möchten sie spielen? ");
        int count = input.leseInteger();
        System.out.println("Es werden " + count + " Runden gespielt.");
        System.out.println("Bereit?...");

        Interaktionsbrett ib = new Interaktionsbrett();

        while (count > 0) {
            startGame(ib);
            count--;
        }
    }

    public void startGame(Interaktionsbrett ib) {
        greetPlayer(ib);
        Ball ball = new Ball();
        Korb korb = new Korb();
        ball.darstellen(ib);
        korb.darstellen(ib);
        System.out.println("");
        long start = System.currentTimeMillis();
        while (!korb.getroffen(ball)) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
          /*  System.out.print("X-Koordinate " + ball.getX() + " ");
            System.out.println("Y-Koordinate " + ball.getY());*/

        }
        long stop = System.currentTimeMillis();
        long time = stop - start;

        ib.neuerText(15, 15, "Sie haben " + time + " Millisekunden benötigt.");
        System.out.println("Sie haben " + time + " Millisekunden benötigt.");
        System.out.println("Die nächste Runde startet in 3 Sekunden");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        ib.abwischen();
    }

    public void greetPlayer(Interaktionsbrett ib) {
        ib.neuerText(15, 15, "Die Runde startet in 5 Sekunden!");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        ib.abwischen();
        ib.neuerText(15, 15, "3");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        ib.abwischen();
        ib.neuerText(15, 15, "2");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        ib.abwischen();
        ib.neuerText(15, 15, "1");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        ib.abwischen();
    }
}
