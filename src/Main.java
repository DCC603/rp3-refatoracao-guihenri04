public class Main {


    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "111.111.111-11", "31 1111-1111");
        Agencia agencia = new Agencia(111, 222222, "Gil");
        Conta minhaConta = new Conta(cliente, agencia, 0.00);

        minhaConta.depositar(450);
        minhaConta.sacar(50);
        minhaConta.sacar(50);
        minhaConta.sacar(50);

        System.out.println(minhaConta);
    }
}
