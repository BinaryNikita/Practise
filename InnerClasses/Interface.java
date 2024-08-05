package InnerClasses;
interface I1 {
    void method();
}

interface I2 {
    void method();
}

class A3 implements I1, I2 {
    public void method() {
        System.out.println("Method implementation");
    }
}

class Driver {
    public static void main(String args[]) {
        A3 ob = new A3();
        ob.method(); 
       
                I1 ob1 = new A3();
                ob1.method(); // Calls the method implemented in class A3
        
                I2 ob2 = new A3();
                ob2.method(); // Calls the method implemented in class A3
            }
        }
    
