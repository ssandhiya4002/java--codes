class Solution {
    public int lengthOfLastWord(String s) {
    String [] str=s.split(" ");
    int count=0;
    if (str.length > 0) {
            String lastWord = str[str.length - 1];
            count = lastWord.length();
        }
        return count;
    }
}