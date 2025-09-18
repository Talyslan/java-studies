package unima.aula_7.exercicio_6_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IdadeComBotao extends JFrame implements ActionListener {
    private JTextField campoNome;
    private JTextField campoIdade;
    private JButton botaoEnviar;
    private JButton botaoLimpar;
    private JLabel resultadoLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(IdadeComBotao::new);
    }

    public IdadeComBotao() {
        setTitle("Informações da Pessoa");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel painelPrincipal = new JPanel(new GridLayout(3, 2, 10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        painelPrincipal.add(new JLabel("Nome:"));
        campoNome = new JTextField();
        painelPrincipal.add(campoNome);

        painelPrincipal.add(new JLabel("Idade:"));
        campoIdade = new JTextField();
        painelPrincipal.add(campoIdade);

        botaoEnviar = new JButton("Enviar");
        botaoEnviar.addActionListener(this);
        painelPrincipal.add(botaoEnviar);

        botaoLimpar = new JButton("Limpar");
        botaoLimpar.addActionListener(this);
        painelPrincipal.add(botaoLimpar);

        resultadoLabel = new JLabel("Preencha seus dados acima", SwingConstants.CENTER);
        resultadoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultadoLabel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

        add(painelPrincipal, BorderLayout.CENTER);
        add(resultadoLabel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoEnviar) {
            String nome = campoNome.getText().trim();
            String idadeTexto = campoIdade.getText().trim();

            if (nome.isEmpty() || idadeTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                int idade = Integer.parseInt(idadeTexto);
                if (idade < 0) {
                    JOptionPane.showMessageDialog(this, "Idade não pode ser negativa!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String categoria;
                Color cor;

                if (idade <= 12) {
                    categoria = "Criança";
                    cor = Color.BLUE;
                } else if (idade <= 19) {
                    categoria = "Adolescente";
                    cor = Color.MAGENTA;
                } else if (idade <= 59) {
                    categoria = "Adulto";
                    cor = Color.GREEN;
                } else {
                    categoria = "Idoso";
                    cor = Color.ORANGE;
                }

                resultadoLabel.setText("<html>Olá, <b>" + nome + "</b>!<br>Você tem <b>" + idade + "</b> anos.<br>Categoria: <b>" + categoria + "</b></html>");
                resultadoLabel.setForeground(cor);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite apenas números válidos para a idade!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == botaoLimpar) {
            campoNome.setText("");
            campoIdade.setText("");
            resultadoLabel.setText("Preencha seus dados acima");
            resultadoLabel.setForeground(Color.BLACK);
        }
    }
}
