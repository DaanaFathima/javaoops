import java.util.*;
public class prime {
    public int num(int n){
        int flag=0;
         if(n==1){
            System.out.println("Neither prime nor composite");
         }
         else if (n == 2) {
            System.out.println("Prime");
        }
        else{
            for(int i=2;i<=n/2;i++){
               if(n%i==0){
                flag=1;
                break;
               }
            }
           if(flag==0){
              System.out.println("Prime");
           }
           else{
            System.out.println("Not prime");
           }
         }
         return 1;
    }
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        prime p1=new prime();
        p1.num(n);
        
    } 

}
