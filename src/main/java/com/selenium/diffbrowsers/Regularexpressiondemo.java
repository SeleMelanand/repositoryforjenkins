package com.selenium.diffbrowsers;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Regularexpressiondemo {
	@Test
	public void regdemo() {
		
		String email= "anandakumar.sivakumar@gmail.com";
		//System.out.println(Pattern.matches("[a-zA-Z0-9._]{1,30}@[a-zA-Z0-9_]{1,30}.[a-zA-Z]{2,3}", email));
		
		System.out.println(Pattern.matches("[a-z&&[]A-Z0-9._]{1,30}@[a-zA-Z0-9_]{1,30}.[a-zA-Z]{2,3}", email));

	}

}
