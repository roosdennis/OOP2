package spaarrekening;

public class ActieRenteStrategy implements RenteStrategy {
    private double extraRente;

    public ActieRenteStrategy(double extraRente) {
        this.extraRente = extraRente;
    }

    @Override
    public double calculateRente(double saldo, double rentePercentage) {
        return saldo * ((rentePercentage + extraRente) / 100);
    }
}