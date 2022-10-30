package br.com.banco;

public abstract class Conta implements  OperacoesBancarias{
    protected static final int AGENCIA_PADRAO = 1 ;

    protected int agencia;
    protected int numero;
    protected double saldo;


    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        if(saldo < valor){
            System.out.println("Valor solicitado maior que o saldo disponivel");
            return;
        }
        saldo = saldo - valor;

    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirAtributosComuns() {
        System.out.println("Nome do Cliente: " + this.cliente.getNome());
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero Da Conta: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
