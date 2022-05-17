package d16_05_2022;
// Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj karaktera: ");
        int broj = s.nextInt();
        System.out.print("Unesite karakter: ");
        String karakter = s.next();
        stampanjeZnakova(broj, karakter);

    }

    static void stampanjeZnakova(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");

        }

    }

}
