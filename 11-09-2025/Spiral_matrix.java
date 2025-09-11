import java.util.ArrayList;

public class Spiral_matrix {
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        ArrayList<Integer> list = new ArrayList<>();
        int m = mat.length, n = mat[0].length;
        int sr=0, er=m-1, sc=0, ec=n-1;
        while(sr<=er && sc<=ec){
            //top
            for(int i=sc;i<=ec;i++){
                list.add(mat[sr][i]);
            }
            //right
            for(int i=sr+1;i<=er;i++){
                list.add(mat[i][ec]);
            }
            //bottom
            for(int i=ec-1;i>=sc;i--){
                if(sr==er) break;
                list.add(mat[er][i]);
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec) break;
                list.add(mat[i][sc]);
            }
            sr++; er--; sc++; ec--;
        }
        System.out.println(list);
    }
}

