import java.util.*;
public class fact{
    public static int factor(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factor(n-1);
        }
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        System.out.println("Factor of "+n+"is "+factor(n));
    }
}
