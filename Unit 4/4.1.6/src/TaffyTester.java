import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
        System.out.println("Starting Taffy Timer...");
        // Create Scanner
        Scanner input = new Scanner(System.in);

        int temperature = 0;

        while (temperature >= 270) {
            // Ask user for temperature
            System.out.println("Enter the temperature: ");
            temperature = input.nextInt();

            if (temperature >= 270) {
                System.out.println("The mixture isn't ready yet.");
        }
    }
    
    System.out.println("Your taffy is ready for the next step!");
    
    }
}
