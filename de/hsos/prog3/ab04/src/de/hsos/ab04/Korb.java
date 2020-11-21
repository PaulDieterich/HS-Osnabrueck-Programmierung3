package de.hsos.ab04;

import de.hsos.ab04.util.Interaktionsbrett;

public class Korb {
    private int x;
    private int y;
    private int laenge;


    Korb(){}

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public void darstellen(Interaktionsbrett ib){
        setX(ib.zufall(10,100));
        setY(ib.zufall(10,100));
        setLaenge(50);
        ib.neuesRechteck(x,y,laenge,laenge);
    }


}
