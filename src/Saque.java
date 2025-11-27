public class Saque extends Operacao {

    public Saque(double valor) {
        super(valor);
    }

    @Override
    public String getTipo() {
        return "Saque";
    }

    @Override
    public double aplicar(double saldo) {
        return saldo - getValor();
    }
}
