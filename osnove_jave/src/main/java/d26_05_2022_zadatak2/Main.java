package d26_05_2022_zadatak2;

public class Main {
    public static void main(String[] args) {
        FacebookPost post = new FacebookPost();
        post.setIme("Nikola Pavlovic");
        post.setTekst("Ovo je tekst moje prve objave!");
        Reakcija lajk = new Reakcija("like", "Milan Jovanovic");
        Reakcija srce = new Reakcija("srce", "Vladimir Minic");
        Reakcija smajli = new Reakcija("smajli", "Pavle Nikolic");
        Reakcija lajk2 = new Reakcija("like", "Nikola Pavlovic");

        post.reaguj(lajk);
        post.reaguj(srce);
        post.reaguj(smajli);
        post.reaguj(lajk2);

        post.stampa();



    }
}
