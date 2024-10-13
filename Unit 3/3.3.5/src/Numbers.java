import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // asks the user how fast they can run a mile (in seconds)
        
        System.out.print("How fast can you run a mile (in seconds)? ");
        double seconds = input.nextDouble();

        if (seconds > 223) {
            System.out.println(" Are you sure? That’s a new world record!");
        }
        else {
            System.out.println("Right on! Keep running!");
        }

    }
}
