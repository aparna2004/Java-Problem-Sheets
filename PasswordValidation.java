import java.util.Scanner;

public class PasswordValidation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean isValid;

        do {
            System.out.println("Enter a password: ");
            String password = sc.nextLine();
            isValid = validatePassword(password);

            if (isValid)
                System.out.println("Password is valid.");
        } while (!isValid);
    }

    static boolean validatePassword(String password)
    {
        if (password.length() < 6)
        {
            System.out.println("Password must be at least 6 characters long.");
            return false;
        }
        int ucCount = 0,lcCount = 0, dCount = 0;


        for (char ch : password.toCharArray())
        {
            if (Character.isUpperCase(ch))
                ucCount++;
            if (Character.isLowerCase(ch))
                lcCount++;
            if (Character.isDigit(ch))
                dCount++;
        }

        if (ucCount < 2)
        {
            System.out.println("Password must contain at least two uppercase letters.");
            return false;
        }

        if (lcCount < 3)
        {
            System.out.println("Password must contain at least three lowercase letters.");
            return false;
        }

        if (dCount < 1)
        {
            System.out.println("Password must contain at least one digit.");
            return false;
        }

        return true;
    }
}
