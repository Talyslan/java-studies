package unima.aula3_exercicio_forma_geometrica;

public class PoligonoRegular extends FormaGeometrica {
    private int numeroLados;

    public PoligonoRegular(int numeroLados, double lado) {
        super(lado);
        this.numeroLados = numeroLados;
    }

    @Override
    public double calcularDiametro() {
        // Diâmetro = 2 * raio da circunferência circunscrita
        return 2 * (lado / (2 * Math.sin(Math.PI / numeroLados)));
    }

    @Override
    public double calcularArea() {
        // Fórmula área do polígono regular
        return (numeroLados * lado * lado) / (4 * Math.tan(Math.PI / numeroLados));
    }

    @Override
    public double calcularCircunferencia() {
        // Perímetro
        return numeroLados * lado;
    }

    @Override
    public void exibirDados() {
        System.out.println("Polígono de " + numeroLados + " lados");
        super.exibirDados();
    }
}
