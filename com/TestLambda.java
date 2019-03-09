package com;

import java.util.function.Predicate;

public class TestLambda {

	public static void main(String[] args) {

		Printable p1 = new Printable() {
			@Override
			public void print() {
				System.out.println("Print..");
			}
		};

		p1.print();

		Printable p2 = () -> System.out.println("Instant Print..");
		p2.print();

		ParLambda par1 = new ParLambda() {
			@Override
			public void lambda(int x) {
				System.out.println("Par= " + x);
			}
		};

		par1.lambda(1);

		ParLambda par2 = (x) -> System.out.println("Par Lambda= " + x);
		par2.lambda(2);

		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if (t.length() > 5)
					return true;
				return false;
			}
		};

		Predicate<String> max = (t) -> {
			return (t.length() <= 10) ? true : false;
		};

		PasswordChecker pc = new PasswordChecker();

		System.out.println("Check if string length is min 5");
		pc.check("iamapassword", predicate);

		System.out.println("Check if string length is max 10");
		pc.check("iamapassword", max);

		System.out.println("Check if string is empty");
		pc.check("", (t) -> {
			return (t.isEmpty()) ? true : false;
		});

	}
}
