import java.util.*;
public class areaCircle{
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of radius :");
    float radius=sc.nextFloat();
    float area=3.14f * radius * radius;
    System.out.print("Area of circle is :");
    System.out.print(area);

    }
}