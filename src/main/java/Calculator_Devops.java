import java.util.Scanner;

public class Calculator_Devops {
    public static void main(String[] args)
    {
        System.out.println("----Calculator----");
        while(true)
        {
            System.out.println("\n\n1. Square root function\n2. Factorial function\n3. Natural logarithm(base e)\n4. Power function\n5. Exit\n");
            System.out.println("Your choice:\t");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            Calculator_Devops c=new Calculator_Devops();
            switch (choice)
            {
                case 1: System.out.println("Input a number");
                        double num=sc.nextDouble();
                        System.out.println("Square root of "+num+" = "+c.squareroot(num));
                        break;
                case 2: System.out.println("Input an integer");
                        double n=sc.nextInt();
                        System.out.println("Factorial of "+n+" = "+ c.factorial(n));
                        break;

                case 3: System.out.println("Input a positive number");
                        double number=sc.nextDouble();
                        System.out.println("ln("+number+") = "+c.logarithm(number));
                        break;

                case 4: System.out.println("Input two numbers");
                    double a=sc.nextInt();
                    double b=sc.nextInt();
                    System.out.println("Power of "+a+" raised to "+b+" = "+c.power(a,b));
                    break;
                case 5: System.exit(0);
            }
        }
    }
    public double squareroot(double number)
    {
        return Math.sqrt(number);
    }
    public double factorial(double number)
    {
        if(number < 0)
            return Double.NaN;
        double fact=1;
        for(double i=2;i<=number;i++)
            fact*=i;
        return fact;
    }
    public double logarithm(double number)
    {
        return Math.log(number);
    }
    public double power(double a,double b)
    {
        return Math.pow(a,b);
    }
}
