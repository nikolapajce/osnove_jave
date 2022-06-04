package d02_06_2022_zadatak1;

import java.util.ArrayList;

//Kreirati abstraktnu klasu Radnik koja ima:
// ime i prezime
// niz sektora u kojima radi
// abstraktnu metodu koja vraca platu radnika
// metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
public abstract class Radnik {
    protected String punoIme;
    protected ArrayList<Sektor> sektori = new ArrayList<>();

    public Radnik(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public ArrayList<Sektor> getSektori() {
        return sektori;
    }

    public void setSektori(ArrayList<Sektor> sektori) {
        this.sektori = sektori;
    }

    public abstract double plataRadnika();

    public void zaposliUSektor(Sektor sektor) {
        sektori.add(sektor);
    }
    public void stampaj() {
        System.out.println("Ime i prezime: " + this.punoIme);
        System.out.println("Sektori: ");
        for (int i = 0; i < this.sektori.size(); i++) {
            System.out.println(this.sektori.get(i).getNaziv());
        }
        System.out.println("Plata: " + this.plataRadnika());
        System.out.println();
    }

}
