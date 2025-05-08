public abstract class Conta implements ContaInterface {
    private int agencia;
    private int numeroConta;
    private double saldo;
    private static int agenciaPadrao = 1; 
    private static int sequencial = 1;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = agenciaPadrao;
        this.numeroConta = sequencial++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
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
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Titular: " + this.cliente.getNome());
    }
}
