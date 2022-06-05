package d03_06_2022_zadatak1;
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
public class Tetrapak extends Ambalaza{
    private boolean recikliraSe;
    private double osnovnaCena;

    public Tetrapak(String barKod, String naziv, double neto, double bruto, boolean recikliraSe, double osnovnaCena) {
        super(barKod, naziv, neto, bruto);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        return (recikliraSe ? tezinaPakovanja() * 1.5 + this.getOsnovnaCena() : this.getOsnovnaCena());
        }


    @Override
    public void stampaj() {
        System.out.println("Tetrapak");
        System.out.println("Bar kod: " + this.barKod);
        System.out.println("Bruto: " + this.bruto);
        System.out.println("Neto: " + this.neto);
        System.out.println("Naziv: " + this.naziv);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Cena: " + this.cena());
        System.out.println();
    }

}
