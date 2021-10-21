package com.calculatorTest;
import com.calculator.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setOperandOne(50);
		calc.setOperandTwo(5);
		calc.setOperation("*");
		calc.performOperation();
		calc.getResults();
	}
}
