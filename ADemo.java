import arithmetic.*; 
import java.util.Scanner;

public class ADemo {
    public static void main(String[] a){
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        System.out.println("Enter another number");
        int m = s.nextInt();
        
        
        add a1 = new add();  
        sub s1 = new sub();
        mul m1 = new mul();
        
        
        System.out.println("Sum: " + a1.compute(n, m));   
        System.out.println("Difference: " + s1.compute(n, m));
        System.out.println("Product: " + m1.compute(n, m)); 
        s.close();
    }
}

