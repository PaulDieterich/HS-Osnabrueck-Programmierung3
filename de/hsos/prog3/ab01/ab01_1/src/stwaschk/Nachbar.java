package de.hsos.prog3.ab01.ab01_1.src.stwaschk;

public class Nachbar {
    private String vorname;
    private String nachname;

    public Nachbar() {}
    
    public Nachbar(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }


    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
        result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Nachbar other = (Nachbar) obj;
        if (nachname == null) {
            if (other.nachname != null)
                return false;
        } else if (!nachname.equals(other.nachname))
            return false;
        if (vorname == null) {
            if (other.vorname != null)
                return false;
        } else if (!vorname.equals(other.vorname))
            return false;
        return true;
    }
}
