package d24_05_2022_zadatak1;

import p24_05_2022.Sastojak;

import java.util.ArrayList;
import java.util.Scanner;

//U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
        System.out.print("Unesite ime i prezime studenta: ");
        String punoIme = s.nextLine();
        System.out.print("Unesite broj indeksa: ");
        int brindeksa = s.nextInt();
        System.out.print("Unesite broj ispita: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            s.nextLine();
            System.out.print("Unesite naziv predmeta: ");
            String predmet = s.nextLine();
            System.out.print("Unesite ime i prezime profesora: ");
            String profesor = s.nextLine();
            System.out.print("Unesite ocenu na ispitu: ");
            int ocena = s.nextInt();
            ZeleniKarton x = new ZeleniKarton(punoIme, brindeksa, predmet, profesor, ocena);
            ispiti.add(x);
        }
        double sumaOcena = 0;
        double sumaPolozenih = 0;
        int brojac = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
            System.out.println("---------------------------------");
            sumaOcena = sumaOcena + ispiti.get(i).getOcena();
            if (ispiti.get(i).getOcena() > 5){
                brojac = brojac + 1;
                sumaPolozenih = sumaPolozenih + ispiti.get(i).getOcena();
            }
        }
        System.out.println("Prosecna ocena na ispitima je: " + sumaOcena / n);
        System.out.println("Prosecna ocena na polozenim ispitima je: " + sumaPolozenih / brojac);
    }
}
