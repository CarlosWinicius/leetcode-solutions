
public class Solution {

        public static List<String> generateParenthesis(int n) {

            StringBuilder myStack = new StringBuilder();
            ArrayList res = new ArrayList<String>();

            backtrack(res, myStack, 0, 0, n);


            return res;
        }


        public static void backtrack(ArrayList<String> res, StringBuilder myStack, int opens, int closeds, int n){


                if (opens == n && closeds == n){
                    res.add(myStack.toString());


                    return;
                }

                if (opens < n) {
                    myStack.append("(");
                    backtrack(res, myStack, opens + 1, closeds, n);
                    myStack.deleteCharAt(myStack.length() - 1);
                }
                if (closeds < opens){
                    myStack.append(")");
                    backtrack(res, myStack, opens, closeds+1, n);
                    myStack.deleteCharAt(myStack.length() - 1);
                }

    }
    
}