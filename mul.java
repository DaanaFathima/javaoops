import java.util.*;
public class mul {
    public int mult(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+n+"="+i*n);
        }
        return 1;
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        mul m1=new mul();
        m1.mult(n);
    }
}
