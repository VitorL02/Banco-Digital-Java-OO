package br.com.banco;

public class ContaCorrente extends  Conta{

    private static  int SEQUENCIAL = 0 ;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extato Conta Corrente ---");
        super.imprimirAtributosComuns();
    }
}
