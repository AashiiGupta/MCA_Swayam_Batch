import java.util.*;

public class Sort_characters_by_freq_by_hashing {
    public static String sortChars(String str){

        //put characters in hashmap with their frequency
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        ArrayList<Character> chars = new ArrayList<>(map.keySet());//create arraylist to store unique chars of map (only chars)

        Collections.sort(chars, (a,b) -> map.get(b) - map.get(a));//sort in descending order of char arraylist

        StringBuilder ans = new StringBuilder();//make string builder to store the final result

        for(char c: chars){  //loop over the char arraylist
            int freq = map.get(c); // get frequency of char from map and store it's freq
            for(int i=0;i<freq;i++){ // store the char according to it's time of freq
                ans.append(c);
            }
        }        
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(sortChars(str));
    }    
}
