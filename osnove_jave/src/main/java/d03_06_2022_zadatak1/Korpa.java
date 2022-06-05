package d03_06_2022_zadatak1;

import java.util.ArrayList;

//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
// kao parametar funkcije se prima Super karticu iz koje se cita popust
public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

    public void dodaj(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaci(String barkod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (ambalaze.get(i).barKod.equals(barkod)) {
                ambalaze.remove(i);
            }
        }
    }

    private double cenaSaPopustom(int popust) {
        double suma = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            suma += ambalaze.get(i).cena();
        }
        return suma - popust;
    }
    public double ukupnaCenaKorpe(SuperKartica superKartica) {
        return cenaSaPopustom(superKartica.getPopust());
    }

    public void stampaj(SuperKartica superKartica) {
        for (int i = 0; i < ambalaze.size(); i++) {
            ambalaze.get(i).stampaj();
        }
        double suma = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            suma += ambalaze.get(i).cena();
        }
        System.out.println("Cena bez popusta: " + suma);
        System.out.println("Ostvarili ste " + superKartica.getPopust() + " dinara popusta!");
        System.out.println("Racun: " + this.ukupnaCenaKorpe(superKartica));

    }
}
