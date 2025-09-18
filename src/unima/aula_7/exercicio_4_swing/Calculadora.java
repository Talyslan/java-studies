package unima.aula_7.exercicio_4_swing;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        try {
            String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
            int numero1 = Integer.parseInt(input1.trim());

            String input2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
            int numero2 = Integer.parseInt(input2.trim());

            int soma = numero1 + numero2;
            int subtracao = numero1 - numero2;
            int multiplicacao = numero1 * numero2;
            String divisao;

            if (numero2 != 0) {
                divisao = String.valueOf((double) numero1 / numero2);
            } else {
                divisao = "Divisão por zero não é permitida!";
            }

            String mensagem = "Resultados das operações:\n"
                    + numero1 + " + " + numero2 + " = " + soma + "\n"
                    + numero1 + " - " + numero2 + " = " + subtracao + "\n"
                    + numero1 + " * " + numero2 + " = " + multiplicacao + "\n"
                    + numero1 + " / " + numero2 + " = " + divisao;

            JOptionPane.showMessageDialog(null, mensagem, "Calculadora Swing", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números inteiros válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
