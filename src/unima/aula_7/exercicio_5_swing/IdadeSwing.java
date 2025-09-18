package unima.aula_7.exercicio_5_swing;

import javax.swing.JOptionPane;

public class IdadeSwing {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            if (nome == null || nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome inválido! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String inputIdade = JOptionPane.showInputDialog("Digite sua idade:");
            int idade = Integer.parseInt(inputIdade.trim());
            if (idade < 0) {
                JOptionPane.showMessageDialog(null, "Idade não pode ser negativa!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String categoria;
            String emoji;
            if (idade <= 12) {
                categoria = "você é uma criança!";
                emoji = "👶";
            } else if (idade <= 19) {
                categoria = "você é um adolescente!";
                emoji = "🧑";
            } else if (idade <= 59) {
                categoria = "você é um adulto!";
                emoji = "🧑‍💼";
            } else {
                categoria = "você é um idoso!";
                emoji = "🧓";
            }

            String mensagem = "Olá, " + nome + "! Você tem " + idade + " anos de idade.\n" + categoria + " " + emoji;

            JOptionPane.showMessageDialog(null, mensagem, "Informação Pessoal", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira apenas números válidos para a idade!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
