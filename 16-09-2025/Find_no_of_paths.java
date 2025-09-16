public class Find_no_of_paths {
    public static int findPaths(int m,int n){
        if(m==1 && n==1){
            return 1;
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        return findPaths(m-1,n) + findPaths(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(findPaths(3,3));
    }
}
