package Questions;
// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

// Example 1:

// Input: num1 = "11", num2 = "123"
// Output: "134"
// Example 2:

// Input: num1 = "456", num2 = "77"
// Output: "533"
// Example 3:

// Input: num1 = "0", num2 = "0"
// Output: "0"

// Constraints:
// 1 <= num1.length, num2.length <= 104
// num1 and num2 consist of only digits.
// num1 and num2 don't have any leading zeros except for the zero itself.

public class Leetcode415 {
  public String addString(String num1, String num2) {
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    StringBuilder result = new StringBuilder();
    int carry = 0;
    while (i >= 0 || j >= 0 || carry != 0) {
      int sum = carry;
      if (i >= 0) {
        sum += num1.charAt(i) - '0';
        i--;
      }
      if (j >= 0) {
        sum += num2.charAt(j) - '0';
        j--;
      }
      carry = sum / 10;
      result.append(sum % 10);
    }
    return result.reverse().toString();
  }
}
