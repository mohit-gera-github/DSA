import java.util.*;
public class EvenOdd{
    public static void OddEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("Even");
        }else
        {
            System.out.println("Odd");
        }
    }

    public static void getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            System.out.println("Zero");
        }else
        {
            System.out.println("One");
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n| bitMask;
    }

    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int clearLastBits(int n,int i){
        int bitMask= (-1)<<i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n , int i , int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n & 1 ) != 0){
                count ++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}