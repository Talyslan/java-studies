package unima.aula6_tudo_passado;

public class Carro extends Veiculo {
    private int anoModelo;
    private int numPortas;

    public Carro(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor) {
        super(modelo, placa, anoFabr, valor);
        this.anoModelo = anoModelo;
        this.numPortas = numPortas;
    }

    @Override
    public void imprime() {
        System.out.printf("\nCarro: %s\nPlaca: %s\nAno Fabr: %d\nAno Modelo: %d\nPortas: %d\nValor: R$ %.2f\n",
                modelo, placa, anoFabr, anoModelo, numPortas, valor);
    }
}
