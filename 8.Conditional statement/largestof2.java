import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
public class largestof2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of A and B : ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A>=B){
            System.out.print("A is largest ");
        }
        else{
            System.out.print("B is largest ");
        }
    }
    
}