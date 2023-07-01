//Java code that simulates a gas tank and calculates the amount of gas remaining based on a distance input:
import java.util.Scanner;

public class GasTankSimulation {
    public static void main(String[] args) {
        final int MAX_CAPACITY = 100; // Maximum capacity of the gas tank
        int currentFuelLevel; // Current fuel level in the gas tank

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance
        System.out.print("Enter the distance in kilometers: ");
        int distance = scanner.nextInt();

        // Prompt the user to enter the current fuel level
        System.out.print("Enter the current fuel level in liters: ");
        currentFuelLevel = scanner.nextInt();

        // Calculate the remaining fuel level
        int remainingFuel = currentFuelLevel - (distance / 10);

        // Check if remaining fuel is less than 0 and adjust it to 0 if necessary
        if (remainingFuel < 0) {
            remainingFuel = 0;
        }

        // Check if remaining fuel is greater than the maximum capacity and adjust it to the maximum if necessary
        if (remainingFuel > MAX_CAPACITY) {
            remainingFuel = MAX_CAPACITY;
        }

        // Display the remaining fuel level
        System.out.println("The remaining fuel level is: " + remainingFuel + " liters");

        scanner.close();
    }
}
