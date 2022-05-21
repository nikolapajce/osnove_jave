package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {

        FacebookPost prvi = new FacebookPost();
        prvi.objavio = "Nikola Pavlovic";
        prvi.naKomProfilu = "Pavle Nikolic";
        prvi.tekst = "Sta radis brajko?";
        prvi.lajkovi = 700;
        prvi.deljenje = 390;

        FacebookPost drugi = new FacebookPost("Pera Peric", "Mika Mikic", "Kakvu sam stvar juce cuo...");
        drugi.lajkovi = 1;
        drugi.deljenje = 2;

        prvi.like();
        prvi.like();
        prvi.like();

        drugi.dislike();
        drugi.dislike();
        drugi.dislike();
        drugi.share();

        prvi.print();
        System.out.println();
        drugi.print();
    }
}
