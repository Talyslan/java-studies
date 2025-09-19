package unima.aula_8.exercicio_exceptions_2;

public class Exercicio02 {
    public static int[] criarVetor(int n) {
        try {
            return new int[n];
        } catch (NegativeArraySizeException e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        int[] vetor = criarVetor(-5);
        if (vetor != null) {
            System.out.println("Vetor criado com sucesso!");
        }
    }

}
