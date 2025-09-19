package unima.aula_8.exercicio_exceptions_2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
