package d30_05_2022_zadatak2;

import java.util.ArrayList;

//niz kombinacija - maksimalno 7 kombinacija
//metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//metodu koja vraca da li je kombinacija dobitna.
// Kao parametar se prosledjuje kombinacija za proveru.
// Metoda prolazi kroz sve elemente niza i proverava da li u nizu
// postoji prosledjena kombinacija.
// Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//Zaglavlje metode
//public boolean dobitna(Kombinacija dobitnaKombinacija)
//metodu koja stampa listic u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//…… i tako za sve kombinacije
public class Listic {
    ArrayList<Kombinacija> kombinacije = new ArrayList<Kombinacija>();

    public void dodajKombinaciju (Kombinacija kombinacija){
        kombinacije.add(kombinacija);
    }
    public boolean daLiJeDobitna (Kombinacija dobitnaKombinacija){
        return kombinacije.get(0).daLiSuIste(dobitnaKombinacija)
                || kombinacije.get(1).daLiSuIste(dobitnaKombinacija)
                || kombinacije.get(2).daLiSuIste(dobitnaKombinacija)
                || kombinacije.get(3).daLiSuIste(dobitnaKombinacija)
                || kombinacije.get(4).daLiSuIste(dobitnaKombinacija)
                || kombinacije.get(5).daLiSuIste(dobitnaKombinacija)
                || kombinacije.get(6).daLiSuIste(dobitnaKombinacija);
    }
    public void stampa() {
        for (int i = 0; i < kombinacije.size(); i++) {
            kombinacije.get(i).stampa();
            System.out.println();
        }
    }
}
