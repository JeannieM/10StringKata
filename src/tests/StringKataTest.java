package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author JeannieMcCarthy
 *
 */

import org.junit.jupiter.api.Test;

import stringkata.StringCalc;
public class StringKataTest {

	@Test //1
	void testReturnsZeroIfEmpty() {
		String numbers = "";
		assertEquals(0, StringCalc.add(numbers));
	}
	@Test//2
	void testOneNumber() {
		String numbers = "1";
		assertEquals(1, StringCalc.add(numbers));
	}
	@Test//3
	void testadds1and2() {
		String numbers = "1,2";
		assertEquals(3, StringCalc.add(numbers));
	}
	@Test//4
	void testaddsFiveNumbers() {
		String numbers = "1,2,3,4,5";
		assertEquals(15, StringCalc.add(numbers));
	}
	@Test//5
	void testNewlineDelimiter() {
		String numbers = "1\n2\n3\n4\n5";
		assertEquals(15, StringCalc.add(numbers));
	}
	@Test//6
	void testSemicolonDelimiter() {
		String numbers = "//;\n1;2;3";
		assertEquals(6, StringCalc.add(numbers));
	}
	@Test//7
	void testLetterBDelimiter() {
		String numbers = "//b\n1b2b3";
		assertEquals(6, StringCalc.add(numbers));
	}
	@Test//8
	void testNumberDelimiter() {
		String numbers = "//1\n21213";
		assertEquals(7, StringCalc.add(numbers));
	}
	@Test//9
	void testCurlyBraceDelimiter() {
		String numbers = "//}\n1}2}3";
		assertEquals(6, StringCalc.add(numbers));
	}
	@Test//10
	void test2CharDelimiter() {
		String numbers = "//oo\n1oo2oo3";
		assertEquals(6, StringCalc.add(numbers));
	}
	@Test//11
	void testPrintTotalNegatives() {
		String numbers = "-1,2,2,-1";
		assertEquals(2, StringCalc.add(numbers));
	}
	@Test//12
	void testIgnoreOver1000() {
		String numbers = "1,2,3,1001";
		assertEquals(6, StringCalc.add(numbers));
	}
	@Test//13
	void testAllowMultipleDelimiters() {
		String numbers = "//[*%]\n1*2%3";
		assertEquals(6, StringCalc.add(numbers));
	}
	
//	@Test//11
//	void testThrowsException() {
//		String numbers = "1,2,0,-3,9,-4,8,4,-1";
//		assertThrows(Exception.class, () -> {
//			StringCalc.add(numbers);
//			});
//	}
	//I don't know how to write tests to check StringCalc Kata #5
	
}
