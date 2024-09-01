import java.util.*;
public class cost{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost of Pencil , Pen and Eraser :");
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float Cost=(pencil+pen+eraser)+((pencil+pen+eraser)*18)/100;
        System.out.print("Total cost with GST :");
        System.out.print(Cost);
        

    }
}