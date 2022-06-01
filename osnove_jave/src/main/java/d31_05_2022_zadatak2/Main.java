package d31_05_2022_zadatak2;

public class Main {
    public static void main(String[] args) {
        Igrac igrac = new Igrac("Nikola", "Pavlovic", "12345", 1990, 7, "napadac", true);
        Karton prvi = new Karton("zuti");
        Karton drugi = new Karton("zuti");
        Karton treci = new Karton("zuti");
        Karton cetvrti = new Karton("crveni");

        igrac.dodajKarton(prvi);
        igrac.dodajKarton(drugi);
        igrac.dodajKarton(treci);
        igrac.dodajKarton(cetvrti);

        igrac.stampaj();
    }
}
