package unima.aula3_exercicio_forma_geometrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica:");
        System.out.println("1 - Triângulo");
        System.out.println("2 - Quadrilátero");
        System.out.println("3 - Pentágono");
        System.out.println("4 - Hexágono");
        System.out.println("5 - Decágono");
        int opcao = sc.nextInt();

        System.out.print("Digite o tamanho do lado: ");
        double lado = sc.nextDouble();

        FormaGeometrica forma = null;

        switch (opcao) {
            case 1 -> forma = new Triangulo(lado);
            case 2 -> forma = new Quadrilatero(lado);
            case 3 -> forma = new Pentagono(lado);
            case 4 -> forma = new Hexagono(lado);
            case 5 -> forma = new Decagono(lado);
            default -> System.out.println("Opção inválida!");
        }

        if (forma != null) {
            forma.exibirDados();
        }

        sc.close();
    }
}
