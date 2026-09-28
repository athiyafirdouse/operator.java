import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int Num1 = sc.nextInt();
        System.out.println("enter the second number");
        int Num2 = sc.nextInt();
        System.out.println("enter the third number");
        int Num3 = sc.nextInt();

        if(Num1>Num2 && Num1 > Num3)
        {
          System.out.println("the greatest number is num1");

        }
        else if(Num2 > Num3 && Num2 > Num1)
        {
            System.out.println("the greatest number is num2");

        }
        else
        {
            System.out.println("the graetest number is num 3");
        }

    }
    
}
