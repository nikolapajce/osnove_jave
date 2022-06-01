package d31_05_2022_zadatak2;

import java.util.ArrayList;

//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean daLiJeKapiten;
    private ArrayList<Karton> kartoni = new ArrayList<>();

    public Igrac(String ime, String prezime, String jmbg, int godinaRodj, int broj, String pozicija, boolean daLiJeKapiten) {
        super(ime, prezime, jmbg, godinaRodj);
        this.broj = broj;
        this.pozicija = pozicija;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public Igrac() {

    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
    public void dodajKarton(Karton karton){
        kartoni.add(karton);
    }
    public int brojZutih() {
        int brojZutih = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).getTip().equals("zuti")) {
                brojZutih++;
            }
        }
        return brojZutih;
    }

    public int brojCrvenih() {
        int brojCrvenih = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (kartoni.get(i).getTip().equals("crveni")) {
                brojCrvenih++;
            }
        }
        return brojCrvenih;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj na dresu: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        if (this.daLiJeKapiten) {
            System.out.println("Kapiten");
        } else {
            System.out.print("");
        }
        System.out.println("Zuti kartoni: " + this.brojZutih());
        System.out.println("Crveni kartoni: " + this.brojCrvenih());
        System.out.println();
    }
}


//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu