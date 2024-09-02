import java.util.*;
public class TreeM {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm =new TreeMap<>();

        tm.put("India",100);
        tm.put("China",120);
        tm.put("Bhutan",200);
        System.out.println(tm.get("India"));
    }
    
}
