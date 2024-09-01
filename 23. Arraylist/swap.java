import java.util.ArrayList;
import java.util.*;

public class swap {
    public static void Swap(ArrayList<Integer> list,int idx1,int idx2){

        int temp= list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void printAl(ArrayList<Integer> list){
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        printAl(list);
        Swap(list,1,2);
        printAl(list);
        Collections.sort(list);
        printAl(list);
    }
}
