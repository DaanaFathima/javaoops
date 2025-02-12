import java.util.*;
interface comparable{
    public int comparebyVolume(comparable other);
    double volume();
}
class Cuboid implements comparable{
      double l,h,w;
      Cuboid(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
      }
      public double volume(){
        return (l*w*h);
      }
      public int comparebyVolume(comparable other){
        if(volume()<other.volume()){
            return -1;}
        else if(volume()>other.volume()){
            return 1;}
        else{
            return 0;}
        }
    }
class Cylinder implements comparable{
    double r,h1;
    Cylinder(double r,double h1){
        this.r=r;
        this.h1=h1;
    }
    public double volume(){
        return (3.14*r*r*h1);}
    public int comparebyVolume(comparable other){
         return 1;}
}
public class seven{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length");
        int l=s.nextInt();
        System.out.println("Enter breadth");
        int w=s.nextInt();
        System.out.println("Enter hieght");
        int h=s.nextInt();
         System.out.println("Enter radius");
        int r=s.nextInt();
        System.out.println("Enter hieght");
        int h1=s.nextInt();
        Cuboid c1=new Cuboid(l,w,h);
        Cylinder c2=new Cylinder(r,h1);
        int result=c1.comparebyVolume(c2);
        if(result<0)
        System.out.println("Cuboid"+ c1.volume()+"have larger volume");
        else if(result>0)
            System.out.println("Cylinder"+ c2.volume()+"have large volume");
        else
            System.out.println("Both are equal");

}
}