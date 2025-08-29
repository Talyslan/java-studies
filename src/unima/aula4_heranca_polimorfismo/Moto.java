package unima.aula4_heranca_polimorfismo;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, String placa, int anoFabr, int cilindradas, double valor) {
        super(modelo, placa, anoFabr, valor);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprime() {
        System.out.printf("\nMoto: %s\nPlaca: %s\nAno Fabr: %d\nCilindradas: %dcc\nValor: R$ %.2f\n",
                modelo, placa, anoFabr, cilindradas, valor);
    }
}
