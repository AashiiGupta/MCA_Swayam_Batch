import java.util.*;

public class Occurs_Integer_times {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,2,2,4,2,3,4,5,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
        }
    }    
}
