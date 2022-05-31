package d26_05_2022_zadatak3;

import java.util.ArrayList;

//niz stranica koje su posecene
//metoda otvori stranicu koja dodaje novi historypage u niz.
//metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//metoda obrisi istoriju - metoda brise celu istoriju
//metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//metoda pogledajIstoriju - stampa sve posecene stranice
//metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena.
// Metoda kao parametar prima trenutno vreme (sat i minut)
public class History {
    private ArrayList<HistoryPage> stranice = new ArrayList<HistoryPage>();

    public void otvoriStranicu(HistoryPage stranica) {
        this.stranice.add(stranica);
    }

    public void obrisi(String link) {
        for (int i = 0; i < stranice.size(); i++) {
            if (stranice.get(i).getLink().equals(link)) {
                stranice.remove(i);
            }
        }
    }

    public void obrisiKolace(String link) {
        for (int i = 0; i < stranice.size(); i++) {
            if (stranice.get(i).getLink().equals(link)) {
                stranice.get(i).obrisiKolacice();
            }
        }
    }

    public void obrisiIstoriju() {
        for (int i = stranice.size() - 1; i >= 0; i--) {
            stranice.remove(i);
        }
    }

    public void sacuvajKredencija(String naziv, String username, String password) {
        for (int i = 0; i < stranice.size(); i++) {
            if (stranice.get(i).getNaziv().equals(naziv)) {
                stranice.get(i).sacuvajKredencijale(username, password);
            }
        }
    }

    public void pogledajIstoriju() {
        for (int i = 0; i < stranice.size(); i++) {
            stranice.get(i).stampaj();
        }
    }

    public void obrisiSveKolacice() {
        for (int i = stranice.size() - 1; i >= 0; i--) {
            stranice.get(i).obrisiKolacice();
        }
    }

    public void obrisiKolaciceSatVremena(int sat, int minut) {
        for (int i = 0; i < stranice.size(); i++) {
            if ((stranice.get(i).getVremeSat() == sat - 1) && (stranice.get(i).getVremeMin() >= minut)
                    || (stranice.get(i).getVremeSat() == sat) && (stranice.get(i).getVremeMin() <= minut)) {
                stranice.get(i).obrisiKolacice();
            }
        }
    }
}

