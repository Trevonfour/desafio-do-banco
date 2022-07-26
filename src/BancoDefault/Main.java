package BancoDefault;

public class Main {
    public static void main(String[] args) {

        Cliente alexandre = new Cliente();
        alexandre.setNome("Alexandre");

        Conta cc = new ContaCorrente(alexandre);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(alexandre);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
