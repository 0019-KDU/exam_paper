import java.util.Scanner;

public class question{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver");
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            // Not a quadratic equation; solve as a linear equation (b*x + c = 0)
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Identity equation: All real numbers are solutions.");
                } else {
                    System.out.println("No solution.");
                }
            } else {
                double root = -c / b;
                System.out.println("Linear equation root: " + root);
            }
        } else {
            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                // No real roots, the equation has complex roots.
                System.out.println("No real roots. The equation has complex roots.");
            } else {
                // Calculate the roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                // Limit the displayed roots to 2 decimal places
                root1 = Math.round(root1 * 100.0) / 100.0;
                root2 = Math.round(root2 * 100.0) / 100.0;

                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            }
        }

        scanner.close(); 
        /*To advance the code, you can consider adding error handling, handling special cases, and providing a more user-friendly experience. Here are some improvements you can make to the quadratic equation solver:

Handle special cases:

If 'a' is 0, it is not a quadratic equation but a linear equation. Handle this case separately and find the root using the linear equation formula (b*x + c = 0).
If 'a', 'b', and 'c' are all 0, it represents an identity equation (0x^2 + 0x + 0 = 0). In this case, any real number is a root.
Handle precision:

Limit the displayed roots to a specific number of decimal places for a cleaner output.
Provide a user-friendly interface:

Add clear instructions and messages to guide the user through the input process.
Inform the user about the nature of the roots (real, complex) and any special cases encountered.*/     
    }
}
