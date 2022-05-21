package d19_05_2022;

public class FacebookPost {

    public String objavio;
    public String naKomProfilu;
    public String tekst;
    public int lajkovi;
    public int deljenje;

    public void like () {
        this.lajkovi++;
    }

    public void dislike () {
        this.lajkovi--;
        if (this.lajkovi < 0) {
            this.lajkovi = 0;
        }
    }

    public void share (){
        this.deljenje++;
    }

    public void print(){
        System.out.println(this.objavio + " >>> " + this.naKomProfilu);
        System.out.println(this.tekst);
        System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenje);
    }
}

//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1