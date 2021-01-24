public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit ;
        int initial = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if (initial == reverse) {

            return true;
        }
        else
            return false;
    }
}
//Victor.Aremu