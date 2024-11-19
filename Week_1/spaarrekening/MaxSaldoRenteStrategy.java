package spaarrekening;

public class MaxSaldoRenteStrategy implements RenteStrategy {
    private double maxSaldo;

    public MaxSaldoRenteStrategy(double maxSaldo) {
        this.maxSaldo = maxSaldo;
    }

    @Override
    public double calculateRente(double saldo, double rentePercentage) {
        if (saldo > maxSaldo) {
            saldo = maxSaldo;
        }
        return saldo * (rentePercentage / 100);
    }
}