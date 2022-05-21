package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();
        prvi.naziv = "Cokolada";
        prvi.cena = 120.00;
        prvi.tezina = 500.00;

        Proizvod drugi = new Proizvod();
        drugi.naziv = "Kafa";
        drugi.cena = 220.00;
        drugi.tezina = 100.00;

        prvi.stampaj();
        System.out.println("--------------------------------------");
        drugi.stampaj();

        prvi.povecanje(70);
        drugi.povecanje(20);

        System.out.println();
        System.out.println("Posle povecanja cene");
        prvi.stampaj();
        System.out.println("--------------------------------------");
        drugi.stampaj();

        System.out.println("Cena sa popustom za prvi proizvod je " + prvi.vratiCenuSaPopustom(30));
        System.out.println("Cena sa popustom za drugi proizvod je " + drugi.vratiCenuSaPopustom(10));
        System.out.println();
        System.out.println("Postarina za prvi proizvod je " + prvi.racunajPostarinu());
        System.out.println("Postarina za drugi proizvod je " + drugi.racunajPostarinu());

    }
}
