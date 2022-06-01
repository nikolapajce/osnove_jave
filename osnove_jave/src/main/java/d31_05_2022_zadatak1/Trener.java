package d31_05_2022_zadatak1;
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
public class Trener extends Osoba{
    public int godineIskustva;
    public String tip;

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Trener(String ime, String prezime, String jmbg, int godinaRodj, int godineIskustva, String tip) {
        super(ime, prezime, jmbg, godinaRodj);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tip);
        System.out.println();
    }
}
