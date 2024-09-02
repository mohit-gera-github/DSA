import java.util.*;

public class zeroSum {
    public static void largestSubarray(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = -1;
        int end = -1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = i + 1;
                start = 0;
                end = i;
            }

            if (map.containsKey(sum)) {
                if (i - map.get(sum) > maxLength) {
                    maxLength = i - map.get(sum);
                    start = map.get(sum) + 1;
                    end = i;
                } 
            }else {
                map.put(sum, i);
            }
        }
        if (start == -1 || end == -1) {
            System.out.println("0");
        } else {
            System.out.println(maxLength);
            for (int j = start; j <= end; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, -15 };
        largestSubarray(arr);
    }
}
