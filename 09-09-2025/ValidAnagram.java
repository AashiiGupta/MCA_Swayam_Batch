import java.util.HashMap;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t){
        //if both string have different lengths then they are not valid anagram.
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        //put values of s in hashmap
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        //traverse t string and check the values of t in map
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch)!=null){ //if t char freq is not null in string s map 
                if(map.get(ch)==1){ //if it's freq is one mean t character in s string has the freq 1
                    map.remove(ch); // remove the char from map.
                }else{
                    map.put(ch,map.get(ch)-1);// not equal to 1 freq of t char in s string then decrease the freq of s char by one.
                }
            }else{
                    return false; // if t char does not find in s string map then return false.
                }
        }
        return map.isEmpty();// if whole map of string s is empty then return true else false.(because one by one we remove the freq of char in string s in map which we get in char in t string, when freq becomes 1 then we remove that char in string. By repeating this process, we remove all the character of string s map which matches with string t. Hence the map becomes empty and if it is empty then it is valid anagram, because each character matches with each othet that's why their freq is 0.)
    } 
    public static void main(String[] args) {
        String s = "race";
        String t = "erac";
        System.out.println(validAnagram(s, t));
    }
}
