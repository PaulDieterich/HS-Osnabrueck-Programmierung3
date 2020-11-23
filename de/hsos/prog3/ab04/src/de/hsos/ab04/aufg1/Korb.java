package de.hsos.ab04.aufg1;

import de.hsos.ab04.util.Interaktionsbrett;

public class Korb {
    int x, y;
    int breite = 100;
    int hoehe = 100;

    int range_MIN = 10;
    int range_MAX = 100;


    public Korb(){}

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void darstellen(Interaktionsbrett ib) {
        setX(ib.zufall(range_MIN, range_MAX));
        setY(ib.zufall(range_MIN, range_MAX));
        ib.neuesRechteck(this, "Finn", x, y, breite, hoehe);
    }

    public boolean getroffen(Ball ball) {
        //X-Koordinate stimmt
        if (ball.getX() > this.x + ball.getRadius() && ball.getX() < this.x + this.breite - ball.getRadius()) {
            //Y-Koordinate stimmt
            if (ball.getY() > this.y + ball.getRadius() && ball.getY() < this.y + this.hoehe - ball.getRadius()) {
                //Der Ball ist im Feld und berührt das Rechteck nicht
                return true;
            }
        }
        return false;
    }

}
