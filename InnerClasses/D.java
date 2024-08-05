package InnerClasses;
class ADefault {
    public void display() {
        System.out.println("ADefault's display");
    }
}

class BDefault extends ADefault {
    public void display() {
        System.out.println("BDefault's display");
    }
}

class C extends BDefault {
    public void display() {
        System.out.println("C's display");
    }
}

public class D {
    public static void main(String[] args) {
        ADefault a = new C();
        a.display();
    }
}