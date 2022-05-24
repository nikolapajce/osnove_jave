package d23_05_2022;

//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
public class Knjiga {
    public int isbn;
    public String naziv;
    public int godina;
    public Autor autor;

    public Knjiga(String naziv, Autor autor) {
        this.naziv = naziv;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampa() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naziv: " + this.naziv + " - izdata: " + this.godina);
        System.out.print("Autor: ");
        this.autor.stampa();
    }
}
