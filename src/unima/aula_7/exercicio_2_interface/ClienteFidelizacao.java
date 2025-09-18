package unima.aula_7.exercicio_2_interface;

public class ClienteFidelizacao extends Cliente {
    private double bonus;
    private String validade;

    public ClienteFidelizacao(String nome, String endereco, InfoCliente info, double bonus, String validade) {
        super(nome, endereco, info);
        this.bonus = bonus;
        this.validade = validade;
    }

    @Override
    public void exibirCliente() {
        super.exibirCliente();
        System.out.println("Bônus acumulado: " + bonus);
        System.out.println("Validade: " + validade);
    }
}
