import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to our simple Java project.");

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
