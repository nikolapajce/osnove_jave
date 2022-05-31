package d26_05_2022_zadatak2;

import java.util.ArrayList;

//Kreirati klasu FacebookPost koja ima:
//ime i prezime korisnika koji je stavio oglas
//tekst objave
//niz reakcija
//metodu reaguj, koja dodaje reakciju u niz
//(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post
// (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//Primer: Milan - lajkuje
//	 Nemanja - lajkuje
//	 Milan - daje srce
//Post ima lajk od Nemanje i srce od Milana.
//privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//metodu stampaj koja stampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2
public class FacebookPost {
    private String Ime;
    private String tekst;

    public FacebookPost() {

    }

    public FacebookPost(String punoIme, String tekst) {
        this.Ime = punoIme;
        this.tekst = tekst;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        this.Ime = ime;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    private ArrayList<Reakcija> reakcijeNaPost = new ArrayList<Reakcija>();

    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < this.reakcijeNaPost.size(); i++) {
            if (this.reakcijeNaPost.get(i).getPunoIme().equals(reakcija.getPunoIme())) {
                this.reakcijeNaPost.remove(i);
            }
        }
        reakcijeNaPost.add(reakcija);
    }


    private int brojReakcija(String tip) {
        int brojac = 0;
        for (int i = 0; i < reakcijeNaPost.size(); i++) {
            if (reakcijeNaPost.get(i).getTip().equals(tip)) {
                brojac++;
            }
        }
        return brojac;
    }

    public void stampa() {
        System.out.println(Ime);
        System.out.println(tekst);
        System.out.println("Smajli: " + this.brojReakcija("smajli") + " | Like: " + this.brojReakcija("like") + " | Srce: " + this.brojReakcija("srce"));
    }

}
