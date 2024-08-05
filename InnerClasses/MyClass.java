package InnerClasses;
 class Final {
   public static void main(String[] args) {
    MyClass m = new MyClass();
    m.display(34);
    MyClass m2 = new MyClass();
    m2.display(56);
    m2.display(59);


   }
}
public class MyClass {
    public void display(final int number) {
        // number = 10; // This will cause a compile-time error
        System.out.println("Number: " + number);
    }
}
