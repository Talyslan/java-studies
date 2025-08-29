package unima.aula5_interface_classes_abstratas;

public class TesteFormas {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(5);
        formas[1] = new Triangulo(4, 3);
        formas[2] = new Retangulo(6, 2);

        for (FormaGeometrica f : formas) {
            f.imprime();
            System.out.println("----------------------");
        }
    }
}
