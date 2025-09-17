import java.util.HashMap;

public class Two_sum_by_hashing {
    public static int[] twoSum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }   
    public static void main(String[] args) {
        int[] arr = {2,7,11,10,8};
        int target = 15;
        int ans[] = twoSum(arr, target);
        for(int num: ans){
            System.out.print(num+" ");
        }
    } 
}
