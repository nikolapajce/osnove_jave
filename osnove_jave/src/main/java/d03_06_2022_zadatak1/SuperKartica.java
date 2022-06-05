package d03_06_2022_zadatak1;
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
public class SuperKartica {
    private String broj;
    private String punoIme;
    private int popust;


    public SuperKartica(String broj, String punoIme, int popust) {
        this.broj = broj;
        this.punoIme = punoIme;
        this.popust = popust;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj() {
        System.out.println("Broj kartice: " + this.broj + ", ime i prezime: " + this.punoIme);
        System.out.println();

    }
}
