package unima.aula_8.exercicio_exceptions_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sucesso = false;

        System.out.println("=== Eu sei dividir! ===");

        while (!sucesso) {
            try {
                System.out.print("Informe o primeiro valor: ");
                int x = sc.nextInt();

                System.out.print("Informe o segundo valor: ");
                int y = sc.nextInt();

                if (y == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida!");
                }

                double r =  ((double) x / y);
                System.out.println("O resultado da divisão é: " + r);
                sucesso = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números inteiros válidos!");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e);
            }
        }

        sc.close();
        System.out.println("Programa finalizado com sucesso!");
    }
}
