package InnerClasses;

import java.util.Scanner;

class _1 {
    String scanf() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        _1 instance = new _1();
        System.out.println("Please enter something: ");
        String input = instance.scanf();
        System.out.println("You entered: " + input);
    }
}
