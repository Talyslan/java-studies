package studies;

/**
 * ExceptionTrataments demonstrates how to handle exceptions in Java using try-catch blocks,
 * custom messages, and the finally block.
 */
public class ExceptionTrataments {

    public static void main(String[] args) {
        System.out.println("=== Division Example ===");
        handleDivision(10, 2);     // Valid division
        handleDivision(10, 0);     // Division by zero (will throw exception)

        System.out.println("\n=== Custom Exception Example ===");
        try {
            checkAge(15); // Throws an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    /**
     * Method that handles division with exception protection.
     */
    public static void handleDivision(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Finished division attempt.\n");
        }
    }

    /**
     * Method that throws an exception if the age is under 18.
     */
    public static void checkAge(int age) {
        if (age < 18) {
            // throw is used to manually trigger an exception
            throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }
}

/*
Key Concepts About Exception Handling:

1. try:
   - Wraps the code that may throw an exception.

2. catch:
   - Catches and handles the specific exception.
   - You can have multiple catch blocks for different exception types.

3. finally:
   - Executes no matter what (even if exception is thrown or not).
   - Useful for closing files, releasing resources, etc.

4. throw:
   - Used to manually throw an exception (e.g., new IllegalArgumentException).

5. throws (not shown here):
   - Used in method signature to declare that the method might throw exceptions to be handled elsewhere.
*/
