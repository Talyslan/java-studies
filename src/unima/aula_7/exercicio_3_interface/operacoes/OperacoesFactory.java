package unima.aula_7.exercicio_3_interface.operacoes;

import java.util.List;

public class OperacoesFactory {
    // ---- Binárias ---- //
    public static class Soma implements OperacaoMatematica {
        @Override
        public double calcular(double... n) { return n[0] + n[1]; }
        @Override
        public String getNome() { return "Soma (a + b)"; }
    }

    public static class Subtracao implements OperacaoMatematica {
        @Override
        public double calcular(double... n) { return n[0] - n[1]; }
        @Override
        public String getNome() { return "Subtração (a - b)"; }
    }

    public static class Multiplicacao implements OperacaoMatematica {
        @Override
        public double calcular(double... n) { return n[0] * n[1]; }
        @Override
        public String getNome() { return "Multiplicação (a * b)"; }
    }

    public static class Divisao implements OperacaoMatematica {
        @Override
        public double calcular(double... n) {
            if (n[1] == 0) throw new ArithmeticException("Divisão por zero!");
            return n[0] / n[1];
        }
        @Override
        public String getNome() { return "Divisão (a / b)"; }
    }

    // ---- Unárias ----
    public static class RaizQuadrada implements OperacaoMatematica {
        @Override
        public double calcular(double... n) {
            if (n[0] < 0) throw new ArithmeticException("Raiz de número negativo!");
            return Math.sqrt(n[0]);
        }
        @Override
        public String getNome() { return "Raiz Quadrada (√a)"; }
    }

    public static class Fatorial implements OperacaoMatematica {
        @Override
        public double calcular(double... n) {
            int x = (int) n[0];
            if (x < 0) throw new ArithmeticException("Fatorial não existe para negativos!");
            int fat = 1;
            for (int i = 2; i <= x; i++) fat *= i;
            return fat;
        }
        @Override
        public String getNome() { return "Fatorial (a!)"; }
    }

    public static class Inverso implements OperacaoMatematica {
        @Override
        public double calcular(double... n) {
            if (n[0] == 0) throw new ArithmeticException("Inverso de zero não existe!");
            return 1 / n[0];
        }
        @Override
        public String getNome() { return "Inverso (1/a)"; }
    }

    // ---- Retorna todas ----
    public static List<OperacaoMatematica> listarOperacoes() {
        return List.of(
                new Soma(),
                new Subtracao(),
                new Multiplicacao(),
                new Divisao(),
                new RaizQuadrada(),
                new Fatorial(),
                new Inverso()
        );
    }
}
