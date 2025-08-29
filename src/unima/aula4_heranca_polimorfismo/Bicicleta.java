package unima.aula4_heranca_polimorfismo;

public class Bicicleta extends Veiculo {
    private String tipo;

    public Bicicleta(String modelo, int anoFabr, String tipo, double valor) {
        super(modelo, "SEM-PLACA", anoFabr, valor);
        this.tipo = tipo;
    }

    @Override
    public void imprime() {
        System.out.printf("\nBicicleta: %s\nAno: %d\nTipo: %s\nValor: R$ %.2f\n",
                modelo, anoFabr, tipo, valor);
    }
}
