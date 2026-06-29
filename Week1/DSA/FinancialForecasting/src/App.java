
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double presentValue = scanner.nextDouble();
        System.out.print("Enter growth rate (as a decimal): ");
        double growthRate = scanner.nextDouble();
        System.out.print("Enter number of periods: ");
        int periods = scanner.nextInt();

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }

    /**
     * Calculates the future value of a financial asset using a recursive
     * approach.
     *
     * Time Complexity: O(n)
     *
     * Space Complexity: O(n)
     *
     * @param currentValue
     * @param growthRate
     * @param periods
     * @return The calculated future value.
     */
    private static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base Case: 0 periods remaining
        if (periods == 0) {
            return currentValue;
        }
        // Recursive Case: Apply growth rate for one period and decrement periods
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }
}
