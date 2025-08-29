package unima.aula3_exercicio_forma_geometrica;

public abstract class FormaGeometrica {
	protected double lado; // tamanho do lado (formas regulares)

	public FormaGeometrica(double lado) {
		this.lado = lado;
	}

	public abstract double calcularDiametro();
	public abstract double calcularArea();
	public abstract double calcularCircunferencia();

	public void exibirDados() {
		System.out.println("Lado: " + lado);
		System.out.println("Diâmetro: " + calcularDiametro());
		System.out.println("Área: " + calcularArea());
		System.out.println("Circunferência: " + calcularCircunferencia());
	}
}
