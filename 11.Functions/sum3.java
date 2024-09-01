import java.util.*;
public class sum3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        int sum=0;
        while(x>0){
            int y=x%10;
            sum=sum+y;
            x=x/10;
        }
        System.out.println("Sum of digit in x is :" + sum);

    }
    
}
