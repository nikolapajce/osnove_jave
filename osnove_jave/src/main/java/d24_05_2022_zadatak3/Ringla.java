package d24_05_2022_zadatak3;
//tip ringle (obicna ili ekspres)
//jacinu
//za obicnu ringu jacina je u opsegu od 0 do 3
//za ekspres ringlu jacina je u opsegu od 0 do 12
//jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//getter za jacinu
//setteri ne postoje!!
//privatnu metodu koja vraca maksimalan broj pojacavanja
//za obicnu je 3, za ekspres je 12
//metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//metodu iskljuci ringlu - metoda postavlja jacinu na 0
//metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//metodu koja vraca potrosnju elektricne energije prema formuli
//100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi
//metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//metodu koja stampa podatke u formatu:
//	Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
public class Ringla {
    private String tip;
    private int jacina;
    private double jacinaGrejaca;

    public Ringla() {
        this.jacina = 0;
    }

    public Ringla(String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacina = 0;
        this.jacinaGrejaca = jacinaGrejaca;
    }

    public int getJacina() {
        return jacina;
    }

    private int maksimum(){
        if(this.tip.equals("obicna")){
            return 3;
        } else {
            return 12;
        }
    }

    public void pojacaj(){
        this.jacina = this.jacina + 1;
        if(this.jacina > this.maksimum()){
            this.jacina = 0;
        }
    }
    public void iskljuci(){
        this.jacina = 0;
    }
    public boolean daLiJeUkljucena(){
        return this.jacina > 0;
    }
    public double potrosnja(int brSati){
        return 100 / this.maksimum() * this.jacina * this.jacinaGrejaca * brSati;
    }
    public void stampa(){
        if (this.daLiJeUkljucena()) {
            System.out.println("Ringla je ukljucena.");
        } else {
            System.out.println("Ringla je iskljucena.");
        }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina ringle: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
    }
}
