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

    }
}