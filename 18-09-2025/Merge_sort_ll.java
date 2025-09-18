import java.util.LinkedList;
import java.util.Scanner;

public class Merge_sort_ll {
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> head){
        if(head.size()<=1) // if list has one node or no node than it it already sorted
        return head;

        int mid = head.size()/2;//middle of linkedlist

        LinkedList<Integer> left = new LinkedList<>(head.subList(0, mid));//sublist 0 to mid-1
        LinkedList<Integer> right = new LinkedList<>(head.subList(mid, head.size()));//sublist mid to n

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);

    }

    private static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right){
        LinkedList<Integer> result = new LinkedList<>();
        int i=0,j=0;
        while(i<left.size() && j<right.size()){
            if(left.get(i)<=right.get(j)){
                result.add(left.get(i));
                i++;
            }else{
                result.add(right.get(j));
                j++;
            }
        }
        while(i<left.size()){
            result.add(left.get(i));
            i++;
        }
        while (j<right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(mergeSort(list));
    }
}
