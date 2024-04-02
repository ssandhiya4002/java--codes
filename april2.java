import java.util.HashMap;

class april2{
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }
        
        HashMap<Character, Character> ss = new HashMap<>();
        HashMap<Character, Character> tt = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (ss.containsKey(sChar)) {
                if (ss.get(sChar) != tChar) {
                    return false;
                }
            } else {
                ss.put(sChar, tChar);
            }
            
            if (tt.containsKey(tChar)) {
                if (tt.get(tChar) != sChar) {
                    return false;
                }
            } else {
                tt.put(tChar, sChar);
            }
        }
        
        return true; 
    }
}