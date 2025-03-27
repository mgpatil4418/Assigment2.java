import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is a vowel or consonant using if-else
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        // Close the Scanner object
        scanner.close();
    }
}

