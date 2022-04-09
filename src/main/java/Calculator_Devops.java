import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator_Devops {
    private static final Logger logger = LogManager.getLogger(Calculator_Devops.class);
    public static void main(String[] args)
    {
        System.out.println("Enterd\n");
        System.out.println("Hello\n");
        System.out.println("----Calculator----");
        logger.info("------Calculator------");
        while(true)
        {
            System.out.println("\n\n1. Square root function\n2. Factorial function\n3. Natural logarithm(base e)\n4. Power function\n5. Exit\n");
            System.out.println("Your choice:\t");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            logger.info("Choice entered : "+choice);
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
        logger.info("Called square root, input number: "+number);
        if(number < 0)
        {
            logger.error("Invalid input to square root function: entered input is negative number");
            return Double.NaN;
        }
        double result=Math.sqrt(number);
        logger.info("Result: "+result);
        return result;

    }
    public double factorial(double number)
    {
        logger.info("Called Factorial, input number: "+number);
        if(number < 0)
        {
            logger.error("Invalid input to factorial : entered input is negative number");
            return Double.NaN;
        }
        double fact=1;
        for(double i=2;i<=number;i++)
            fact*=i;
        logger.info("Result: "+fact);
        return fact;
    }
    public double logarithm(double number)
    {
        logger.info("Called logarithm, input number: "+number);
        if(number < 0)
        {
            logger.error("Invalid input to logarithm : entered input is negative number");
            return Double.NaN;
        }
        double result=Math.log(number);
        logger.info("Result: "+result);
        return result;
    }
    public double power(double a,double b)
    {
        logger.info("Called power , input number: "+a+" "+b);
        double result=Math.pow(a,b);
        logger.info("Result: "+result);
        return result;
    }
}
