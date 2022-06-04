package d02_06_2022_zadatak1;
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
// ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
// suma plata svih sektor / broj sektora * 0.5
// override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
public class Magacioner extends Radnik{
    public Magacioner(String imeIPrezime) {
        super(imeIPrezime);
    }
    private double prosecnaPlata () {
        double suma = 0;
        for (int i = 0; i < sektori.size(); i++) {
            suma += sektori.get(i).getPlata();
        }
        return (suma / sektori.size()) * 0.5;
    }
    @Override
    public double plataRadnika() {
        return prosecnaPlata() * sektori.size();
    }
}
