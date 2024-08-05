package InnerClasses;

    class A2 {
        int i = 10;
        }
    
    class B extends A2 { 
        int i = 20;
    }
    class  AD{
   public static void main(String[] args) {
   A2 a = new B();
   System.out.println(a.i); }
   }
