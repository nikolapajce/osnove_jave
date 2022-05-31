package d26_05_2022_zadatak1;

import java.util.ArrayList;

//Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
public class Pasta {
    private ArrayList <d26_05_2022_zadatak1.Sastojak> pasta = new ArrayList<d26_05_2022_zadatak1.Sastojak>();

    public void dodaj(d26_05_2022_zadatak1.Sastojak sastojak){
        pasta.add(sastojak);
    }

    public void obrisi(String naziv) {
        for (int i = 0; i < pasta.size(); i++) {
            if (pasta.get(i).getNaziv().equals(naziv)) {
                pasta.remove(i);
                i--;
            }
        }
    }
    public int cenaPaste(){
        int suma = 0;
        for (int i = 0; i < pasta.size(); i++) {
            suma = suma + pasta.get(i).getCena();
        }
        return suma;
    }

    public void stampa(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < pasta.size(); i++) {
            pasta.get(i).stampa();
        }
        System.out.println("Cena paste je: " + cenaPaste() + " din.");
    }
}
