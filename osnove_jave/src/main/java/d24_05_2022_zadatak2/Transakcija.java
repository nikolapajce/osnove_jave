package d24_05_2022_zadatak2;

//Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
public class Transakcija {
    private int id;
    private Racun uplacuje;
    private Racun prima;

    public Transakcija(int id, Racun uplacuje, Racun prima) {
        this.id = id;
        this.uplacuje = uplacuje;
        this.prima = prima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getUplacuje() {
        return uplacuje;
    }

    public void setUplacuje(Racun uplacuje) {
        this.uplacuje = uplacuje;
    }

    public Racun getPrima() {
        return prima;
    }

    public void setPrima(Racun prima) {
        this.prima = prima;
    }

    private double provizija(double visinaTransakcije) {
        if (visinaTransakcije < 4500.0) {
            return 45.0;
        } else {
            return visinaTransakcije * 0.1;
        }
    }

    public void izvrsiTransakciju(double visinaTransakcije) {
        if (this.getUplacuje().getStanje() > visinaTransakcije) {
            this.getUplacuje().novoStanje(this.getUplacuje().getStanje() - (visinaTransakcije + this.provizija(visinaTransakcije)));
            this.getPrima().novoStanje(this.getPrima().getStanje() + visinaTransakcije);
        } else {
            System.out.println("Nemate dovoljno sredstava.");
        }
    }
    public void stampa(){
        System.out.println("Transakcija " + this.id);
        System.out.println("Sa racuna: " + this.uplacuje.getPunoIme() + " - " + this.uplacuje.getBroj());
        System.out.println("Na racun: " + this.prima.getPunoIme() + " - " + this.prima.getBroj());
    }

}


//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna