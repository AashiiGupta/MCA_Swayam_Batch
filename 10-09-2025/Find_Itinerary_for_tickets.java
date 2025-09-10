import java.util.HashMap;
import java.util.Scanner;

public class Find_Itinerary_for_tickets {

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key))
            return key; // starting point
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter source");
            String src = sc.next();
            System.out.println("enter dest");
            String dest = sc.next();
            tickets.put(src,dest);
        }
        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
        }
    }
}