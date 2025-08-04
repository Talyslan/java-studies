package studies;

/**
Access Modifiers:

public:
   - Can be accessed from any class in any package.
   - Example: 'publicAttribute' can be accessed freely.
protected:
   - Can be accessed within the same package.
   - Also accessible in subclasses (even if they're in different packages).
default (no modifier):
   - Only accessible within the same package.
   - Not visible to subclasses outside the package.
private:
   - Only accessible within the same class.
   - Not accessible from any other class, not even from a subclass or same package.
*/
public class OOP {

    public static void main(String[] args) {
        OOP example = new OOP(); // Creating an instance of the class

        example.showAccessLevels();
    }

    // attributes with different access levels
    public String publicAttribute = "Accessible from anywhere";
    protected String protectedAttribute = "Accessible within the same package and subclasses";
    String defaultAttribute = "Accessible only within the same package";
    private String privateAttribute = "Accessible only within this class";

    /*
        constructor of the OOP class
        called when an instance of OOP is created
    */
    public OOP() {
        System.out.println("OOP instance created!\n");
    }

    /*
        A public method that can access all attributes within the class.
    */
    public void showAccessLevels() {
        System.out.println("Inside OOP class:");
        System.out.println("Public: " + publicAttribute);
        System.out.println("Protected: " + protectedAttribute);
        System.out.println("Default: " + defaultAttribute);
        System.out.println("Private: " + privateAttribute);
    }
}
