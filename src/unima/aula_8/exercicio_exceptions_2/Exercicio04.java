package unima.aula_8.exercicio_exceptions_2;

class NotALetterException extends Exception {
    public NotALetterException(String message) {
        super(message);
    }
}

class NotUpperCaseException extends Exception {
    public NotUpperCaseException(String message) {
        super(message);
    }
}

public class Exercicio04 {
    public static void verificarMaiusculas(String s) throws NotALetterException, NotUpperCaseException {
        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new NotALetterException("O caractere '" + c + "' não é uma letra.");
            }
            if (!Character.isUpperCase(c)) {
                throw new NotUpperCaseException("O caractere '" + c + "' não é maiúsculo.");
            }
        }
        System.out.println("A string é composta apenas por letras maiúsculas.");
    }

    public static void main(String[] args) {
        try {
            verificarMaiusculas("JAVA");
            verificarMaiusculas("Java");
        } catch (NotALetterException | NotUpperCaseException e) {
            System.out.println(e.getMessage());
        }
    }
}

