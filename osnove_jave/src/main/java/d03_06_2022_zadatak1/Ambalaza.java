package d03_06_2022_zadatak1;
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj
public abstract class Ambalaza {
    protected String barKod;
    protected String naziv;
    protected double neto;
    protected double bruto;

    public Ambalaza() {
    }

    public Ambalaza(String barKod, String naziv, double neto, double bruto) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.neto = neto;
        this.bruto = bruto;
    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }

    public double tezinaPakovanja() {
        return this.getBruto() - this.getNeto();
    }

    public abstract double cena();

    public abstract void stampaj();
}
