import java.util.Scanner;

class Greet {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Please enter your name: ");

        // Read the user's name from the input
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");
    }
}
