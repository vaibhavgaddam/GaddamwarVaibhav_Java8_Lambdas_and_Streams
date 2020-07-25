package Epam.Java8_Streams_and_Lambdas;

public class Palindroms {
	public boolean isPalindrome(String str) {
	    StringBuilder reverse = new StringBuilder(str).reverse();
	    return (reverse.toString()).equals(str);
	}
}
