package entidades;

public abstract class Conta {

    private static final int AGENCIA = 1;
    private static int NUMERO_CONTA = 1;

    protected Integer agencia;
    protected Integer numeroConta;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA;
        this.numeroConta = NUMERO_CONTA++;
        this.cliente = cliente;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract void sacar(Double valor);

    public abstract void depositar(Double valor);

    public abstract void tranferir(Double valor, Conta destino);

}
