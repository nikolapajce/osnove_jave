package d19_05_2022;

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("{{ " + this.naziv + " }}, " + "{{ " + this.cena + " din }}, " + "{{ " + this.tezina + "g }}");
    }

    public void povecanje(double zaKoliko) {
        this.cena = this.cena + zaKoliko;
    }

    public double vratiCenuSaPopustom(double popust) {
        return this.cena - this.cena * popust / 100;
    }

    public int racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina > 100 && this.tezina < 500) {
            return 400;
        } else {
            return 1000;
        }
    }

}


