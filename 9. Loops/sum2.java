import java.util.*;
public class sum2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int SumO=0,SumE=0,choice;
       do{
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        if(x%2==0)
        {
            SumE=SumE+x;
        }
        else{
            SumO=SumO+x;
        }
        System.out.print("To continue press 1 to Exit press 0 :");
         choice=sc.nextInt();
       }while(choice==1);
       System.out.println("Sum of even numers is:"+ SumE + "\nSum of odd numbers is:"+ SumO);
    }
    
}
