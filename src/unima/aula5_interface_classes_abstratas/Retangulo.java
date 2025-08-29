package unima.aula5_interface_classes_abstratas;

public class Retangulo extends FormaGeometrica {
    private double base, altura;

    public Retangulo(double base, double altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = (base > 0) ? base : 0;
    }

    public void setAltura(double altura) {
        this.altura = (altura > 0) ? altura : 0;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public void imprime() {
        System.out.println("Retângulo:");
        System.out.println("Base: " + base + ", Altura: " + altura);
        System.out.println("Área: " + area());
    }
}
