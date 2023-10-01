/**
 * The `CalculatorModel` class represents the core logic of a calculator application.
 * It manages the calculator's state, processes user input, and performs calculations.
 *
 * This class maintains the current infix expression, the full expression, and the Reverse
 * Polish Notation (RPN) calculator for evaluating expressions. It also interacts with a
 * viewer component to display the current state of the calculator.
 *
 */
public class CalculatorModel {

    private String temp;         // Current infix expression
    private String fullExpression;     // Full expression (including pending calculations)
    private RPN rpn;                   // Reverse Polish Notation calculator
    private Viewer viewer;             // Viewer component for displaying calculator output
    private boolean isDotSet;          // Flag to track if a decimal point is set

    /**
     * Constructs a new `CalculatorModel` instance.
     *
     * @param viewer The viewer component responsible for displaying calculator output.
     */
    public CalculatorModel(Viewer viewer) {
        temp = "";
        fullExpression = "";
        this.viewer = viewer;
        rpn = new RPN();
        isDotSet = false;
    }

    /**
     * Performs an action based on the provided symbol.
     *
     * @param symbol The symbol representing a user action or input.
     */
    public void doAction(String symbol) {
        // Handle different symbols and update the calculator's state

         switch (symbol) {
             case "symdel":
                 deleteLastSym();
                 break;
             case "symclear":
                 temp = "";
                 fullExpression = "";
                 isDotSet = false;
                 break;
             case "=":
                 calculateAndUpdate();
                 return;
             default:
                 handleSymbol(symbol.charAt(0));
                 break;
         }

        // Update the viewer with the current calculator state
        viewer.updateTemp(temp);
    }

    /**
     * Deletes the last character in the infix expression if it is not empty.
     */
    private void deleteLastSym() {
        if (temp.length() != 0) {
            temp = temp.substring(0, temp.length() - 1);
        }
    }

    /**
     * Calculates and updates the result based on the current infix expression.
     */
    private void calculateAndUpdate() {
        if (temp.length() >= 3) {
            isDotSet = false;
            Double result = rpn.calculate(temp);
            String stringResult = resultToString(result);
            if (temp.length() != 0) {
                fullExpression = temp + " = " + stringResult;
            }

            viewer.updateExpression(fullExpression);
            viewer.updateTemp(stringResult);
            temp = "";
            fullExpression = "";
        }
    }

    /**
     * Handles a symbol (operand, operator, or special symbol) in the infix expression.
     *
     * @param symbol The symbol to handle.
     */
    private void handleSymbol(char symbol) {
        char lastChar = temp.isEmpty() ? '&' : temp.charAt(temp.length() - 1);

        if (isOperand(symbol)) {
            temp += symbol;
        } else if (isOperator(symbol)) {
            handleOperator(symbol, lastChar);
        } else if (symbol == '.') {
            handleSpecialSymbol(symbol, lastChar);
        }
    }

    /**
     * Handles an operator symbol in the infix expression.
     *
     * @param symbol   The operator symbol to handle.
     * @param lastChar The last character in the infix expression.
     */
    private void handleOperator(char symbol, char lastChar) {
        isDotSet = false;

        if (temp.isEmpty() && symbol == '-') {
            temp += "0" + symbol;
        } else if (isOperator(lastChar)) {
            deleteLastSym();
            temp += symbol;
        } else if (isOperand(lastChar)) {
            temp += symbol;
        }
    }

    /**
     * Handles a special symbol (parentheses or decimal point) in the infix expression.
     *
     * @param symbol   The special symbol to handle.
     * @param lastChar The last character in the infix expression.
     */
    private void handleSpecialSymbol(char symbol, char lastChar) {
        if (symbol == '.' && !isDotSet) {
            temp += symbol;
            isDotSet = true;
        }
    }


    /**
     * Checks if a character is an operand (digit).
     *
     * @param input The character to check.
     * @return True if the character is an operand; otherwise, false.
     */
    private boolean isOperand(Character input) {
        return Character.isDigit(input);
    }

    /**
     * Checks if a character is an operator (+, -, *, /).
     *
     * @param input The character to check.
     * @return True if the character is an operator; otherwise, false.
     */
    private boolean isOperator(Character input) {
        return input == '+' || input == '-' || input == '*' || input == '/';
    }

    /**
     * Converts a Double result to a formatted String, removing trailing zeros and decimal point
     * if necessary.
     *
     * @param result The Double result to convert.
     * @return The formatted result as a String.
     */
    private String resultToString(Double result) {
        String stringResult = String.valueOf(result);
        char expectedPoint = stringResult.charAt(stringResult.length() - 2);
        char expectedZero = stringResult.charAt(stringResult.length() - 1);

        if (expectedPoint == '.' && expectedZero == '0') {
            return stringResult.substring(0, stringResult.length() - 2);
        } else {
            return stringResult;
        }
    }

}
