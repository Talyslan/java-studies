package unima.aula_8.exercicio_exceptions_2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a primeira string: ");
            String s1 = sc.nextLine();

            System.out.print("Digite a segunda string: ");
            String s2 = sc.nextLine();

            int comparacao = s1.compareTo(s2);

            if (comparacao > 0) {
                System.out.println("A primeira string é maior.");
            } else if (comparacao < 0) {
                System.out.println("A primeira string é menor.");
            } else {
                System.out.println("As strings são iguais.");
            }

        } catch (NullPointerException e) {
            System.out.println("Erro: uma das strings é nula!");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
