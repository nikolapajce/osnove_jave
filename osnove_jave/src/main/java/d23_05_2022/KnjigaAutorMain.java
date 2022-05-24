package d23_05_2022;
// U glavnom programu napraviti vise autora sa vise knjiga.
public class KnjigaAutorMain {

    public static void main(String[] args) {
        Autor prvi = new Autor("Nikola", "Pavlovic");
        Autor drugi = new Autor("Pavle", "Nikolic");
        Autor treci = new Autor("Pera", "Peric");
        Autor cetvrti = new Autor("Fjodor", "Dostojevski");

        Knjiga prva = new Knjiga("Braca Karamazovi", cetvrti);
        prva.isbn = 123456789;
        prva.godina = 1880;
        Knjiga druga = new Knjiga("Perina knjiga", treci);
        druga.isbn = 987654321;
        druga.godina = 2022;
        Knjiga treca = new Knjiga("Putesestvije Nikoline", prvi);
        treca.isbn = 777222666;
        treca.godina = 2019;
        Knjiga cetvrta = new Knjiga("Moje iskustvo na IT Bootcampu", drugi);
        cetvrta.isbn = 111000222;
        cetvrta.godina = 1992;

        prva.stampa();
        System.out.println("----------------------------------");
        druga.stampa();
        System.out.println("----------------------------------");
        treca.stampa();
        System.out.println("----------------------------------");
        cetvrta.stampa();

    }
}
