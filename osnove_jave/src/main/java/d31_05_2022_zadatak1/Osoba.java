package d31_05_2022_zadatak1;
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
public class Osoba {
    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected int godinaRodj;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, String jmbg, int godinaRodj) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.godinaRodj = godinaRodj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodj() {
        return godinaRodj;
    }

    public void setGodinaRodj(int godinaRodj) {
        this.godinaRodj = godinaRodj;
    }
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.ime + " " + this.prezime + ", " + this.jmbg + ", godina rodjenja: " + this.godinaRodj);
    }
}