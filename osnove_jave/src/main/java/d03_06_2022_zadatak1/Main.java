package d03_06_2022_zadatak1;

public class Main {
    public static void main(String[] args) {
        Ambalaza sok = new Tetrapak("123", "sok", 100, 120, true, 25);
        Ambalaza mleko = new Tetrapak("456", "mleko", 200, 220, false, 45);
        Ambalaza voda = new StaklenaAmbalaza("789", "voda", 100, 250, 20, true, 100);
        Ambalaza pivo = new StaklenaAmbalaza("012", "pivo", 200, 250, 20, false, 150);

        SuperKartica kartica = new SuperKartica("123-456-789", "Nikola Pavlovic", 100);

        kartica.stampaj();

        Korpa korpa = new Korpa();
        korpa.dodaj(sok);
        korpa.dodaj(mleko);
        korpa.dodaj(voda);
        korpa.dodaj(pivo);
        korpa.izbaci("123");
        
        korpa.stampaj(kartica);

    }
}
