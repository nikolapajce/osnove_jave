package d30_05_2022_zadatak1;
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
public class Ispit {
    private String naziv;
    private int ocena;
    private String profesor;

    public Ispit(String naziv, int ocena, String profesor) {
        this.naziv = naziv;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public boolean daLiJePolozen (){
        return this.ocena > 6;
    }
    public void stampa(){
        System.out.println("Predmet: " + this.naziv + " - Profesor: " + this.profesor + " - Ocena: " + this.ocena);
    }
}

//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)