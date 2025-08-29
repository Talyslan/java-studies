package unima.aula4_heranca_polimorfismo;

public class Caminhao extends Veiculo {
    private double capacidade;
    private int numEixos;

    public Caminhao(String modelo, String placa, int anoFabr, double capacidade, int numEixos, double valor) {
        super(modelo, placa, anoFabr, valor);
        this.capacidade = capacidade;
        this.numEixos = numEixos;
    }

    @Override
    public void imprime() {
        System.out.printf("\nCaminhão: %s\nPlaca: %s\nAno Fabr: %d\nCapacidade: %.2f toneladas\nEixos: %d\nValor: R$ %.2f\n",
                modelo, placa, anoFabr, capacidade, numEixos, valor);
    }
}
