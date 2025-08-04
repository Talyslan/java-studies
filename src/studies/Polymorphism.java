package studies;

/**
 * Polymorphism allows one interface to be used for different underlying forms (data types).
 * In Java, this typically means using a superclass or interface reference to refer to subclass objects.
 */
public class Polymorphism {

    public static void main(String[] args) {
        // Using polymorphism with a common superclass
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Output: Woof!
        myCat.makeSound();  // Output: Meow!

        Animal[] animals = { new Dog(), new Cat(), new Dog() };

        System.out.println("\nLooping through animals:");
        for (Animal animal : animals) {
            animal.makeSound();  // Each animal makes its own sound
        }
    }
}

/**
 * Superclass for all animals.
 */
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

/**
 * Subclass
 */
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

/*
Key Concepts About Polymorphism:

1. Compile-Time Polymorphism (Method Overloading):
   - Same method name, different parameters, resolved at compile time. (not shown in this example)

2. Runtime Polymorphism (Method Overriding):
   - A subclass provides a specific implementation of a method that is already defined in its superclass.

3. Benefits:
   - Cleaner code
   - Easier maintenance
   - Flexibility and scalability
   - Enables design patterns like Strategy, Factory, etc.
 */
