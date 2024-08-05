package InnerClasses;
class StaticA {
    static {
        System.out.println("Static block A");
    }
}

class StaticB extends StaticA {
    static {
        System.out.println("Static block B");
    }

    }
     public class StaticDriver{

    public static void main(String[] args) {
        new StaticB();
        System.out.println("Driver");
    }
}