package studies;

import java.util.ArrayList;

public class BasicSyntax {
    public static void main(String[] args) {
        /*
        Primitives Types

        * interges

        byte => 8 bits: -128 a 127
        short => 16 bits: -32.768 a 32.767
        int => 32 bits: -2.147.483.648 a 2.147.483.647
        long => 64 bits: -9223.372.036.854.755.808 a 9.223.372.036.854.775.807

        * decimals

        float => 32 bits: 30.32f => simple precision
        double => 64 bits: 30.34343 => double precision

        * characters

        char => unique character: single quotes ('')
        String => more than one character: double quotes ("")

        * boolean

        boolean => true or false
         */

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000L;
        float f = 10.4f;
        double d = 20.2456;
        char c = 'C';
        String str = "I'm learning java now.";
        boolean bool = false;

        /* Conditionals
           == (equal), != (different), || (or), && (and) */

        if (bool) {
            System.out.println("Bool is True!");
        } else if (!bool) {
            System.out.println("Bool is False!");
        } else {
            System.out.println("I don't know what Bool is.");
        }

        /*
           Vetors

           type name of variable + []

           example:
        */
        int[] colletionInts = {1, 2, 3, 4, 5, 6}; // Array: fixed size
        int[] colletionIntsVoid = new int[5];

        System.out.println("Array: " + colletionInts);
        System.out.println("Array void: " + colletionIntsVoid);

        /*
            Arraylist
            a classe, dinamic array, not fixed.

            example:
        */

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Dinosaur");
        animals.add("Fish");

        System.out.println("ArrayList: " + animals);
        System.out.println("ArrayList index 0: " + animals.get(0));

        animals.remove(0);
        animals.remove("Cat");

        System.out.println("ArrayList (after remove): " + animals);
        System.out.println("ArrayList index 0 (after remove): " + animals.get(0));

        /*
            Loop, while and for

            example:
        */

        for (int incrementer = 0; incrementer < animals.size(); incrementer++) {
            System.out.println(animals.get(incrementer));
        }

        for (String item : animals) {
            System.out.println(item);
        }

        int counter = 0;
        while (counter < 3) {
            System.out.println(animals.get(counter));
            counter++;
        }

        /*
            casting, change of type
        */

        double resultDouble = 0.0;
        int resultInt = (int) resultDouble;

        String randomStr = "10";
        int number = Integer.parseInt(randomStr);

    }
}