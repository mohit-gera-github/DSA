import java.util.*;

public class implementation{
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("China",150);
        hm.put("India",100);
        hm.put("Bhutan",60);
        hm.put("Us",100);
        hm.put("Nepal",120);

        // System.out.println(hm);
        // int population = hm.get("China");
        // System.out.println(population);
        // hm.remove("Bhutan");
        // System.out.println(hm);
        // System.out.println( hm.containsKey("India"));


        //Iteration
        Set<String> keys = hm.keySet();
        for(String s:keys){
            System.out.println("keys = " + s + ",Value = " + hm.get(s));
        }

       
    }
}