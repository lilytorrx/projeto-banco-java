public abstract class Conta implements ContaInterface {
    private int agencia;
    private int numeroConta;
    private double saldo;

    
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

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(Conta contaDestino, double valor) {

    }
}
