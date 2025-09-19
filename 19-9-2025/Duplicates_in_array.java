import java.util.ArrayList;
import java.util.HashMap;

public class Duplicates_in_array {
    public static ArrayList<Integer> findDuplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer num: map.keySet()){
            if(map.get(num)>1) list.add(num);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,4,9,1,4,2,5};
        System.out.println(findDuplicates(arr));
    }
}
