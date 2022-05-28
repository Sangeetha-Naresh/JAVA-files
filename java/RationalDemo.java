import java.util.*;
import java.util.InputMismatchException;
import java.io.*;

class DivideByZeroException extends Exception 
{
     DivideByZeroException() 
     {
          super();
     }
    
    DivideByZeroException(String message) 
    {
        // Call constructor of parent Exception
        super(message);
    }

    String getMessage()
    {
        return "Cannot divide By zero";
    }
}

//creating the interface
interface RationalInterface 
{
  void doRational();   
  int setUserInput();
//  double calcRational();

}

class Rational implements RationalInterface
{
    int numerator,denom;
    double result;

    //method for taking the user input
    Scanner s= new Scanner(System.in);

    Rational()
    {
        numerator=0;
        denom=0;
        result=0.0;
    }

    public void doRational() 
    {
       

        setUserInput();

       try
       {
           
        result=calcRational();
        System.out.println(result);
       }
       catch(DivideByZeroException e) 
        {
             System.out.println(e.getMessage());
        }
        
    }

    public int setUserInput()
    {
        System.out.println("Enter an int(whole number) for the numerator; ");
        numerator=s.nextInt();

        System.out.println("Enter an int(whole number) for the denominator, but dont enter 0: ");
        denom=s.nextInt();     

        return 1;

    }

   double calcRational() throws DivideByZeroException
    {
        double result,num,den;
        num=numerator;
        den=denom;
        try{
             result=num/den;
             return result;
        }
       
        
        catch(ArithmeticException a) 
        {
            String s="Cannot divide By zero";
            throw new DivideByZeroException(s);
        }
       
        
        
    }
}




class RationalDemo
{
    public static void main(String args[])
    {
        Rational rat1= new Rational();

        try
        {
            rat1.doRational();
        }
        
        catch(InputMismatchException i)
        {
            System.out.println("try running the program again, this time use integers for numerator and denominator");
        }
        
        
        finally
        {
              System.out.println("thanks for using Rational Demo, CU Soon");
        }
    }
}