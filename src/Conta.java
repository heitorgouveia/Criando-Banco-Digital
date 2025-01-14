

public abstract class Conta implements Iconta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static  int AGENCIA_PADRÃO = 1;
    protected static  int SEQUENCIAL = 1;
    protected Conta contaDestino;
    protected Cliente cliente;

    

    public Conta (Cliente cliente){
        this.agencia = AGENCIA_PADRÃO;
        this.numero = SEQUENCIAL++;
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
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    
}
    protected void imprimirInfos() {
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Número: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
}

}