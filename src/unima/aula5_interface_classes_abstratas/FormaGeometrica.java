package unima.aula5_interface_classes_abstratas;

public abstract class FormaGeometrica implements Figura {
    protected int numLados;

    public FormaGeometrica(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public void imprime() {
        System.out.println("Forma Geométrica com " + numLados + " lados.");
    }
}
