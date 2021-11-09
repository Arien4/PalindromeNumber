package practice;

public class Main {

    public static void main(String[] args) {
	/*Given an integer x, return true if x is palindrome integer.

        An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.



        Example 1:

        Input: x = 121
        Output: true
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        Example 4:

        Input: x = -101
        Output: false


        Constraints:

        -231 <= x <= 231 - 1


        Follow up: Could you solve it without converting the integer to a string?*/

        // int x = 1000001;
        // int x = 52899876;
        int x = 516715;
        System.out.println(isPalindrome(x));
    }




    public static boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && (x % 10 == 0)) {
            return false;
        }

        if (x >= 0 && x < 10) {
            return true;
        }

        int reverse = 0; // reading number from the end
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
            System.out.println("reverse = " + reverse);
            System.out.println("x = " + x);
        }
        return (x == reverse || x == reverse / 10); // for odd or even numbers
    }
}
