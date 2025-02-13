import java.util.*;
interface compare{
    public double area();
    public double perimeter();
}
class Circle implements compare{
    double r;
    Circle(double r){
        this.r=r;}
    public double area(){
        return 3.14*r*r;}
    public double perimeter(){
        return 2*3.14*r;}
    }
class Rectangle implements compare{
    double l,w;
    Rectangle(double l,double w){
        this.l=l;
        this.w=w;}
        public double area(){
            return l*w;}
        public double perimeter(){
            return 2*l+w;}
    }
public class CompareDemo {
    public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            int ch;
            
          do{
             
            System.out.println("Enter choice\n1.Rectangle\n2.Circle\n3.Exit\n");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter length");
                        int l=s.nextInt();
                       System.out.println("Enter width");
                       int w=s.nextInt();
                       Rectangle r=new Rectangle(l,w);
                       System.out.println("Area of rectangle is "+r.area());
                       System.out.println("Perimeter of rectangle is "+r.perimeter());
                       break;
                case 2:System.out.println("Enter radius");
                       Double r1=s.nextDouble();
                       Circle c=new Circle(r1);
                       System.out.println("Area of circle is "+c.area());
                       System.out.println("Perimeter of circle is "+c.perimeter());
                       break;
                case 3: break;
            }} while(ch!=3);
            }
    
}
