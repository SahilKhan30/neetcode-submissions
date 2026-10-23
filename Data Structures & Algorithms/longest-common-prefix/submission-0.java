class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int pos=0;
        while(true){
            try{
                char ch = strs[0].charAt(pos);
                for(int i=1;i<strs.length;i++){
                    if(strs[i].charAt(pos)!=ch) return ans;
                }
                ans=ans+ch;
                pos++;

            } catch(Exception e){
                return ans;
            }
        }        
    }
}