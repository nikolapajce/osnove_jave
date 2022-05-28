package d24_05_2022_zadatak3;

//marku storeta (npr: Beko, Bosh)
//garanciju kao broj godina
//maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//4 ringle
//gore levo
//gore desno
//dole levo
//dole desno
//konstruktor koji postavlja sve atribute
//gettere za sve atribut
//ne postoje setteri
//metodu pojacaj kojoj se prosledjuje pozicija ringle
//pozicija 1 je ringla gore levo
//pozicija 2 je ringla gore desno
//pozicija 3 je ringla dole levo
//pozicija 4 je ringla dole desno
//Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije
//Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//pozicija 1 je ringla gore levo
//pozicija 2 je ringla gore desno
//pozicija 3 je ringla dole levo
//pozicija 4 je ringla dole desno
//metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
//metodu koja stampa podatke u formatu:
//marka - garancija u godinama
//Ringle:
//Gore levo:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
//Gore desno:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
//Dole levo:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
//Dole desno:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
public class ElektricniSporet {

    private String marka;
    private int garancija;
    private int maksRingle;
    private Ringla goreLevo = new Ringla();
    private Ringla goreDesno = new Ringla();
    private Ringla doleLevo = new Ringla();
    private Ringla doleDesno = new Ringla();

    public ElektricniSporet(String marka, int garancija, int maksRingle, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maksRingle = maksRingle;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaksRingle() {
        return maksRingle;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    public void pojacaj(int pozicija) {
        int brojac = 0;
        if (this.doleDesno.daLiJeUkljucena()) {
            brojac = brojac + 1;
        }
        if (this.doleLevo.daLiJeUkljucena()){
            brojac = brojac + 1;
        }
        if (this.goreDesno.daLiJeUkljucena()) {
            brojac = brojac + 1;
        }
        if (this.goreLevo.daLiJeUkljucena()){
            brojac = brojac + 1;
        }
        if (brojac >= this.maksRingle){
            if (pozicija == 1 && this.goreDesno.daLiJeUkljucena()
                    && this.doleLevo.daLiJeUkljucena() && this.doleDesno.daLiJeUkljucena()) {
                this.goreLevo.pojacaj();
                this.goreDesno.iskljuci();
                this.doleLevo.iskljuci();
                this.doleDesno.iskljuci();
            } else if (pozicija == 2 && this.goreLevo.daLiJeUkljucena()
                    && this.doleDesno.daLiJeUkljucena() && this.doleLevo.daLiJeUkljucena()) {
                this.goreDesno.pojacaj();
                this.goreLevo.iskljuci();
                this.doleLevo.iskljuci();
                this.doleDesno.iskljuci();
            } else if (pozicija == 3 && this.goreDesno.daLiJeUkljucena()
                    && this.goreLevo.daLiJeUkljucena() && this.doleDesno.daLiJeUkljucena()) {
                this.doleLevo.pojacaj();
                this.goreDesno.iskljuci();
                this.goreLevo.iskljuci();
                this.doleDesno.iskljuci();
            } else if (pozicija == 4 && this.goreDesno.daLiJeUkljucena()
                    && this.goreLevo.daLiJeUkljucena() && this.doleLevo.daLiJeUkljucena()) {
                this.doleDesno.pojacaj();
                this.goreDesno.iskljuci();
                this.goreLevo.iskljuci();
                this.doleLevo.iskljuci();
            }
        } else {
            if (pozicija == 1) {
                this.goreLevo.pojacaj();
            } else if (pozicija == 2) {
                this.goreDesno.pojacaj();
            } else if (pozicija == 3) {
                this.doleLevo.pojacaj();
            } else {
                this.doleDesno.pojacaj();
            }
        }
    }
    public void ugasi(int pozicija){
        if (pozicija == 1) {
            this.goreLevo.iskljuci();
        } else if (pozicija == 2) {
            this.goreDesno.iskljuci();
        } else if (pozicija == 3) {
            this.doleLevo.iskljuci();
        } else if (pozicija == 4) {
            this.doleDesno.iskljuci();
        }
    }
    public double ukupnaPotrosnja(int brSati) {
        return goreLevo.potrosnja(brSati) + goreDesno.potrosnja(brSati) + doleLevo.potrosnja(brSati) + doleDesno.potrosnja(brSati);
    }
    public void stampa(){
        System.out.println("Marka: " + this.marka + ". Garancija u godinama: " + this.garancija);
        System.out.println("Ringle: ");
        System.out.println("Gore levo: ");
        this.goreLevo.stampa();
        System.out.println("Gore desno: ");
        this.goreDesno.stampa();
        System.out.println("Dole levo: ");
        this.doleLevo.stampa();
        System.out.println("Dole desno: ");
        this.doleDesno.stampa();
    }
}