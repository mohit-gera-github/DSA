import java.util.*;
public class table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(x + "*" + i + " = " + i*x);
        }
    }
    
}
