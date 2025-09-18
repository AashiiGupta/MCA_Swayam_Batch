import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Zig_zag_ll {
    public static LinkedList<Integer> zigZag(LinkedList<Integer> list) {
        int mid = list.size() / 2;
        LinkedList<Integer> left = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(list.subList(mid, list.size()));

        Collections.reverse(right);
        int i = 0, j = 0;

        LinkedList<Integer> ans = new LinkedList<>();

        while (i < left.size() && j < right.size()) {
            ans.add(left.get(i));
            ans.add(right.get(j));
            i++;
            j++;
        }
        while (i < left.size()) {
            ans.add(left.get(i));
            i++;
        }
        while(j<right.size()){
            ans.add(right.get(j));
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(zigZag(list));
    }
}
