package studies;

/**
 * This interface defines a contract for behavior that classes can implement.
 * Interfaces are used to achieve abstraction and multiple inheritance in Java.
 */
public interface Interfaces {
    void start();
    void stop();
}

// example
class Machine implements Interfaces {
    public static void main(String[] args) {
        // we can reference the object using the interface type (polymorphism)
        Interfaces myMachine = new Machine();
        myMachine.start(); // Output: Machine is starting...
        myMachine.stop();  // Output: Machine is stopping...
    }

    public void start() {
        System.out.println("Machine is starting...");
    }

    public void stop() {
        System.out.println("Machine is stopping...");
    }
}

/*
Key Points About Interfaces:
----------------------------

1. Interfaces define a contract — they declare *what* should be done, not *how*.
2. All methods in interfaces are implicitly:
   - public
   - abstract (no body, just declaration)
3. From Java 8+, interfaces can also include:
   - default methods (with a body)
   - static methods
4. Interfaces support multiple inheritance — a class can implement multiple interfaces.
5. Interfaces are great for polymorphism — the same interface type can refer to different implementations.

Use interfaces when:
- You want to define common behavior across unrelated classes.
- You want to ensure that certain methods are always implemented.
*/
