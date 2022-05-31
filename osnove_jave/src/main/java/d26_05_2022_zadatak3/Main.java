package d26_05_2022_zadatak3;

public class Main {
    public static void main(String[] args) {
        HistoryPage google = new HistoryPage("Google", "google.com", 12, 45);
        HistoryPage yahoo = new HistoryPage("Yahoo", "yahoo.com", 13, 20);
        HistoryPage itBootcamp = new HistoryPage("IT Bootcamp", "itbootcamp.rs", 20, 29);
        HistoryPage youtube = new HistoryPage("Youtube", "youtube.com", 21, 15);
        HistoryPage spotify = new HistoryPage("Spotify", "spotify.com", 21, 30);

        History istorija = new History();
        istorija.otvoriStranicu(google);
        istorija.otvoriStranicu(yahoo);
        istorija.otvoriStranicu(itBootcamp);
        istorija.otvoriStranicu(youtube);
        istorija.otvoriStranicu(spotify);

        istorija.sacuvajKredencija("Google", "nikola", "123456");
        istorija.sacuvajKredencija("Spotify", "bla", "123456");
        istorija.sacuvajKredencija("Youtube", "bla", "123456");
        istorija.sacuvajKredencija("IT Bootcamp", "bla", "123456");
        istorija.sacuvajKredencija("Yahoo", "bla", "123456");


        istorija.obrisiKolaciceSatVremena(21,30);

        istorija.pogledajIstoriju();

    }
}
