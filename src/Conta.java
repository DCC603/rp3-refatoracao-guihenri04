import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Cliente cliente;
    private Agencia agencia;
    private double saldo;

    private List<Operacao> operacoes;

    public Conta(Cliente cliente, Agencia agencia, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public Conta() {
        this(null, null, 0);
    }

    public void depositar(double valor) {
        Operacao op = new Deposito(valor);
        realizarOperacao(op);
    }

    public void sacar(double valor) {
        Operacao op = new Saque(valor);
        realizarOperacao(op);
    }

    private void realizarOperacao(Operacao op) {
        this.operacoes.add(op);
        this.saldo = op.aplicar(this.saldo);
    }

    private String gerarExtrato() {
        StringBuilder dadosExtrato = new StringBuilder();
        for (Operacao op : this.operacoes) {
            dadosExtrato.append(op.toString()).append("\n");
        }
        return dadosExtrato.toString();
    }

    public String toString() {
        return "-----CLIENTE-----\n" +
                cliente.toString() +
                "\n\n" +
                "-----CONTA-----\n" +
                agencia.toString() +
                String.format("\nSaldo: %.2f", this.saldo) +
                "\n\n" +
                "-----EXTRATO-----\n" +
                gerarExtrato() +
                "\n";
    }
}
