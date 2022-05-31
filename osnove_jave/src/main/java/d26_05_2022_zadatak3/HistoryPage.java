package d26_05_2022_zadatak3;
//naziv stranice
//link do stranice
//vreme otvaranja stranice - sat i minut (2 atributa)
//username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//konstuktore koji su logicni
//gettere i setter (username i password nemaju settere)
//metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//Metoda obrisi kolacice koja setuje username i password na null.
//Metoda stampaj koja stampa podatke u formatu:
//[datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
public class HistoryPage {
    private String naziv;
    private String link;
    private int vremeSat;
    private int vremeMin;
    private String username;
    private String password;

    public HistoryPage(String naziv, String link, int vremeSat, int vremeMin) {
        this.naziv = naziv;
        this.link = link;
        this.vremeSat = vremeSat;
        this.vremeMin = vremeMin;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setVremeSat(int vremeSat) {
        this.vremeSat = vremeSat;
    }

    public void setVremeMin(int vremeMin) {
        this.vremeMin = vremeMin;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getLink() {
        return link;
    }

    public int getVremeSat() {
        return vremeSat;
    }

    public int getVremeMin() {
        return vremeMin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public void sacuvajKredencijale(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void obrisiKolacice (){
        this.username = null;
        this.password = null;
    }
    public void stampaj(){
        System.out.println("Vreme otvaranja stranice: " + this.vremeSat + ":" + vremeMin);
        System.out.print("Naziv: " + this.naziv + ", link: " + this.link);
        if(this.username!=null && this.password!=null){
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("**********************************");
    }
}


//metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//Metoda obrisi kolacice koja setuje username i password na null.
//Metoda stampaj koja stampa podatke u formatu:
//[datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]