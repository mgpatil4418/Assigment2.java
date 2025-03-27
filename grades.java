import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's marks
        System.out.print("Enter the student's marks (0-100): ");
        int marks = scanner.nextInt();

        // Validate the input marks
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else {
            // Assign grades based on the marks
            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'F'; // Fail
            }

            // Print the assigned grade
            System.out.println("Grade: " + grade);
        }

        // Close the Scanner object
        scanner.close();
    }
}