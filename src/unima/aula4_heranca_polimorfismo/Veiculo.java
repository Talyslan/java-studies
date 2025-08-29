package unima.aula4_heranca_polimorfismo;

public class Veiculo {
    protected String modelo;
    protected String placa;
    protected int anoFabr;
    protected double valor;

    public Veiculo() {
        this("Desconhecido", "XXX0000", 2000, 0.0);
    }

    public Veiculo(String modelo, String placa, int anoFabr, double valor) {
        this.modelo = modelo;
        this.placa = placa;
        this.anoFabr = anoFabr;
        this.valor = valor;
    }

    // getters e setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getAnoFabr() { return anoFabr; }
    public void setAnoFabr(int anoFabr) { this.anoFabr = anoFabr; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public void imprime() {
        System.out.printf("\nVeículo: %s\nPlaca: %s\nAno: %d\nValor: R$ %.2f\n",
                modelo, placa, anoFabr, valor);
    }

    public void deprecia(double percentual) {
        valor -= valor * (percentual / 100);
    }

    public void deprecia(double percentual, int anos) {
        for (int i = 0; i < anos; i++) {
            deprecia(percentual);
        }
    }
}
