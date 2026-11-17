class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            
                if (tokens[i].equals("+")) {
                    int num2 = Integer.parseInt(st.pop());
                    int num1 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num1 + num2));
                } else if (tokens[i].equals("-")) {
                    int num2 = Integer.parseInt(st.pop());
                    int num1 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num1 - num2));
                } else if (tokens[i].equals("*")) {
                    int num2 = Integer.parseInt(st.pop());
                    int num1 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num1 * num2));
                } else if(tokens[i].equals("/")) {
                    int num2 = Integer.parseInt(st.pop());
                    int num1 = Integer.parseInt(st.pop());
                    st.push(Integer.toString(num1 / num2));
                }
                else{

                st.push(tokens[i]);
                }
           
            
        }

        System.out.print(st);

        return Integer.parseInt(st.pop());
    }
}
