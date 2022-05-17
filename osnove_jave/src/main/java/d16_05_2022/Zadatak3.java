package d16_05_2022;
// Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite JMBG: ");
        String jmbg = s.next();
        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godinu rodjenja: ");
        int god = s.nextInt();
        System.out.print("Da li ste aktivan korisnik?(true/false): ");
        boolean aktivan = s.nextBoolean();
        System.out.println();
        stampanjePodataka(jmbg, ime, prezime, god, aktivan);

    }

    static void stampanjePodataka(String maticni, String fName, String lName, int year, boolean active) {
        System.out.println("JMBG: " + maticni);
        System.out.println("Ime: " + fName);
        System.out.println("Prezime: " + lName);
        System.out.println("Godina rodjenja: " + year);
        System.out.println("Aktivan: " + active);

    }

}
