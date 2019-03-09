package com;

import java.util.function.Predicate;

public class PasswordChecker {

	void check(String t,Predicate<String> p) {
		System.out.println(p.test(t));
	}

}
