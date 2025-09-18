package unima.aula_7.exercicio_3_interface;

import unima.aula_7.exercicio_3_interface.operacoes.OperacaoMatematica;
import unima.aula_7.exercicio_3_interface.operacoes.OperacoesFactory;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<OperacaoMatematica> operacoes = OperacoesFactory.listarOperacoes();

        while (true) {
            System.out.println("\n==== CALCULADORA POLIMÓRFICA ====");
            for (int i = 0; i < operacoes.size(); i++) {
                System.out.printf("%d - %s%n", i + 1, operacoes.get(i).getNome());
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int escolha = sc.nextInt();
            if (escolha == 0) break;
            if (escolha < 1 || escolha > operacoes.size()) {
                System.out.println("Opção inválida!");
                continue;
            }

            OperacaoMatematica op = operacoes.get(escolha - 1);

            double resultado;
            try {
                if (op instanceof OperacoesFactory.Soma ||
                        op instanceof OperacoesFactory.Subtracao ||
                        op instanceof OperacoesFactory.Multiplicacao ||
                        op instanceof OperacoesFactory.Divisao) {

                    System.out.print("Digite a: ");
                    double a = sc.nextDouble();
                    System.out.print("Digite b: ");
                    double b = sc.nextDouble();
                    resultado = op.calcular(a, b);

                } else {
                    System.out.print("Digite a: ");
                    double a = sc.nextDouble();
                    resultado = op.calcular(a);
                }

                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Encerrando...");
    }
}
