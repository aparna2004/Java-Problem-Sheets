import java.util.Scanner;

public class StringAnalysis
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        int length = name.length();
        System.out.println("The length of your name is: " + length);

        char searchChar = 'a';
        int count = 0;
        System.out.print("The character '" + searchChar + "' is found at positions: ");
        for (int i = 0; i < length; i++)
            if (name.charAt(i) == searchChar)
            {
                count++;
                System.out.print(i + " ");
            }
        System.out.println("\nThe character '" + searchChar + "' appears " + count + " times.");
    }
}
