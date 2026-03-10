/**
 *
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 *
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define input string
        String input = "Level";

        // Convert to lowercase for logical comparison
        input = input.toLowerCase();

        // Create strategy object
        PalindromeStrategy strategy = new SimpleStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        // Execute palindrome check
        boolean isPalindrome = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution duration
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + executionTime + " ns");
    }
}

/**
 * Palindrome strategy interface
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * Simple palindrome checking algorithm
 */
class SimpleStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}