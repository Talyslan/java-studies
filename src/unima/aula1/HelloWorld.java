package unima.aula1;

interface IUtils {
    void printText(String text);
}

class Utils implements IUtils {
    @Override
    public void printText(String text) {
        System.out.println(text);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        IUtils util = new Utils();
        util.printText("Hello, world!");
    }
}
