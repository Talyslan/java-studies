package studies;

/**
 * Abstract classes are used when you want to define a base class with shared behavior,
// * but you don't want to allow direct instantiation.
 */
public abstract class AbstractClass {

    protected String name = "Unnamed Device";

    public AbstractClass(String name) {
        this.name = name;
    }

    // Abstract Method
    // This method must be implemented by any non-abstract subclass.
    public abstract void operate();

    // Concrete Method
    public void describe() {
        System.out.println("This is a device named: " + name);
    }
}

/**
 * A concrete class that extends AbstractClass and implements the abstract method.
 * Heritage
 */
class Printer extends AbstractClass {

    public Printer(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println(name + " is printing documents...");
    }

    public static void main(String[] args) {
        Printer myPrinter = new Printer("HP LaserJet");
        myPrinter.describe();  // Output: This is a device named: HP LaserJet
        myPrinter.operate();   // Output: HP LaserJet is printing documents...
    }
}

/*
Key Concepts About Abstract Classes:
------------------------------------

1. Abstract classes:
   - Cannot be instantiated directly.
   - Can contain both abstract (unimplemented) and concrete (implemented) methods.
   - Can have constructors, fields, and regular methods.

2. Abstract methods:
   - Have no body.
   - Must be implemented by the first concrete subclass.

3. Use abstract classes when:
   - You want to share code among several closely related classes.
   - You want to prevent instantiation of a base class.
   - You want to enforce implementation of certain methods in subclasses.

Difference from Interface:
- Abstract class can have constructors and state.
- Interface cannot have constructors and only has constants for fields (unless using static/default methods).
*/
