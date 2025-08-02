import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for (int asteroid : arr) {
            while (!st.isEmpty() && asteroid < 0 && st.peek() > 0) {
                if (st.peek() < -asteroid) {
                    st.pop();
                    continue;
                } else if (st.peek() == -asteroid) {
                    st.pop();
                }
                asteroid = 0;
                break;
            }
            if (asteroid != 0) {
                st.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[st.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = st.get(i);
        }

        return result;
    }
}
