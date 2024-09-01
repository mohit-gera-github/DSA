import java.util.*;
public class break1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n=sc.nextInt();
            if(n%10 ==0)
            break;

            System.out.print(n);
        }while(true)  ;
    }
}
