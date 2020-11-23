package de.hsos.ab04.aufg1;

import de.hsos.ab04.util.Interaktionsbrett;

public class Listener {
    int x,y;
    Listener(){
    }

    public Boolean mitMausVerschoben(String name, int x, int y){
        System.out.println("mitMausVerschoben");
        return true;
    }
    public Boolean mitMausAngeklickt(String name, int x, int y){
        System.out.println("mitMausAngeklickt");

        return true;
    }
    public Boolean mitMausLosgelassen(String name, int x, int y){
        System.out.println("mitMausLosgelassen");
        System.out.println("X:" + x + ", Y: " + y);
        this.x = x;
        this.y= y;
        return true;
    }


}
