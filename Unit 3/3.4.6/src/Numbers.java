import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive!");
        } else if (number < 0) {
            System.out.println("The number is negative!");
        } else {
            System.out.println("The number is neither positive nor negative!");
            
        }
        
    }
}
