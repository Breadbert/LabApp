package models;

public class Towar {
    private String nazwa;
    private double cena;
    
    public Towar(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
}
