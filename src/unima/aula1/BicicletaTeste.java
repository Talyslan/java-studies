package unima.aula1;

public class BicicletaTeste {
    public static void main(String[] args) {
        Bicicleta minhaBike = new Bicicleta("Vermelha");

        minhaBike.status();           // Mostra estado inicial
        minhaBike.andar();            // Tenta andar com velocidade zero

        minhaBike.acelerar(10);       // Acelera 10m/s
        minhaBike.andar();            // Agora já anda

        minhaBike.trocarMarcha(5);    // Troca para marcha 5
        minhaBike.status();           // Mostra status atualizado

        minhaBike.frear(3);           // Freia 3m/s
        minhaBike.status();

        minhaBike.frear(10);          // Freia mais do que a velocidade atual, deve parar
        minhaBike.andar();            // Deve informar que está parada

        minhaBike.parar();            // Garante que está parada
        minhaBike.status();

        minhaBike.setCor("Preta");    // Troca a cor da bicicleta
        System.out.println("Cor atual: " + minhaBike.getCor());
    }
}
