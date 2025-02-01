import java.util.*;
public class fib{
    public static int fibo(int n){
        int a=0,b=1,i=1;
        System.out.println(a);
        System.out.println(b);
        while(i<=n-2){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
        return 1;
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter limit");
        int n=s.nextInt();
        fibo(n);    }
}