import java.util.*;
public class maxsubarray {
    public static void maxsub(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    currSum=currSum+numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                System.out.print(" Sum is " + currSum);
                currSum=0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum is " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxsub(numbers);
    }
    
}
