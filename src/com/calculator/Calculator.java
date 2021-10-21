package com.calculator;

public class Calculator {

	private double num1;
	private double num2;
	private String operation;
	private double result;
	
	
//	Setters
	public void setOperandOne(double num) {
		this.num1 = num;
	}
	public void setOperandTwo(double num) {
		this.num2 = num;
	}
	public void setOperation(String op) {
		this.operation = op;
	}
	
	public void performOperation() {
		if(this.operation == "+" || this.operation == "-" || this.operation == "/" || this.operation == "*" || this.operation == "%") {
			if(this.operation == "+") {	
			this.result = this.num1 + this.num2;
			System.out.println("The operation has been performed");
			}
			if(this.operation == "-") {
				this.result = this.num1 - this.num2;
				System.out.println("The operation has been performed");
			}
			if(this.operation == "/") {
				this.result = this.num1 / this.num2;
				System.out.println("The operation has been performed");
			}
			if(this.operation == "%") {
				this.result = this.num1 % this.num2;
				System.out.println("The operation has been performed");
			}
			if(this.operation == "*") {
				this.result = this.num1 * this.num2;
				System.out.println("The operation has been performed");
			}
		}
	else {
		System.out.println("You didn't entered a correct operator like '+' '-' '/' '*' '%'");
	}
		
		
		
		
		
		
}
	
	
//	Getters
	
	public void getResults() {
			System.out.println("The result for your operation is: "+ this.result);
	}
	
	
	

}
