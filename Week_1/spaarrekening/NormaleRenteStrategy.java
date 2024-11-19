package spaarrekening;

public class NormaleRenteStrategy implements RenteStrategy {
    @Override
    public double calculateRente(double saldo, double rentePercentage) {
        return saldo * (rentePercentage / 100);
    }
}