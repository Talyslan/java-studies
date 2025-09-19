package unima.aula_8.exercicio_exceptions_0;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do limite do array!");
        }
    }

    static void metodo1() {
        System.out.println("inicio do método1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do método2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("fim do metodo2");
    }
}
