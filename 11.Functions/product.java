import java.util.*;
public class product{
    public static int multiply(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A and B : ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int prod=multiply(A,B);
        System.out.println("A*B=" + prod);

    }
}