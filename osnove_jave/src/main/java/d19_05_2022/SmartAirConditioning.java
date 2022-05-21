package d19_05_2022;
//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu
public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;
    public int potrosnjaGrejanje;
    public int potrosnjaHladjenje;

    public void stampaj() {
        System.out.println("**************************************************");
        System.out.println("Marka klime je " + this.marka);
        System.out.println("Izabrana temperatura je: " + this.temperatura + " C");
        System.out.println("Izabran je mod " + this.mod);
        System.out.println("**************************************************");
    }
    public int mesecnaPotrosnja(){
        if (this.mod.equals("grejanje")) {
            return 30 * 15 * potrosnjaGrejanje;
        } else if (this.mod.equals("hladjenje")) {
            return 30 * 15 * potrosnjaHladjenje;
        } else {
            return 0;
        }
    }
    public int mesecniRacun() {
        int zelenaZona = 0;
        int plavaZona = 0;
        for (int i = 0; i < 351; i++) {
            zelenaZona = i * 6;
        }
        for (int i = 0; i < (this.mesecnaPotrosnja() - 349); i++) {
            plavaZona = i * 9;
        }
        return zelenaZona + plavaZona;
    }
}
