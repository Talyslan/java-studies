package unima.aula_8.exercicio_exceptions_0;

class ContaExcecao extends Exception {
    public ContaExcecao(String mensagem) {
        super(mensagem);
    }
}

class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void saca(double valor) throws ContaExcecao {
        if (valor > saldo) {
            throw new ContaExcecao("Saldo insuficiente!");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        Conta conta = new Conta(100.0);

        try {
            conta.saca(200.0);
        } catch (ContaExcecao e) {
            System.out.println("Erro no saque: " + e.getMessage());
        }
    }
}
