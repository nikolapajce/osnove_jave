package d30_05_2022_zadatak2;

public class Main {
    public static void main(String[] args) {
        Kombinacija dobitnaKombinacija = new Kombinacija("0", 1, 2, 3, 4, 5, 6, 7);
        Kombinacija prva = new Kombinacija("1", 1, 2, 3, 4, 5, 6, 7);
        Kombinacija druga = new Kombinacija("2", 8, 9, 10, 11, 12, 13, 14);
        Kombinacija treca = new Kombinacija("3", 15, 16, 17, 18, 19, 20, 21);
        Kombinacija cetvrta = new Kombinacija("4", 22, 23, 24, 25, 26, 27, 28);
        Kombinacija peta = new Kombinacija("5", 29, 30, 31, 32, 33, 34, 35);
        Kombinacija sesta = new Kombinacija("6", 36, 37, 38, 39, 1, 2, 3);
        Kombinacija sedma = new Kombinacija("7", 4, 5, 6, 7, 8, 9, 10);


        Listic listic = new Listic();

        listic.dodajKombinaciju(prva);
        listic.dodajKombinaciju(druga);
        listic.dodajKombinaciju(treca);
        listic.dodajKombinaciju(cetvrta);
        listic.dodajKombinaciju(peta);
        listic.dodajKombinaciju(sesta);
        listic.dodajKombinaciju(sedma);

        listic.stampa();

        if (listic.daLiJeDobitna(dobitnaKombinacija)) {
            System.out.println("Imate dobitnu kombinaciju");
        } else {
            System.out.println("Nemate dobitnu kombinaciju");
        }
    }
}
