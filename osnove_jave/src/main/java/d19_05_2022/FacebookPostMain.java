package d19_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {

        FacebookPost prvi = new FacebookPost();
        prvi.objavio = "Nikola Pavlovic";
        prvi.naKomProfilu = "Pavle Nikolic";
        prvi.tekst = "Sta radis brajko?";
        prvi.lajkovi = 700;
        prvi.deljenje = 390;

        FacebookPost drugi = new FacebookPost();
        drugi.objavio = "Pera Peric";
        drugi.naKomProfilu = "Mika MIkic";
        drugi.tekst = "Ljudi necete verovati sta sam video!!!";
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
