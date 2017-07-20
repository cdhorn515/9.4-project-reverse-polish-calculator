import java.util.Stack;

/**
 * Created by cdhorn on 7/20/17.
 */
public class ReversePolishCalc {

    // The stack is a Type, contains doubles
    private Stack<Double> stack = new Stack();

    // You'll need a variable here to keep track of the top of the stack
//    private Double topOfStack = stack.get(0);

    // The array of the input string split up
    private String[] tokens;


    public double calculate(String input) {
       //algorithm to code: 5 + ((1 + 2) × 4) − 3 or  5 1 2 + 4 × + 3 −

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
//        stack = new String[tokens];


        // 3. write the algorithm
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
//    private void push(String number) {
//        // push on the stack
//    }
//
//    private void push(double d) {
//        String stackString = Double.toString(d);
//        stack.push(stackString);
//        // change the double to a string and then push it on the stack
//    }
//
//    private double pop() {
//    double stackDouble = Double.parseDouble(tokens);
//        // remove the string from the top of the stack and convert it to a double and return it
//        return stackDouble;