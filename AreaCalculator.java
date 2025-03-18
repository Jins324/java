import java.util.Scanner;
class Shape
{
    double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    double area(double length,double width)
    {
        return length*width;
    }
    double area(double base,double height,boolean isTriangle)
    {
        return 0.5*base*height;
    }
}
public class AreaCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shape shape=new Shape();
        System.out.print("Enter radius of circle:");
        double radius=sc.nextDouble();
        System.out.println("Area of circle:"+shape.area(radius));
        System.out.println("Enter length and width of rectangle:");
        double length=sc.nextDouble();
        double width=sc.nextDouble();
        System.out.println("Area of rectangle:"+shape.area(length,width));
        System.out.println("Enter base and height of triangle:");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.println("Area of triangle:"+shape.area(base,height,true));
        sc.close();
    }
}