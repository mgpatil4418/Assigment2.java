import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number (1-7)
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        // Use a switch statement to print the corresponding day of the week
        String dayOfWeek;
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid input. Please enter a number between 1 and 7.";
                break;
        }

        // Print the day of the week
        System.out.println(dayOfWeek);

        // Close the Scanner object
        scanner.close();
    }
}



