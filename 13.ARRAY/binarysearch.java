import java.util.*;
public class binarysearch {
    public static int Bsearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==numbers[mid]){
                return mid;
            }
            if(key>numbers[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,3,7,12,65,64,87,34,15,13};
        int key=15;
        System.out.println("Key is found at index "+ Bsearch(numbers,key));
    }
    
}
