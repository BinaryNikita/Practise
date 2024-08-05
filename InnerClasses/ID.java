package InnerClasses;
class Base {
    public void display() {
        System.out.println("Base display");
    }
}

class Derived extends Base {
    public void display() {
        System.out.println("Derived display");
    }
}

 class BaseDriver {
    public static void main(String[] args) {
        Base b = new Derived();
        b.display();
    }
}
interface I {
    default void display() {
    System.out.println("Interface display"); }
    }
    class A implements I { public void display() {
    System.out.println("Class A display"); }
    }
    public class ID {
    public static void main(String[] args) {
    I i = new A();
    i.display(); }
    }

    