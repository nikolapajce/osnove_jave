package d24_05_2022_zadatak1;
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
public class ZeleniKarton {
    private String student;
    private int brojIndeksa;
    private String predmet;
    private String profesor;
    private int ocena;

    public ZeleniKarton(String punoIme, int brojIndeksa, String predmet, String profesor, int ocena) {
        this.student = punoIme;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean polozen (){
        return this.ocena > 5;
    }
    public void stampaj (){
        System.out.println("Naziv predmeta: " + this.predmet + " - " + this.ocena);
        System.out.println("Student: " + this.student + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.profesor);
    }
}

