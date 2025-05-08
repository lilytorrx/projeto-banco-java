public class Main {
    public static void main(String [] args) {
        Cliente lidia = new Cliente();
        Cliente nathan = new Cliente();
        lidia.setNome("Lídia");
        nathan.setNome("Nathan");

        Conta corrente = new ContaCorrente(lidia);
        Conta poupanca = new ContaPoupanca(nathan);
        
        
    }
}
