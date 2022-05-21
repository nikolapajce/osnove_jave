package d18_05_2022;

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

        SmartAirConditioning klimaUSpavacojSobi = new SmartAirConditioning();
        klimaUSpavacojSobi.marka = "LG";
        klimaUSpavacojSobi.temperatura = 26;
        if (klimaUSpavacojSobi.temperatura < 16){
            klimaUSpavacojSobi.temperatura = 16;
        }
        if (klimaUSpavacojSobi.temperatura > 35){
            klimaUSpavacojSobi.temperatura = 35;
        }
        klimaUSpavacojSobi.mod = "grejanje";

        klimaUDnevnojSobi.stampaj();
        System.out.println();
        klimaUSpavacojSobi.stampaj();
    }
}
