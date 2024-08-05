package InnerClasses;
interface Drivable {
    void drive();
}

interface Flyable extends Drivable {
    void fly();
}

class Car implements Drivable {
    public void drive() {
        System.out.println("Car drives");
    }
}

 public class TestDriver {
    public static void main(String[] args) {
        Drivable d = new Car();
        d.drive();
    }
}
