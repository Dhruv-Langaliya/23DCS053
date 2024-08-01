import java.util.*;
public class part_2_9th
{
    public static void main(String[] args)
    {
        String str = "asdfghjklLLlkjhgfdsa";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
