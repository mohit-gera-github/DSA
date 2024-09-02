import java.util.*;
public class sumk {

    public static int SumEQk(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int count=0;
        int sum=0;

        for(int j =0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {10,-10,10,5,-5,10};
        int k= 10;

        System.out.println(SumEQk(arr, k));
    }
    
}
