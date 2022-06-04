package d02_06_2022_zadatak1;
//Kreirati klasu Sektor koja ima:
// naziv sektora
// platu koja je za taj sektor
public class Sektor {
    private String naziv;
    private double plata;


    public Sektor(String naziv, double plata) {

        this.naziv = naziv;
        this.plata = plata;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }
}
