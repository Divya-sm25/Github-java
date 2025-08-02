class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);map.put('C',100);map.put('D',500);map.put('M',1000);
        int sum=0,flag=1,i=0;
        while(i<s.length()-1){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
            {sum=sum+(map.get(s.charAt(i+1))-map.get(s.charAt(i)));
            if(i==s.length()-2) flag=0;
            i+=2;}
            else {sum=sum+(map.get(s.charAt(i)));
            i++;
           }
        }
        if(flag==1)
        sum=sum+(map.get(s.charAt(s.length()-1)));

        return sum;
    }
}
