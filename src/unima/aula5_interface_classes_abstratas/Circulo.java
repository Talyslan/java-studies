package unima.aula5_interface_classes_abstratas;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super(0);
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = (raio > 0) ? raio : 0;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public void imprime() {
        System.out.println("Círculo:");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area());
    }
}
