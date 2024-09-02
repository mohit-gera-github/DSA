import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Bihar");
        hs.add("Punjab");
        hs.add("Chandigarh");
        hs.add("UP");

        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bihar");
        lhs.add("Punjab");
        lhs.add("Chandigarh");
        lhs.add("UP");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Delhi");
        ts.add("Bihar");
        ts.add("Punjab");
        ts.add("Chandigarh");
        ts.add("UP");

        System.out.println(ts);

    }
}
