package d02_06_2022_zadatak1;
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
// override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
public class Menadzer extends Radnik{

    public Menadzer(String imeIPrezime) {
        super(imeIPrezime);
    }

    @Override
    public double plataRadnika() {
        double plata = 0;
        for (int i = 0; i < sektori.size(); i++) {
            plata += sektori.get(i).getPlata();
        }
        return plata;
    }
}
