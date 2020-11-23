package de.hsos.ab04.aufg1;

import de.hsos.ab04.util.Interaktionsbrett;

public class Ball extends Listener{
    int radius = 20;
    int range_MIN = 10;
    int range_MAX = 300;

    //Das Objekt übergeben, das die Call-Back Methoden enthält.
    public Ball() {

    }


    /**
     * Methode zum Darstellen des Balls. Die Methode updated nach einmaliger
     * Übergabe seines Objekts an das Interaktionsbrett die Darstellung kontinuierlich
     */
    public void darstellen(Interaktionsbrett ib) {
        setX(ib.zufall(range_MIN, range_MAX));
        setY(ib.zufall(range_MIN, range_MAX));
        //Event-Objects werden mit einem eindeutigen Schlüssel versehen
        //In diesem Fall Name, Nummern (ID) funktionieren auch
        ib.neuerKreis(this, this.getClass().getName(), x, y, radius);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}