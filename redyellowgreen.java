import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a traffic light color
        System.out.print("Enter a traffic light color (red, yellow, green): ");
        String color = scanner.next().toLowerCase();

        // Use a switch statement to print the appropriate message
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid input. Please enter red, yellow, or green.");
                break;
        }

        // Close the Scanner object
        scanner.close();
    }
}

