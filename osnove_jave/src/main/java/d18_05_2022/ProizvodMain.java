package d18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();
        prvi.naziv = "Cokolada";
        prvi.cena = 120.00;
        prvi.tezina = 80.00;

        Proizvod drugi = new Proizvod();
        drugi.naziv = "Kafa";
        drugi.cena = 220.00;
        drugi.tezina = 100.00;

        prvi.stampaj();
        System.out.println("--------------------------------------");
        drugi.stampaj();

    }
}
