import java.util.Stack;


public class ReversePolishCalc {

    private Stack<Double> stack = new Stack();

    private String[] tokens;


    public double calculate(String input) {
       //algorithm to code: 5 + ((1 + 2) × 4) − 3 or  5 1 2 + 4 × + 3 −

        tokens = input.split(",");

        Double numOne;
        Double numTwo;
        Double holdingSum;

        for(int i = 0; i < tokens.length; ++i) {
            //check for + - / * in if statments
            if (tokens[i].equals("+")) {
                numOne = stack.pop();
                numTwo = stack.pop();
                holdingSum = numTwo + numOne;
                stack.push(holdingSum);
                System.out.println(stack);
            } else if (tokens[i].equals("-")) {
                numOne = stack.pop();
                numTwo = stack.pop();
                holdingSum = numTwo - numOne;
                stack.push(holdingSum);
                System.out.println(stack);
            } else if (tokens[i].equals("*")) {
                numOne = stack.pop();
                numTwo = stack.pop();
                holdingSum = numTwo * numOne;
                stack.push(holdingSum);
                System.out.println(stack);
            } else if (tokens[i].equals("/")) {
                numOne = stack.pop();
                numTwo = stack.pop();
                holdingSum = numTwo / numOne;
                stack.push(holdingSum);
                System.out.println(stack);
            } else {
                stack.push(Double.parseDouble(tokens[i]));
                System.out.println(stack);
            }
        }
        return stack.pop();
   }

}
