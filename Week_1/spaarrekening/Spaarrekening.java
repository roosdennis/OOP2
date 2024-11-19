package spaarrekening;

public final class Spaarrekening {

    private double saldo;
    private String rekeningnr;
    private double renteperc;
    private RenteStrategy renteStrategy;

    public Spaarrekening(String rekeningnr) {
        this.rekeningnr = rekeningnr;
    }

    public void setRenteperc(double renteperc) {
        this.renteperc = renteperc;
    }

    public void setRenteStrategy(RenteStrategy renteStrategy) {
        this.renteStrategy = renteStrategy;
    }

    public void stortBedrag(double bedrag) {
        saldo += bedrag;
    }

    public double getSaldo() {
        return saldo;
    }

    public void jaarVooruit() {
        if (renteStrategy != null) {
            saldo += renteStrategy.calculateRente(saldo, renteperc);
        }
    }

    public double getRenteperc() {
        return renteperc;
    }

    @Override
    public String toString() {
        return "spaarrekening.Spaarrekening{" +
                "saldo=" + saldo +
                ", rekeningnr='" + rekeningnr + '\'' +
                ", renteperc=" + renteperc +
                '}';
    }
}