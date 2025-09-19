package unima.aula_8.exercicio_exceptions_1;

import java.io.EOFException;
import java.io.IOException;

public class TestB {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        try {
            primeiro(x);
            System.out.println("Apoś  primeiro");
        } catch (IllegalArgumentException e) {
            System.out.println("trata primeiro");
        }
        System.out.println("saiu primeiro");
    }

    static void primeiro(int x)
            throws IllegalArgumentException {
        try {
            segundo(x);
            System.out.println("depois segundo");
        } catch (IOException e) {
            System.out.println("trata segundo");
        }
        System.out.println("saiu segundo");
    }

    static void segundo(int x)
            throws IllegalArgumentException,
            IOException {
        try {
            switch (x) {
                case 0:
                    throw new IllegalArgumentException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new EOFException();
            }
        //System.out.print(a + "," + b + "," + c + "," + d + "," + f + "," + g);
        System.out.println("depois switch");
        } catch (EOFException e) {
                System.out.println("trata terceiro");
        }

    }
}

