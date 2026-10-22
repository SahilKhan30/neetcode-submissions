class Solution {
    public boolean isAnagram(String s, String t) {

        int[] countArr =  new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0; i<s.length(); i++){
            countArr[s.charAt(i)-'a']++;
            countArr[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(countArr[i]!=0) return false;
        }
        return true;

    }
}
