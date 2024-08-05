package InnerClasses;
class A {
    int i = 10;

    void display() {
        System.out.println("A's display: " + i);
    }
    public static void display2() {
        System.out.println("A's display"); }
}

class B extends A {
    int i = 20;

    void display() {
        System.out.println("B's display: " + i);
    }
    public static void display2() {
        System.out.println("B's display"); }
}

class Demo {
    public static void main(String[] args) {
        A a = new B();
         a.display();
         a.display2();
    }
}