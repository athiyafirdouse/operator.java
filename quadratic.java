import java.util.Scanner;
public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        double a = sc.nextDouble();
        System.out.println("Input b:");
        double b = sc.nextDouble();
        System.out.println("Input c:");
        double c = sc.nextDouble();

        double result = b * b - 4.0 * a *c;
        if(result > 0.0)
        {
            double r1 = (-b + Math.pow(result,0.5))/(20 * 2);
            double r2 = (-b + Math.pow(result, 0.5))/(20 * 2);
            System.out.println("the roots are " + r1 + "and" + r2);
        }
        else if(result ==0.0)
        {
            double r1 = -b / (2.0 *2);
            System.out.println("the root is " + r1);

        }
        else
        {
            System.out.println("the equation has no real roots");
        }


    }
    
}
