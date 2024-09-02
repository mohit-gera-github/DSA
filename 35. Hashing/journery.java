import java.util.*;

public class journery {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String tic : tickets.keySet()) {
            revMap.put(tickets.get(tic), tic);
        }

        for (String tic : tickets.keySet()) {
            if (!revMap.containsKey(tic)) {
                return tic;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> Ticket = new HashMap<>();
        Ticket.put("Chennai", "Bengaluru");
        Ticket.put("Mumbai", "Delhi");
        Ticket.put("Goa", "Chennai");
        Ticket.put("Delhi", "Goa");

        String start = getStart(Ticket);
        System.out.print(start);
        for (String key : Ticket.keySet()) {
            System.out.print("->" + Ticket.get(start));
            ;
            start = Ticket.get(start);
        }
    }
}
