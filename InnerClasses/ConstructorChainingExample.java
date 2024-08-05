package InnerClasses;
public class ConstructorChainingExample {
    private int x;
    private int y;

    public ConstructorChainingExample() {
        this(6, 8); // Calls the constructor with two parameters
        System.out.println("Default constructor");
    }

    public ConstructorChainingExample(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorChainingExample obj = new ConstructorChainingExample();
    }
}
