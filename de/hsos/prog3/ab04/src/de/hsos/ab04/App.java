package de.hsos.ab04;

import de.hsos.ab04.util.Interaktionsbrett;

public class App {

    public static void main(String[] args) {
	// write your code here

        Interaktionsbrett ib = new Interaktionsbrett();


        Ball b = new Ball();
        Korb k = new Korb();
        b.darstellen(ib);
        k.darstellen(ib);
        b.drageTime(ib);





    }
}
