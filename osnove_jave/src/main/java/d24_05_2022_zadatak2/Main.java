package d24_05_2022_zadatak2;

public class Main {
    public static void main(String[] args) {
        Racun uplacuje = new Racun("175-987654-22", "Nikola Pavlovic");
        uplacuje.novoStanje(10000.0);
        Racun prima = new Racun ("345-67890876-11", "Pavle NIkolic");
        prima.novoStanje(4500.0);
        System.out.println("Pre transakcije");
        uplacuje.stampa();
        prima.stampa();
        System.out.println("******************************************");

        Transakcija prva = new Transakcija(765, uplacuje, prima);

        prva.izvrsiTransakciju(4500);
        System.out.println("Nakon transakcije");
        uplacuje.stampa();
        prima.stampa();
        System.out.println("******************************************");

        prva.stampa();
    }
}
