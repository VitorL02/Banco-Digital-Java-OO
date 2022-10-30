package br.com.banco;

import java.sql.SQLOutput;

public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 600;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extato Conta Poupança ---");
        super.imprimirAtributosComuns();
    }


}
