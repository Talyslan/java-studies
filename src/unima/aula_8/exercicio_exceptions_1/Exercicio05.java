package unima.aula_8.exercicio_exceptions_1;

import java.util.Scanner;

// LETRA A: Exceções
class TemperatureException extends Exception {
    public TemperatureException(String message) {
        super(message);
    }
}

class FahrenheitException extends TemperatureException {
    public FahrenheitException(String message) {
        super(message);
    }
}

// LETRA B: Classe utilitária
class Utils {
    public static double toCelsius(double fahrenheit) throws FahrenheitException {
        if (fahrenheit < -459.67) {
            throw new FahrenheitException("Erro: temperatura abaixo do zero absoluto!");
        }
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double f = scanner.nextDouble();
        try {
            double c = Utils.toCelsius(f);
            System.out.printf("Temperatura em Celsius: %.2f°C%n", c);
        } catch (FahrenheitException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
