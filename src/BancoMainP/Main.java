package BancoMainP;

public class Main {
    public static void main(String[] args) {
        Cliente z = new Cliente("FJZ");
        ContaCorrente cc = new ContaCorrente(z);
        ContaPoupanca poupanca = new ContaPoupanca(z);

        cc.depositar(100);
        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
