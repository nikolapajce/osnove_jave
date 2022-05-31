package d30_05_2022_zadatak1;

public class Main {
    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("Uvod u sociologiju", 5, "Ljubisa Mitrovic");
        Ispit ispit2 = new Ispit("Anticke teorije", 8, "Ljubinko Milosavljevic");
        Ispit ispit3 = new Ispit("Moderne teorije", 9, "Ljubinko Milosavljevic");
        Ispit ispit4 = new Ispit("Engleski jezik I", 10, "Engleskinja Engleskovic");
        Ispit ispit5 = new Ispit("Sociologija kulture", 10, "Nikola Bozilovic");
        Ispit ispit6 = new Ispit("Sociologija grada", 5, "Miomir Naumovic");
        Ispit ispit7 = new Ispit("Sociologija porodice", 9, "Dragana Zaharijevska");
        Ispit ispit8 = new Ispit("Sociologija religije", 10, "Danijela Golubovic");
        Ispit ispit9 = new Ispit("Devijacije drustva", 10, "Milos Jovanovic");
        Ispit ispit10 = new Ispit("Sociologija politike", 8, "Branislav Branislavljevic");

        Student nikola = new Student(2681, "Nikola Pavlovic", "osnovne");

        nikola.dodajIspit(ispit1);
        nikola.dodajIspit(ispit2);
        nikola.dodajIspit(ispit3);
        nikola.dodajIspit(ispit4);
        nikola.dodajIspit(ispit5);
        nikola.dodajIspit(ispit6);
        nikola.dodajIspit(ispit7);
        nikola.dodajIspit(ispit8);
        nikola.dodajIspit(ispit9);
        nikola.dodajIspit(ispit10);

        nikola.stampa();
    }
}
