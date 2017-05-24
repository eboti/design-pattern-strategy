package com;

public class App {

	// http://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Context context = new Context(new OperationAdd());
		System.out.println("1 + 2 = " + context.executeStrategy(1, 2));
		
		context = new Context(new OperationSubstract());
		System.out.println("1 - 2 = " + context.executeStrategy(1, 2));
		
		context = new Context(new OperationMultiple());
		System.out.println("1 * 2 = " + context.executeStrategy(1, 2));
	}

}
