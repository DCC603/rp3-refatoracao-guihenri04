public abstract class Operacao {

    private double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract String getTipo();

    public abstract double aplicar(double saldo);

    @Override
    public String toString() {
        return this.getTipo() + ":\t" + this.valor;
    }
}
