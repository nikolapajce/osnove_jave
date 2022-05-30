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

    ArrayList <Reakcija> reakcijeNaPost = new ArrayList<Reakcija>();

    public void reaguj (Reakcija reakcija){
        reakcijeNaPost.add(reakcija);
    }

    private int brojReakcija (String tip){
        int brLajkova = 0;
        int brSmajlija = 0;
        int brSrca = 0;
        for (int i = 0; i < reakcijeNaPost.size(); i++) {
            if (reakcijeNaPost.get(i).getTip().equals("like")){
                brLajkova = brLajkova + 1;
            } else if (reakcijeNaPost.get(i).getTip().equals("srce")){
                brSrca = brSrca + 1;
            } else {
                brSmajlija = brSmajlija + 1;
            }
        }
        if(tip.equals("like")){
            return brLajkova;
        } else if (tip.equals("srce")){
            return brSrca;
        } else {
            return brSmajlija;
        }
    }
    public void stampa(){
        System.out.println(Ime);
        System.out.println(tekst);
        System.out.println("Smajli: " + this.brojReakcija("smajli") + " | Like: " + this.brojReakcija("like") + " | Srce: " + this.brojReakcija("srce"));
    }

}
