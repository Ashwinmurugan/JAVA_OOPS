package OOPS;

// Interface: Multiple_Inheritance
interface Multiple_Inheritance {
    // By default, fields in interfaces are public, static, and final.
    public static final String name = "";

    // Abstract method (to be implemented by classes)
    void sound();

    // Static method (can be called without an instance)
    static void possible() {
        System.out.println("This type creating is possible in interfaces");
    }

    // In Java 8+, you can also define default methods in interfaces
    default void greet() {
        System.out.println("Hello from Multiple_Inheritance interface!");
    }
}

// Class implementing the interface
class Cat implements Multiple_Inheritance {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    // Optional: You can also override default methods if needed
    @Override
    public void greet() {
        System.out.println("Cat greets you!");
    }
}