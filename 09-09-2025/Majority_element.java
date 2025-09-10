import java.util.*;

public class Majority_element {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = {1,2,1,1,3,4,5,1};
        //TC - On
        for(int i=0;i<arr.length;i++){
            // if(hm.containsKey(arr[i])){
            //     hm.put(arr[i], hm.get(arr[i])+1);
            // }else{
            //     hm.put(arr[i],1);
            // }
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        // Set<Integer> keySet = hm.keySet();
        for(Integer key: hm.keySet()){
            if(hm.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}