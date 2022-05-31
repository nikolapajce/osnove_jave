package d30_05_2022_zadatak2;

import java.util.ArrayList;

//Kreirati klasu Kombinacija koja ima:
//id kombinacije (String)
//niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//metodu koja proverava da li this kombinacija ima iste brojeve
// kao prosledjena kombinacija.
//Zaglavlje metode je:
//public boolean daLiJeIstaKombinacija( Kombinacija k)
//metoda vraca true ako su svi elementi na istim pozicija isti
//npr: this [0] == k [0], this [1] == k [1] ….
//metodu za stampu koja stampa podatke u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
public class Kombinacija {
    private String id;
    private ArrayList<Integer> nizBrojeva = new ArrayList<>();
    private int prvi;
    private int drugi;
    private int treci;
    private int cetvrti;
    private int peti;
    private int sesti;
    private int sedmi;

    public Kombinacija (String id, int prvi, int drugi, int treci, int cetvrti, int peti, int sesti, int sedmi){
        this.id = id;
        this.prvi = prvi;
        this.drugi = drugi;
        this.treci = treci;
        this.cetvrti = cetvrti;
        this.peti = peti;
        this.sesti = sesti;
        this.sedmi = sedmi;
        this.nizBrojeva.add(prvi);
        this.nizBrojeva.add(drugi);
        this.nizBrojeva.add(treci);
        this.nizBrojeva.add(cetvrti);
        this.nizBrojeva.add(peti);
        this.nizBrojeva.add(sesti);
        this.nizBrojeva.add(sedmi);
    }

    public String getId() {
        return id;
    }

    public int getPrvi() {
        return prvi;
    }

    public int getDrugi() {
        return drugi;
    }

    public int getTreci() {
        return treci;
    }

    public int getCetvrti() {
        return cetvrti;
    }

    public int getPeti() {
        return peti;
    }

    public int getSesti() {
        return sesti;
    }

    public int getSedmi() {
        return sedmi;
    }
    public boolean daLiSuIste (Kombinacija k){
        return this.nizBrojeva.get(0) == k.getPrvi() && this.nizBrojeva.get(1) == k.getDrugi()
                && this.nizBrojeva.get(2) == k.getTreci() && this.nizBrojeva.get(3) == k.getCetvrti()
                && this.nizBrojeva.get(4) == k.getPeti() && this.nizBrojeva.get(5) == k.getSesti()
                && this.nizBrojeva.get(6) == k.getSedmi();
    }
    public void stampa (){
        System.out.println("Id: " + this.id);
        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i) + " ");
        }
    }
}

//metodu koja proverava da li this kombinacija ima iste brojeve
// kao prosledjena kombinacija.
//Zaglavlje metode je:
//public boolean daLiJeIstaKombinacija( Kombinacija k)
//metoda vraca true ako su svi elementi na istim pozicija isti
//npr: this [0] == k [0], this [1] == k [1] ….
//metodu za stampu koja stampa podatke u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23