public class PalindromeInt {

    public static void CheckPalindromee(String f){

        String reverse = new StringBuffer(f).reverse().toString();

        //check here

        if(f.equals(reverse))
            System.out.println("Yes," + f + "na palindrome");
        else System.out.println("No, no be palindrome");
    }

    public static void main(String[] args){
        CheckPalindromee("1921");

    }
}
