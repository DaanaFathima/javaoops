import java.util.*;

@FunctionalInterface
interface Dim {
    double area(int x);
}

public class DemoCube {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side:");
        int x = s.nextInt();

        // Lambda function for calculating the area of a square
        Dim CubeArea = (side) -> side * side * side;

        System.out.println("Area of the cube with side " + x + " is: " + CubeArea.area(x));
    }
}
