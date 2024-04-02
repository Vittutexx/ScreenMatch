public class ContaBancaria {
    private String numeroConta;
    private int saldo;

    public ContaBancaria(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo =  saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
