import java.util.*;

@FunctionalInterface
interface Dim {
    double area(int x);
}

public class CircleSphere {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius:");
        int x = s.nextInt();

        // Lambda function for calculating the area of a square
        Dim CircleArea = (r) -> 3.14 * r * r;
        Dim SphereArea= (r)->4*r*r;

        System.out.println("Area of the Circle " + " is: " + CircleArea.area(x));
        System.out.println("Area of the Sphere" + " is: " + SphereArea.area(x));

        s.close();
    }
}
