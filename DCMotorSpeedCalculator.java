import java.util.Scanner;

public class DCMotorSpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Voltage, BackEMF, and MotorConstant
        System.out.println("Enter the input voltage (V):");
        double voltage = scanner.nextDouble();

        System.out.println("Enter the back EMF (V):");
        double backEMF = scanner.nextDouble();

        System.out.println("Enter the motor constant (V/RPM):");
        double motorConstant = scanner.nextDouble();

        // Validate inputs
        if (motorConstant == 0) {
            System.out.println("Error: Motor constant cannot be zero (division by zero).");
        } else if (voltage < 0 || backEMF < 0 || motorConstant < 0) {
            System.out.println("Error: Input values cannot be negative.");
        } else {
            // Calculate speed
            double speed = (voltage - backEMF) / motorConstant;

            // Output the result
            System.out.printf("The speed of the DC motor is: %.2f RPM%n", speed);
        }

        scanner.close();
    }
}