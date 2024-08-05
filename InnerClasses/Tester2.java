package InnerClasses;


interface Colorable { }
interface Bouncable extends Colorable { } 
class Super implements Bouncable { }
class Sub extends Super implements Bouncable { } 
public class Tester2 { }

public static void main(String[] args) {

System.out.println(new Sub() instanceof Super); 
System.out.println(new Sub() instanceof Bouncable); 
System.out.println(new Sub() instanceof Colorable); 
System.out.println(new Super() instanceof Sub); 
System.out.println(new Super() instanceof Colorable); 

}
// A) All lines will evaluate to true
// B) All lines will evaluate to true and only line 4 will evaluate to false --correct answer
// C) Only line 1 and 2 will evaluate to true
// D) Lines 3 and 5 will evaluate to false