import java.util.ArrayList;

public class Rat_in_maze {
    static int[] dx={1,0,0,-1};
    static int[] dy ={0,-1,1,0};
    static char[] dir ={'D','L','R','U'};
    public static void solve(int maze[][], int n){
        ArrayList<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if(maze[0][0]==1){
            backtrack(0,0,maze,n,visited,"",paths);
        }
        if(paths.isEmpty()){
            System.out.println("No path found");
        }else{
            System.out.println(paths);
        }
    }
    public static void backtrack(int x, int y, int maze[][], int n, boolean visited[][], String path, ArrayList<String> paths){
        //reached destination
        if(x==n-1 && y==n-1){
            paths.add(path);
            return;
        }
        //mark current as visited
        visited[x][y] = true;

        //try all 4 other directions
        for(int i=0;i<4;i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            if(isSafe(newX,newY,maze,visited,n)){
                backtrack(newX, newY, maze, n, visited, path+dir[i], paths);
            }
        }
        visited[x][y] = false;
    }
    public static boolean isSafe(int newX, int newY, int maze[][], boolean visited[][], int n){
        return(newX>=0 && newY>=0 && newX<n && newY<n && maze[newX][newY] == 1 && !visited[newX][newY]);
    }
public static void main(String[] args) {
    int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        
        int n = maze.length;
        solve(maze, n);
}    
}
