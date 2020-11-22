package de.hsos.ab04;

import de.hsos.ab04.aufg1.Ball;
import de.hsos.ab04.aufg1.Korb;
import de.hsos.ab04.aufg2.Spieler;
import de.hsos.ab04.aufg2.Spielfeld;
import de.hsos.ab04.util.Interaktionsbrett;

public class App {

    public static void main(String[] args) {
	// write your code here

        Interaktionsbrett ib = new Interaktionsbrett();

        Spielfeld s = new Spielfeld();
        Spieler spieler1 = new Spieler(s,10,0);
        Spieler spieler2 = new Spieler(s, 100,0);
        s.darstellen(ib);
        spieler1.DrawSchlaeger(ib);
        spieler2.DrawSchlaeger(ib);



        /*
        Ball b = new Ball();
        Korb k = new Korb();
        b.darstellen(ib);
        k.darstellen(ib);

*/


    }
}
