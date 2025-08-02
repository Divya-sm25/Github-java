class Solution {
    public String longestPalindrome(String s) {
        int c=0;int maxLen=0;String sd=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+maxLen;j<s.length();j++)
            if(Plaindrome(s.substring(i,j+1))){
                if(j-i+1>maxLen){
                sd=s.substring(i,j+1);
                maxLen=Math.max(maxLen,j-i+1);}
            }
        }
        return sd ;
    }

    static Boolean Plaindrome(String s){
          int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    
}
