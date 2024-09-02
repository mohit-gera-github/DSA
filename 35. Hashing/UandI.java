import java .util.*;
public class UandI {
    public static void main(String[] args) {
        int arr1[] ={7,3,9};
        int arr2[] ={6,3,9,2,9,4};

        HashSet<Integer> union = new HashSet<>();

        for(int i = 0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        System.out.println("union :" + union.size());
        for(Integer uni : union){
            System.out.println(uni);
        }

        HashSet<Integer> Intersection = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            Intersection.add(arr1[i]);
        }
        int count=0;

        System.out.println();
        for(int i=0;i<arr2.length;i++){
            if(Intersection.contains(arr2[i])){
                count++;
                System.out.println((arr2[i])); 
                Intersection.remove(arr2[i]);
                
                
            }
        }
        System.out.println("Intersection :"  +count);
    }
}
