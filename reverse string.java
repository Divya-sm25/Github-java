class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder s1=new StringBuilder();
        String str[]=s.split("\\s+");
        for(int i=str.length-1;i>=0;i--){
            s1.append(str[i]);
           if(i!=0) s1.append(" ");
        }
        return s1.toString();
    }
}
