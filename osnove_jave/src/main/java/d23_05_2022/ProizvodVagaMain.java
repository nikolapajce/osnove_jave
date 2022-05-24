package d23_05_2022;

public class ProizvodVagaMain {
    public static void main(String[] args) {
        Proizvod prvi = new Proizvod(123456, "Kafa", 183.00);
        Proizvod drugi = new Proizvod(789654, "Cokolada", 254.00);

        Vaga kilogramiprvi = new Vaga();
        kilogramiprvi.mernaJedinica = "kg";
        kilogramiprvi.proizvod = prvi;

        Vaga funteprvi = new Vaga();
        funteprvi.mernaJedinica = "lb";
        funteprvi.proizvod = prvi;

        Vaga kilogramidrugi = new Vaga();
        kilogramidrugi.mernaJedinica = "kg";
        kilogramidrugi.proizvod = drugi;

        Vaga funtedrugi = new Vaga();
        funtedrugi.mernaJedinica = "lb";
        funtedrugi.proizvod = drugi;

        kilogramiprvi.stampaj(0.1);
        System.out.println();
        funteprvi.stampaj(2);
        System.out.println();
        kilogramidrugi.stampaj(0.5);
        System.out.println();
        funtedrugi.stampaj(1);


    }
}
