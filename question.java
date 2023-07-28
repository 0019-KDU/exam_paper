import java.util.Scanner;

public class question{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first number:");
        double a=input.nextDouble();

        System.out.print("Enter second number:");
        double b=input.nextDouble();

        System.out.print("Enter third number:");
        double c=input.nextDouble();

        double discriminant=b*b-4*a*c;

        if(discriminant<0){
            System.out.println("No real roots. The equation has complex roots.");
        }else{
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                                            
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }



    }
}