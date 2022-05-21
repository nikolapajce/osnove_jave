package d19_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning klimaUDnevnojSobi = new SmartAirConditioning();
        klimaUDnevnojSobi.marka = "Samsung";
        klimaUDnevnojSobi.temperatura = 22;
        if (klimaUDnevnojSobi.temperatura<16){
            klimaUDnevnojSobi.temperatura = 16;
        }
        if (klimaUDnevnojSobi.temperatura > 35){
            klimaUDnevnojSobi.temperatura = 35;
        }
        klimaUDnevnojSobi.mod = "hladjenje";
        klimaUDnevnojSobi.potrosnjaHladjenje = 1;
        klimaUDnevnojSobi.potrosnjaGrejanje = 2;

        SmartAirConditioning klimaUSpavacojSobi = new SmartAirConditioning();
        klimaUSpavacojSobi.marka = "LG";
        klimaUSpavacojSobi.temperatura = 40;
        if (klimaUSpavacojSobi.temperatura < 16){
            klimaUSpavacojSobi.temperatura = 16;
        }
        if (klimaUSpavacojSobi.temperatura > 35){
            klimaUSpavacojSobi.temperatura = 35;
        }
        klimaUSpavacojSobi.mod = "grejanje";
        klimaUSpavacojSobi.potrosnjaHladjenje = 1;
        klimaUSpavacojSobi.potrosnjaGrejanje = 2;

        klimaUDnevnojSobi.stampaj();
        System.out.println("Potrosnja je " + klimaUDnevnojSobi.mesecnaPotrosnja());
        System.out.println("Mesecni racun je: " + klimaUDnevnojSobi.mesecniRacun());
        System.out.println();
        klimaUSpavacojSobi.stampaj();
        System.out.println("Potrosnja je " + klimaUSpavacojSobi.mesecnaPotrosnja());
        System.out.println("Mesecni racun je: " + klimaUSpavacojSobi.mesecniRacun());
    }
}
