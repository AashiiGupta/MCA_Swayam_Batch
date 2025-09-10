import java.util.HashSet;

public class UnionOfTwoArray {

    public static void main(String[] args) {
        int arr1[] = {7,4,9};
        int arr2[] = {2,3,7,2,1,4};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}