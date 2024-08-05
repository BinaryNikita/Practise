package InnerClasses;
// Abstract class Area
abstract class Area {
    static int num;

    abstract void showData();

    void display() {
        System.out.println("This is an abstract class example.");
    }
   
}

class Circle extends Area {

    Circle() {
        Area.num = 34;
    }

    @Override
    void showData() {
        System.out.println("Value of num: " + num);
    }
}

public class AreaDriver {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.showData();
        Circle c1 = new Circle();
        Area.num++;
        c1.showData();


    }
}
