package com.training.javaa;

public class Calculator {
	
	static int a,b,k;

	public static void main(String[] args) {
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		Calculator calci = new Calculator();
		calci.add();
		calci.sub();
		calci.mul();
		calci.div();
	}
	
	void add() {
		k=a+b;
		System.out.println("add : "+k);
	}
	void sub() {
		k=a-b;
		System.out.println("sub : "+k);
	}
	void mul() {
		k=a*b;
		System.out.println("mul : "+k);
	}
	void div() {
		k=a/b;
		System.out.println("div : "+k);
	}

}

