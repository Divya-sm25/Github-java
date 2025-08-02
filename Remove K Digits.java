class Solution {
    public String removeKdigits(String num, int k) {
        int c = k;
        Stack<Integer> st = new Stack<>();
        st.push(Character.getNumericValue(num.charAt(0)));
        int i = 0, n = 0;
        
        for (i = 1; i < num.length(); i++) {
            n = Character.getNumericValue(num.charAt(i));
            while (!st.isEmpty() && st.peek() > n && c > 0) {  // Changed '&' to '&&'
                System.out.println(st.pop());
                c--;
            }
            st.push(n);  // Removed the 'if' check and always push
        }

        // No need to process remaining digits here because all digits are already handled

        while (c > 0 && !st.isEmpty()) {
            st.pop();
            c--;
        }

        if (st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        for (int f : st) {
            sb.append(f);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
