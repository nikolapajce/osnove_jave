package d26_05_2022_zadatak2;
//Kreirati klasu Reakcija koja ima
//tip reakcije (smajli, like, srce)
//ime i prezime korisnika koji je reagovao
//gettere, settere i konstruktore
public class Reakcija {
    private String tip;
    private String punoIme;

    public Reakcija(String tip, String punoIme) {
        this.tip = tip;
        this.punoIme = punoIme;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
}
