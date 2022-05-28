package d24_05_2022_zadatak3;

public class Main {
    public static void main(String[] args) {
        Ringla goreLevo = new Ringla("obicna", 0.8);
        Ringla goreDesno = new Ringla("obicna", 1);
        Ringla doleLevo = new Ringla("ekspres", 1.5);
        Ringla doleDesno = new Ringla("obicna", 0.8);

        ElektricniSporet sporet = new ElektricniSporet("Gorenje", 5, 3, goreLevo, goreDesno, doleLevo, doleDesno);

        sporet.pojacaj(1);
        sporet.pojacaj(1);
        sporet.pojacaj(2);
        sporet.pojacaj(3);
        sporet.pojacaj(4);
        
        sporet.stampa();
        System.out.println("Ukupna potrosnja je: " + sporet.ukupnaPotrosnja(6));
    }
}
