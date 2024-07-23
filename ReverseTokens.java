import java.util.Scanner;

public class ReverseTokens
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] tokens = input.split(" ");
        System.out.println("The Tokens in reverse order: ");
        for (int i = tokens.length - 1; i >= 0; i--)
            System.out.print(tokens[i] + " ");
    }
}
