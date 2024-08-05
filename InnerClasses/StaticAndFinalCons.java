package InnerClasses;
 class Profile {
    private Profile(int w){
     System.out.println(w);
    }
    public final Profile(){ // final is not allowed
        System.out.println(10);
    }
    public static void main(String[] args) {
        Profile obj = new Profile(50);
        Profile obj1 = new Profile();

    }

}
 private class Tester {
    private Tester(int w){
     System.out.println(w);
    }
    public static Tester(){ // final is not allowed
        System.out.println(10);
    }
    public static void main(String[] args) {
        Tester obj = new Tester(50);

    }

}

