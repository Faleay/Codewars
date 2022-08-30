class Palindrome
{
    public static void isPalindrome(String palindrome)
    {
        palindrome = palindrome.replaceAll(" ", "");
        palindrome = palindrome.toLowerCase();
        String reversed = new StringBuilder(palindrome).reverse().toString();
        if(palindrome.equals(reversed))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It isn't a palindrome");
        }
        // System.out.println(palindrome);
        // System.out.println(reversed);
    }

    public static void main(String[] args)
    {

        String test1 = "JmrrmJ";
        String test2 = "F AoAO AF";
        String test3 = "qOH hra";

        isPalindrome(test1);
        isPalindrome(test2);
        isPalindrome(test3);

    }
}