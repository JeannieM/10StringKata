package stringkata;

import java.util.Arrays;

/**
 * @author JeannieMcCarthy
 *
 */
public class StringCalc {

	public static void main(String[] args) {
//		System.out.println(add("1"));
//		System.out.println(add("1,2"));
//		System.out.println(add("//;\n1;2;3;4"));
//		System.out.println(add("//}\n1}2}3}4"));
		//System.out.println(add("-1,2,2,-1"));
//		System.out.println(add("1,2,3,1001"));
		
		System.out.println(add("//[*%]\n1*2%3"));

	}

	public static int add(String numbers) {
		int sum = 0;

		String[] splitNumbers;
		String trimmed;
		String delimiter;
		int currNumber;
		int countNeg = 0;
		String negativeNums = "";
try {
		if (numbers.isEmpty()) {
			return 0;
		} else if (numbers.length() > 2 && numbers.substring(0, 2).matches("//")) {
			System.out.println(numbers.indexOf("\n"));
			delimiter = numbers.substring(2, numbers.indexOf("\n"));
			System.out.println(delimiter);
			trimmed = numbers.substring(numbers.indexOf("\n")+1);
			System.out.println(trimmed);
			splitNumbers = trimmed.split(delimiter);
			System.out.println(Arrays.toString(splitNumbers));
		} 
			else {
			splitNumbers = numbers.split("[,\\n]");
		}
		for (String number : splitNumbers) {
			currNumber = Integer.parseInt(number);
			
			if (currNumber < 0) {
				countNeg++;
				negativeNums = negativeNums.concat(number);
				System.out.println(negativeNums);
			}
			else if (currNumber > 1000) {
				currNumber = 0;
			}
			sum += currNumber;
		}
		if (!(countNeg == 0)) {
			throw new Exception("Negatives not allowed");
		}
}		
		catch (Exception e) {
			System.out.println(e.getMessage() + negativeNums);
			
		}
		return sum;
		// “//[delimiter]\n[numbers…]”
	}
}
