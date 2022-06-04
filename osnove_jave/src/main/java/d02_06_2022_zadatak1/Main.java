package d02_06_2022_zadatak1;
//U glavnom programu kreirati jednog magacionera i jednog menadzera,
// postaviti sektore u kojima rade i ispisati platu za svakog
public class Main {
    public static void main(String[] args) {
        Radnik prvi = new Magacioner("Nikola Pavlovic");
        Radnik drugi = new Menadzer("Pavle Nikolic");
        Sektor prodaja = new Sektor("Prodaja", 10000);
        Sektor nabavka = new Sektor("Nabavka", 20000);
        Sektor magacin = new Sektor("Magacin", 30000);

        prvi.zaposliUSektor(magacin);
        drugi.zaposliUSektor(prodaja);
        drugi.zaposliUSektor(nabavka);

       prvi.stampaj();
       drugi.stampaj();

    }

}
