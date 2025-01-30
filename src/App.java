import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("Teteu");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente, 100.0);

        corrente.depositar(100.0);

        System.out.println("Saldo conta corrente: " + String.format("%.2f", corrente.getSaldo()));
        System.out.println("Saldo conta poupança: " + String.format("%.2f", poupanca.getSaldo()));
        System.out.println("======");

        corrente.tranferir(50.0, poupanca);

        System.out.println("Saldo conta corrente: " + String.format("%.2f", corrente.getSaldo()));
        System.out.println("Saldo conta poupança: " + String.format("%.2f", poupanca.getSaldo()));
        System.out.println("======");

        poupanca.sacar(200.0);

        System.out.println("Saldo conta corrente: " + String.format("%.2f", corrente.getSaldo()));
        System.out.println("Saldo conta poupança: " + String.format("%.2f", poupanca.getSaldo()));

    }
}
