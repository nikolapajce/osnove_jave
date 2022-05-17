package d16_05_2022;
// Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = s.nextInt();
        stampajVrednostZa10Vecu(broj);
    }

    static void stampajVrednostZa10Vecu(int a) {
        int b = a + 10;
        System.out.println("Vrednost za 10 veca je " + b);
    }

}
