package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne u nosi ih korisnik)
//        a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza. Pre i nakon izbacivanja
//        ispisati niz na ekranu. Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//                Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
//        Primer izvrsenja 1:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 5
//        Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
//
//        Primer izvrsenja 2:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 11
//        Uneli ste nevalidnu poziciju!
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(1);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(2);
        brojevi.add(9);

        System.out.println("Niz je: " + brojevi);

        System.out.print("Unesite poziciju za izbacivanje: ");
        int pozicija = s.nextInt();
        if (pozicija >= brojevi.size()) {
            System.out.println("Uneli ste nevalidnu poziciju");
        } else {
            brojevi.remove(pozicija);
            System.out.println("Niz nakon brisanja je: " + brojevi);
        }
    }
}