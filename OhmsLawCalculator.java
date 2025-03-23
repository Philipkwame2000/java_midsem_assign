import java.util.Scanner;

public class OhmsLawCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user which parameter is unknown
        System.out.println("Which parameter is unknown? (Enter 1 for Voltage, 2 for Current, 3 for Resistance):");
        int choice = scanner.nextInt();

        double voltage = 0, current = 0, resistance = 0;

        switch (choice) {
            case 1:
                // Calculate Voltage (V = I * R)
                System.out.println("Enter Current (in Amperes):");
                current = scanner.nextDouble();
                System.out.println("Enter Resistance (in Ohms):");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.printf("Voltage (V) = %.2f V%n", voltage);
                break;

            case 2:
                // Calculate Current (I = V / R)
                System.out.println("Enter Voltage (in Volts):");
                voltage = scanner.nextDouble();
                System.out.println("Enter Resistance (in Ohms):");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.printf("Current (I) = %.2f A%n", current);
                break;

            case 3:
                // Calculate Resistance (R = V / I)
                System.out.println("Enter Voltage (in Volts):");
                voltage = scanner.nextDouble();
                System.out.println("Enter Current (in Amperes):");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.printf("Resistance (R) = %.2f Ω%n", resistance);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}