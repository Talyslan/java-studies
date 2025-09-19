package unima.aula_8.exercicio_exceptions_0;

class ContaExcecao2 extends Exception {
    private double saldoDisponivel;

    public ContaExcecao2(String mensagem, double saldoDisponivel) {
        super(mensagem);
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
}

class Conta2 {
    private double saldo;

    public Conta2(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void saca(double valor) throws ContaExcecao2 {
        if (valor > saldo) {
            throw new ContaExcecao2("Saldo insuficiente!", saldo);
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Exercicio04 {
    public static void main(String[] args) {
        Conta2 conta = new Conta2(100.0);

        try {
            conta.saca(200.0);
        } catch (ContaExcecao2 e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Saldo atual disponível: " + e.getSaldoDisponivel());
        }
    }
}
