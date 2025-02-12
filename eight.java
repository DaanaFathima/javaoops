import java.util.*;
interface printable{
    public void display();
    public void show();
}
interface computable{
    public double area();
    public double perimeter();
    public double volume();
}
interface drawable{
    public void draw();
}
class Rectangle implements printable,computable,drawable{
    double l,w;
    Rectangle(double l,double w){
        this.l=l;
        this.w=w;
    }
    public void display(){
        System.out.println("Length of rectangle is "+l+" and width is "+w);}
    public void show(){}
    public double area(){
        return l*w;}
    public double perimeter(){
        return 2*(l+w);}
    public double volume(){
        return 0;}
    public void draw(){
        System.out.println("Drawing a rectangle");}
    }
class  Sphere implements printable,computable,drawable{
    double r;
    Sphere(double r){
        this.r=r;}
    public void display(){
        System.out.println("Radius of sphere is "+r);}
    public void show(){}
    public double area(){
        return 4*Math.PI*r*r;}
    public double perimeter(){
        return 2*Math.PI*r;}
    public double volume(){
        return (4/3)*Math.PI*r*r*r;}
    public void draw(){
        System.out.println("Drawing a sphere");}
    }
public class eight {
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      System.out.println("Enter length");
      double l=s.nextDouble();
      System.out.println("Enter width");
      double w=s.nextDouble();
      Rectangle r=new Rectangle(l,w);
      r.display();
      r.show();
      r.draw();
      System.out.println("Area:"+r.area());
      System.out.println("Perimeter:"+r.perimeter());
      
      System.out.println("Enter radius");
      double r1=s.nextDouble();
      System.out.println("Enter height");
      double h=s.nextDouble();
      Sphere s1=new Sphere(r1);
      s1.display();
      s1.show();
      System.out.println("Perimeter:"+s1.area());
      System.out.println("Area:"+s1.area());
      System.out.println("Volume:"+s1.area());
      s1.draw();
    }
          
}
