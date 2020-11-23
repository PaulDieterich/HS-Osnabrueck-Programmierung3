package de.hsos.ab04.aufg2;

import de.hsos.ab04.util.Interaktionsbrett;

public class PongSpiel {
    final int FPMS = 17;
    Spielfeld spielfeld;

    Spieler spielerLinks;
    Spieler spielerRechts;

    Interaktionsbrett ib;


    PongSpiel(){
        ib = new Interaktionsbrett();
        ib.willTasteninfo(this);
        startAustellung();
    }


    private void startAustellung(){
        spielfeld = new Spielfeld();
        spielerLinks = new Spieler(spielfeld,spielfeld.spielfeldflaeche.mitteInX(),spielerLinks.schlaeger.getBreite());
        spielerRechts = new Spieler(spielfeld, spielfeld.spielfeldflaeche.mitteInX(), spielfeld.spielfeldflaeche.getBreite() - spielerRechts.schlaeger.getBreite());
    }
    public void spielen(){
        int differenz = 0;
        while (true){
            //Thread.sleep();
            ib.abwischen();
            spielfeld.darstellen(ib);
            spielerLinks.DrawSchlaeger(ib);
            spielerRechts.DrawSchlaeger(ib);



        }
    }
    
}
