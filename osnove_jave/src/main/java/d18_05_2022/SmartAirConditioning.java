package d18_05_2022;
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

    public void stampaj() {
        System.out.println("**************************************************");
        System.out.println("Marka klime je " + this.marka);
        System.out.println("Izabrana temperatura je: " + this.temperatura + " C");
        System.out.println("Izabran je mod " + mod);
        System.out.println("**************************************************");
    }
}
