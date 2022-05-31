package d30_05_2022_zadatak1;

import java.util.ArrayList;

//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
public class Student {
    private int brIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> predmeti = new ArrayList();

    public Student(int brIndeksa, String punoIme, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getPredmeti() {
        return predmeti;
    }
    public void dodajIspit(Ispit ispit){
        this.predmeti.add(ispit);
    }
    public double prosek(){
        double prosek = 0.0;
        double suma = 0.0;
        int brojac = 0;
        for (int i = 0; i < predmeti.size(); i++) {
            if (this.predmeti.get(i).daLiJePolozen()) {
                suma = suma + this.predmeti.get(i).getOcena();
                brojac++;
            }
        }
        prosek = suma / brojac;
        return prosek;
    }
    public void stampa(){
        System.out.println("Broj indeksa: " + this.brIndeksa + " - Ime: " + this.punoIme + " - Tip studija: " + this.tipStudija + " - Prosek: " + this.prosek());
        for (int i = 0; i < this.predmeti.size(); i++) {
            predmeti.get(i).stampa();
        }
    }
}



//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)