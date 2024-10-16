package ex4;

class ContaBancaria {
    private String numeroDaConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0; // Inicializa o saldo como 0
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$ " + valor + ".");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Método para ver o saldo
    public void verSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria("12345-6");

        // Testando os métodos
        conta.verSaldo(); // Ver saldo inicial

        conta.depositar(1000); // Depositar R$ 1000
        conta.verSaldo(); // Ver saldo após depósito

        conta.sacar(200); // Sacar R$ 200
        conta.verSaldo(); // Ver saldo após saque

        conta.sacar(900); // Tentar sacar R$ 900 (saldo insuficiente)
        conta.verSaldo(); // Ver saldo após tentativa de saque

        conta.depositar(-50); // Tentar depositar um valor inválido
        conta.sacar(-30); // Tentar sacar um valor inválido
    }
}

