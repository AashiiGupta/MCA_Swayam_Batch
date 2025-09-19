import java.util.HashMap;

public class Compressed_string {
    public static String compressString(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        StringBuilder result = new StringBuilder("");
        for(Character ch: map.keySet()){
            result.append(ch);
            result.append(map.get(ch));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "aaacabbabcc";
        System.out.println(compressString(str));
    }
}
