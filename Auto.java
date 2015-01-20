package fi.jamk;

public class Auto 
{
   // ominaisuudet
    String merkki;
    int vuosimalli;
    int nopeus;
    
    // luokan alustajat eli konstruktorit
    //"Ohjelmassa käyttö:" Auto auto = new Auto();
    public Auto()
    {
        this.merkki = "";
        this.vuosimalli = 0;
        this.nopeus = 0;
    }
    
    // "Ohjelmassa käyttö:" Auto auto = new Auto("Saabbi", 1900, 70);
    public Auto(String merkki, int vuosimalli, int nopeus)
    {
        this.merkki = merkki; // Tieto tulee parametristä
        this.vuosimalli = vuosimalli; // Tieto tulee parametristä
        this.nopeus = nopeus; // Tieto tulee parametristä
    }
    
    // metodi kasvattaa auton nopeutta
    public void kiihdyta() 
    {
        this.nopeus++;
    }
    
    // metodi vähentää auton nopeutta
    public void jarruta() 
    {
        this.nopeus--;
    }
    
    // metodi palauttaa auton merkin
    public String getMerkki() 
    {
        return this.merkki;
    }
    
    // metodi palauttaa vuosimallin
    public int getVuosimalli() 
    {
        return this.vuosimalli;
    }
    
    // metodi palauttaa nopeuden
    public int getNopeus() 
    {
        return this.nopeus;
    }
    
    // metodi palauttaa auton tiedot merkkijonona
    public String getTieto() 
    {
        return this.merkki + " " + this.vuosimalli + " " + this.nopeus;
    }
    
    // metodi muuttaa auton merkin
    public void setMerkki(String merkki)
    {
        this.merkki = merkki;
    }
    
    // metodi muuttaa auton vuosimallin
    public void setVuosimalli(int vuosimalli) 
    {
        this.vuosimalli = vuosimalli;
    }
        
}
