/*
 * University of Puerto Rico at Bayamón
 * Department of Computer Science
 * SICI 4036 - Data Structures, Spring 2016
 * Prof. Antonio F. Huertas
 */

package edu.uprb.collection;

/**
 * This is the postfix converter class that converts an 
 * infix expression into a postfix expression
 * @author Christopher Cruz Rubert <christopher.cruz2@upr.edu>
 * @version 5/10/2016.
 */

import java.util.Scanner;

public class PostfixConverter {

	// Field for the stack where operators are placed
	private Stack<String> operator = new LinkedStack<>();

	/**
	 * A method to convert to postfix expression
	 * @param exp The expression
	 * @return The expression postfix
	 */
	public String convertToPostfix(String exp) {
		StringBuilder str = new StringBuilder("");

		Scanner tokenizer = new Scanner(exp);

		while (tokenizer.hasNext()) {
			String token = tokenizer.next();

			if (evaluateOperand(token))
				str.append(token + " ");
			else if (token.equals("("))
				operator.push(token);
			else if (token.equals(")")){
				while (!operator.peek().equals("(")) 
					str.append(operator.pop() + " ");
				
				operator.pop();
			}
			else if (evaluateOperator(token)) {
				while ((!operator.isEmpty()) && (!(operator.peek().equals("(")))
						&& (precedence(token.charAt(0)) <= precedence(operator.peek().charAt(0)))) 
					str.append(operator.pop() + " ");

				operator.push(token);
			}
		}

		while (!operator.isEmpty()) 
			str.append(operator.pop());

		tokenizer.close();
		return str.toString();
	}

	/**
	 * A method that evaluates if its an operand
	 * @param exp The expression to be evaluated
	 * @return true if its a digit
	 */
	private boolean evaluateOperand(String exp){
		return Character.isDigit(exp.charAt(0));
	}

	/**
	 * A method that evaluates if its an operator
	 * @param exp The expression to be evaluated
	 * @return true if its an operator
	 */
	private boolean evaluateOperator(String exp) {
		switch (exp) {
		case "*":
			return true;
		case "/":
			return true;
		case "+":
			return true;
		case "-":
			return true;
		default:
			return false;
		}
	}

	/**
	 * A method that evaluates the operator precedence
	 * @param operator the operator sign
	 * @return The value of precedence
	 */
	private int precedence(char operator) {
		switch (operator) {
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
		}
	}


	/**
	 * The main application 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a valid infix expression: ");
		String expression = keyboard.nextLine();

		keyboard.close();

		PostfixConverter evaluator = new PostfixConverter();

		String result = evaluator.convertToPostfix(expression);
		System.out.println("The expression equals " + result);
		System.out.println();

		System.out.println("End of application.");
		System.exit(0);
	}

}
