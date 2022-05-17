package d16_05_2022;
// Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
// U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int a = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = s.nextInt();
        System.out.print("Unesite treci broj: ");
        int c = s.nextInt();
        System.out.println("Najmanji broj je " + najmanjiBroj(a, b, c));

    }

    static int najmanjiBroj(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }

    }

}


