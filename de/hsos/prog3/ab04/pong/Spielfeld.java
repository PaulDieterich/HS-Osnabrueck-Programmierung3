package de.hsos.prog3.ab04.pong;

import de.hsos.prog3.ab04.pong.util.Interaktionsbrett;

public class Spielfeld {

    public Rechteck spielfeldflaeche;
    public Spieler spieler;

    public Spielfeld() {
        spielfeldflaeche = new Rechteck(5,5,620,775);
    }

    public void darstellen(Interaktionsbrett ib) {
        //Spielfeldrand
        ib.neuesRechteck(spielfeldflaeche.links(), spielfeldflaeche.oben(), spielfeldflaeche.breite(), spielfeldflaeche.hoehe());
        //Mittellinie
        ib.neueLinie(spielfeldflaeche.mitteInX(), spielfeldflaeche.oben(), spielfeldflaeche.mitteInX(), spielfeldflaeche.unten());
    }
}
