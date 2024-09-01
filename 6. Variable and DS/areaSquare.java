import java.util.* ;
public class areaSquare{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the side of square :");
    int side=sc.nextInt();
    System.out.print("Area of square is :");
    int Area=side * side;
    System.out.print(Area);
}   
}