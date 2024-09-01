import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class largest3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ener the value of 3 NO. : ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A>=B && A>=C){
            System.out.println("A is largest ");
        }
        else if(B>=C)
        {
            System.out.println("B is largest ");
        }
        else {
            System.out.println("C is largest ");
        }
    }
    
}
