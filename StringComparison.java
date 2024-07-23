import java.util.Scanner;

public class StringComparison
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter starting index: ");
        int i = sc.nextInt();
        System.out.print("Enter number of characters to compare: ");
        int n = sc.nextInt();

        boolean result = str1.regionMatches(true, i, str2, i, n);

        System.out.println((result ? "The Strings are equal" : "The strings are not equal" ));
    }
}
