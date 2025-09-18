package unima.aula_7.exercicio_1_converter_temp;

import java.util.Scanner;

public class ConversorTemperaturaCLI {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        printBanner();

        while (running) {
            System.out.println(BOLD + BLUE + "\n===== MENU =====" + RESET);
            System.out.println("1 - Converter Fahrenheit → Celsius");
            System.out.println("2 - Converter Celsius → Fahrenheit");
            System.out.println("0 - Sair");
            System.out.print(YELLOW + "Escolha: " + RESET);

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    converterFparaC(sc);
                    break;
                case 2:
                    converterCparaF(sc);
                    break;
                case 0:
                    running = false;
                    System.out.println(RED + "\nEncerrando... Até mais!" + RESET);
                    break;
                default:
                    System.out.println(RED + "Opção inválida!" + RESET);
            }
        }

        sc.close();
    }

    public static void printBanner() {
        System.out.println(CYAN + BOLD);
        System.out.println("############################################");
        System.out.println("#        CONVERSOR DE TEMPERATURA 🌡️       #");
        System.out.println("############################################");
        System.out.println(RESET);
    }

    public static void converterCparaF(Scanner sc) {
        System.out.print("\nDigite a temperatura em Celsius: ");
        double c = sc.nextDouble();

        double f = (9 * c) / 5 + 32;

        System.out.println(GREEN + "\n=== RESULTADO ===" + RESET);
        System.out.printf("Celsius   : %.2f °C\n", c);
        System.out.printf("Fahrenheit: %.2f °F\n", f);

        System.out.println(CYAN + "\nFórmula aplicada: F = (9 * C) / 5 + 32" + RESET);
    }

    public static void converterFparaC(Scanner sc) {
        System.out.print("\nDigite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * (5.0 / 9.0);

        System.out.println(GREEN + "\n=== RESULTADO ===" + RESET);
        System.out.printf("Fahrenheit: %.2f °F\n", f);
        System.out.printf("Celsius   : %.2f °C\n", c);

        System.out.println(CYAN + "\nFórmula aplicada: C = (F - 32) * (5 / 9)" + RESET);
    }
}
