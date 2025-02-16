import java.util.*;

@FunctionalInterface
interface Dim {
    double area(int x);
}

public class DemoSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side:");
        int x = s.nextInt();

        // Lambda function for calculating the area of a square
        Dim squareArea = (side) -> side * side;

        System.out.println("Area of the square with side " + x + " is: " + squareArea.area(x));
    }
}
