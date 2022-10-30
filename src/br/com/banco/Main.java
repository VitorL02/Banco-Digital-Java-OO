package br.com.banco;

public class Main {
    public static void main(String[] args) {
        Cliente vitor = new Cliente();
        vitor.setNome("Vitor");
        Cliente robert = new Cliente();
        robert.setNome("Robert");


        Conta contaCorrente = new ContaCorrente(vitor);
        Conta contaCorrente2 = new ContaCorrente(robert);

        Conta contaPoupanca = new ContaPoupanca(vitor);
        Conta contaPoupanca2 = new ContaPoupanca(robert);

        contaCorrente.depositar(100);
        contaCorrente.imprimirExtrato();

        contaCorrente2.depositar(2000);
        contaCorrente2.imprimirExtrato();

        contaPoupanca.depositar(100);
        contaPoupanca.imprimirExtrato();

        contaPoupanca2.depositar(2000);
        contaPoupanca2.imprimirExtrato();

        contaCorrente.transferir(contaPoupanca,100);
        contaPoupanca.imprimirExtrato();
    }
}
