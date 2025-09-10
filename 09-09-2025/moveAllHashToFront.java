public class moveAllHashToFront{
    public static String moveHash(String str){
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        char[] input = str.toCharArray();
        for(int i=0;i<input.length;i++){
            if(input[i]=='#') s1.append(input[i]);
            else s2.append(input[i]);
        }
        String result = s1.toString()+ s2.toString();
        return result;
    }
    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        System.out.println(moveHash(str));
    }
}