package entidades;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Double valor) {
        super(cliente);
        saldo = valor;
    }

    @Override
    public void sacar(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void tranferir(Double valor, Conta destino) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Valor insuficiente na conta para efetuar a transferência!");
        }
    }

}
