import java.util.*;
public class Even{
    public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n=sc.nextInt();
    if(n%2==0){
        System.out.print("Even ");
    }
    else{
        System.out.print("Odd ");
    }
    }
}