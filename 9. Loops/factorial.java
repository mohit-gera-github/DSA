import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        int i,factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        for(i=1;i<=x;i++)
        {
            factorial=factorial*i;
        }
        System.out.print("factorial of " + x + " is " + factorial);
    }
}
