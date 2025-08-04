package unima.aula1;

interface IBicicleta {
    void andar();
    void parar();
    void acelerar(int incremento);
    void frear(int decremento);
    void trocarMarcha(int novaMarcha);

    void setVelocidade(int valor);
    void setMarcha(int valor);
    void setCor(String cor);

    int getVelocidade();
    int getMarcha();
    String getCor();

    void status();
}

public class Bicicleta implements IBicicleta {
    private int velocidade;
    private int marcha;
    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
        this.velocidade = 0;
        this.marcha = 1;
    }

    @Override
    public void andar() {
        if (velocidade == 0) {
            System.out.println("A bicicleta está parada. Aumente a velocidade para andar.");
            return;
        }
        System.out.println("A bicicleta está andando a " + velocidade + "m/s na marcha " + marcha + ".");
    }

    @Override
    public void parar() {
        velocidade = 0;
        System.out.println("A bicicleta foi parada. Velocidade atual: 0m/s.");
    }

    @Override
    public void acelerar(int incremento) {
        if (incremento <= 0) {
            System.out.println("Valor inválido para acelerar.");
            return;
        }
        velocidade += incremento;
        System.out.println("Acelerou " + incremento + "m/s. Velocidade atual: " + velocidade + "m/s.");
    }

    @Override
    public void frear(int decremento) {
        if (decremento <= 0) {
            System.out.println("Valor inválido para frear.");
            return;
        }
        velocidade = Math.max(velocidade - decremento, 0);
        System.out.println("Freou " + decremento + "m/s. Velocidade atual: " + velocidade + "m/s.");
    }

    @Override
    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha < 1 || novaMarcha > 18) {
            System.out.println("Marcha inválida. Escolha entre 1 e 18.");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Marcha alterada para " + marcha + ".");
    }

    @Override
    public void setVelocidade(int valor) {
        if (valor < 0) return;
        this.velocidade = valor;
    }

    @Override
    public void setMarcha(int valor) {
        if (valor < 1 || valor > 18) return;
        this.marcha = valor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public int getMarcha() {
        return marcha;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void status() {
        System.out.println("\n=== STATUS DA BICICLETA ===");
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + "m/s");
        System.out.println("Marcha: " + marcha);
        System.out.println("===========================\n");
    }
}
