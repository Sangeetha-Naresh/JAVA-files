import java.util.*;
import java.util.InputMismatchException;
import java.io.*;

class DivideByZeroException extends Exception 
{
     DivideByZeroException() 
     {
         // super();
     }
    
    DivideByZeroException(String message) 
    {
        // Call constructor of parent Exception
        super(message);
    } 
}

//creating the interface
interface RationalInterface 
{
  void doRational();   
  int setUserInput();
  double calcRational();

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
        result=calcRational();
        System.out.println(result);
    }

    public int setUserInput() 
    {
        System.out.println("Enter an int(whole number) for the numerator; ");
        numerator=s.nextInt();

        System.out.println("Enter an int(whole number) for the denominator, but dont enter 0: ");
         try
         {
            denom=s.nextInt();     
            if (denom==0)
            {
                DivideByZeroException me= new DivideByZeroException("Cannot divide By zero");
                throw me;
            }
        }
        catch( DivideByZeroException e)
        {   
            e.printStackTrace();
        }
       
        return 1;

    }

    public double calcRational() 
    {
        double result,num,den;
        num=numerator;
        den=denom;
     
        result=num/den;
         return result;      
        
    }
}


class RationalDemo1
{
    public static void main(String args[])
    {
        char ch;
        //method for taking the user input
        Scanner s= new Scanner(System.in);
       
        Rational rat1= new Rational();

        try
        {
             do{
                rat1.doRational();
                System.out.println("enter y to calcuate another number:") ;
                ch=s.next().charAt(0);
                ch=Character.toLowerCase(ch) ;
             }
             while(ch!='n');
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
