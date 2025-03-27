import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number (1-12)
        System.out.print("Enter a number (1-12): ");
        int monthNumber = scanner.nextInt();

        // Use a switch statement to print the corresponding month name
        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid input. Please enter a number between 1 and 12.";
                break;
        }

        // Print the month name
        System.out.println(monthName);

        // Close the Scanner object
        scanner.close();
    }
}

