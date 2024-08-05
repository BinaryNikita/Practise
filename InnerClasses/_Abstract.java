package InnerClasses;


interface InterfaceI {
    void display();
}

abstract class  AbstractA implements InterfaceI {
    public void display() {
        System.out.println("A's display");
    }
}

class NormalB extends AbstractA {
    public void display() {
        System.out.println("B's display");
    }
}

public class _Abstract {
    public static void main(String[] args) {
        InterfaceI i = new NormalB();
        i.display();
        AbstractA a = new NormalB() ;
            a.display();
        
    }
}