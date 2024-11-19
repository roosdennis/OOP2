import spaarrekening.*;

public class Main {

    public static void main(String[] args) {

        // Rekening met 4,3% rente
        Spaarrekening spaarrekening = new Spaarrekening("32423432");
        spaarrekening.setRenteperc(4.3);
        spaarrekening.setRenteStrategy(new NormaleRenteStrategy());
        spaarrekening.stortBedrag(1000);
        System.out.println("Normale Rekening: " + spaarrekening);
        spaarrekening.jaarVooruit();
        System.out.println("Normale Rekening: " + spaarrekening);

        // Rekening met 0,1% extra actierente bovenop de normale rente
        Spaarrekening actieSpaarrekening = new Spaarrekening("32423433");
        actieSpaarrekening.setRenteperc(4.3);
        actieSpaarrekening.setRenteStrategy(new ActieRenteStrategy(0.1));
        actieSpaarrekening.stortBedrag(1000);
        System.out.println("Actie Rekening: " + actieSpaarrekening);
        actieSpaarrekening.jaarVooruit();
        System.out.println("Actie Rekening: " + actieSpaarrekening);

        // Rekening 4,3% rente maar voor een saldo tot en met 1.000.000
        Spaarrekening maxSaldoSpaarrekening = new Spaarrekening("32423434");
        maxSaldoSpaarrekening.setRenteperc(4.3);
        maxSaldoSpaarrekening.setRenteStrategy(new MaxSaldoRenteStrategy(1000000));
        maxSaldoSpaarrekening.stortBedrag(100001);
        System.out.println("Grote Rekening: " + maxSaldoSpaarrekening);
        maxSaldoSpaarrekening.jaarVooruit();
        System.out.println("Grote Rekening: " + maxSaldoSpaarrekening);
    }
}