public class Palindrome {

    public static void CheckPalindrome(String s) {

        String reverse = new StringBuffer(s).reverse().toString();

        //check now
        if (s.equals(reverse))

            System.out.println("YES, its a palindrome");

        else
            System.out.println("NO, its not a palindrome");
    }

    public static void main(String[] args){

            CheckPalindrome("dad");
        }
}

