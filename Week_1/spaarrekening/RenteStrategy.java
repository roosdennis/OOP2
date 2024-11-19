package spaarrekening;

public interface RenteStrategy {
    double calculateRente(double saldo, double rentePercentage);
}