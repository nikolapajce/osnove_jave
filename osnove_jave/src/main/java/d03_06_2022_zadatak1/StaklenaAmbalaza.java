package d03_06_2022_zadatak1;
// Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barKod, String naziv, double neto, double bruto, double kaucija, boolean placaSeKaucija, double osnovnaCena) {
        super(barKod, naziv, neto, bruto);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        return (placaSeKaucija) ? this.osnovnaCena * 1.2 + this.kaucija : this.osnovnaCena * 1.2;
        }

    @Override
    public void stampaj() {
        System.out.println("Staklena ambalaza");
        System.out.println("Bar kod: " + this.barKod);
        System.out.println("Bruto: " + this.bruto);
        System.out.println("Neto: " + this.neto);
        System.out.println("Naziv: " + this.naziv);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Cena: " + this.cena());
        System.out.println();
    }
}
