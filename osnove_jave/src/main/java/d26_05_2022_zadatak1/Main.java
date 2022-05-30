package d26_05_2022_zadatak1;

public class Main {
    public static void main(String[] args) {
        Sastojak testenina = new Sastojak("Testenina", 100);
        Sastojak sos = new Sastojak("Sos", 200);
        Sastojak so = new Sastojak("So", 50);
        Sastojak beliLuk = new Sastojak("Beli luk", 20);
        Sastojak biber = new Sastojak("Biber", 10);
        Sastojak meso = new Sastojak("Meso", 300);

        Pasta pasta = new Pasta();
        pasta.dodaj(testenina);
        pasta.dodaj(sos);
        pasta.dodaj(so);
        pasta.dodaj(biber);
        pasta.dodaj(beliLuk);
        pasta.dodaj(meso);


        pasta.stampa();
    }
}
