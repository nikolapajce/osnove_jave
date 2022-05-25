package d24_05_2022_zadatak2;

// Kreirati klasu Racun koja ima:
//broj racuna (npr: 170-289328923-23)
//ime i prezime osobe
//trenutno stanje na racunu (npr: 100, 1220)
//gettere i setter za sve atribute, sem settera za stanje na racunu
//metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//metodu koja stampa podatke o racunu u formatu:
//Ime i prezime  -  broj racuna
//stanje na racunu je (trenutno stanje) rsd.
public class Racun {
    private String broj;
    private String punoIme;
    private double stanje;

    public Racun(String broj, String punoIme) {
        this.broj = broj;
        this.punoIme = punoIme;
        this.stanje = 0.0;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBroj() {
        return broj;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public double getStanje() {
        return stanje;
    }

    public void novoStanje (double novaVrednost){
        this.stanje = novaVrednost;
        if (this.stanje < 0.0){
            this.stanje = 0.0;
        }
    }
    public void stampa(){
        System.out.println("Ime i prezime: " + this.punoIme + " - " + this.broj);
        System.out.println("Stanje na racunu je: " + this.stanje + " rsd.");
    }
}
