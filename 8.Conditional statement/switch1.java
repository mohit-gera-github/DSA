import java.util.*;
public class switch1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("1: samosa \n 2: burger \n 3: mango");
    int choice=sc.nextInt();
    switch (choice) {
        case 1:System.out.println("Samosa");
            
            break;
         case 2:System.out.println("burger");
            
            break;
        case 3:System.out.println("mango");
            
            break;

        default:System.out.println("We Wake up");
            break;
    }
    } 
}
