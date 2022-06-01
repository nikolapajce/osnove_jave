package d31_05_2022_zadatak1;

import java.util.ArrayList;
import java.util.Scanner;
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
// na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Igrac prviIgrac = new Igrac("Nikola", "Pavlovic", "1234567", 1990, 7, "Napadac", true);
        Igrac drugiIgrac = new Igrac("Pavle", "Nikolic", "123456", 1999, 11, "Defanzivac", false);


        Trener prviTrener = new Trener("Pera", "Peric", "19754347", 1977, 7, "personalni");
        Trener drugiTrener = new Trener("Mika", "Mikic", "19345661", 1961, 15, "pomocni");

        prviIgrac.stampaj();
        drugiIgrac.stampaj();
        prviTrener.stampaj();
        drugiTrener.stampaj();

        ArrayList<Igrac> tim = new ArrayList<Igrac>();
        System.out.print("Unesite broj igraca: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite ime igraca: ");
            String ime = s.next();
            System.out.print("Unesite prezime igraca: ");
            String prezime = s.next();
            System.out.print("Unesite jmbg igraca: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja igraca: ");
            int godRodjenja = s.nextInt();
            System.out.print("Unesite broj dresa igraca: ");
            int broj = s.nextInt();
            System.out.print("Unesite poziciju igraca: ");
            String pozicija = s.next();
            System.out.print("Da li je igrac kapiten tima? ");
            boolean kapiten = s.nextBoolean();
            System.out.println();

            Igrac igrac = new Igrac(ime, prezime, jmbg, godRodjenja, broj, pozicija, kapiten);
            tim.add(igrac);
        }

        for (int i = 0; i < tim.size(); i++) {
            tim.get(i).stampaj();
        }

        ArrayList<Trener> treneri = new ArrayList<Trener>();

        System.out.println("Unesite broj trenera: ");
        int m = s.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("Unesite ime trenera: ");
            String ime = s.next();
            System.out.print("Unesite prezime trenera: ");
            String prezime = s.next();
            System.out.print("Unesite jmbg trenera: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja trenera: ");
            int godinaRodj = s.nextInt();
            System.out.print("Unesite godine iskustva trenera: ");
            int godineIskustva = s.nextInt();
            System.out.print("Unesite tip trenera(kondicioni, za igru, pomocni, personalni): ");
            String tip = s.next();
            System.out.println();

            Trener trener = new Trener(ime, prezime, jmbg, godinaRodj, godineIskustva, tip);
            treneri.add(trener);
        }

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }
    }
}

