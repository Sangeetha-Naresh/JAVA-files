//importing the util package to use Scanner class for reading input
import java.util.*;

//creating the main class
class Series
{
   public static void main(String args[])
    {
        //declaring variables for start and end values
        int intStart, intEnd;

        //creating the scanner object
        Scanner s= new Scanner(System.in);

        //taking user input
        System.out.println("Enter the Start and End values: ");
        intStart=s.nextInt();
        intEnd=s.nextInt();

        //checking if start value is greater than end value
        if(intStart>intEnd)
        {
             System.out.println("Start should be smaller than end");
        }
        else
        {
            //if start value is not greater then generate the series

            //first n loop to iterate 5, 10, 15 ....50
             for(int n=5; n<=50; n=n+5)
             {
                 // declaring a local value to hold the value of n
                 double nval;
                 
                 //assigning n to nval
                 nval=n;

                 System.out.print("For n ="+nval);

                 //declaring sum and temp variable x
                 double sum=0;
                 double x=0.0;

                 //iteratin from start value to end value
                 for(int i=intStart; i<=intEnd; i++)
                 {
                     //calculating the sum each time for (inStart + x)/n
                     sum=sum +((intStart+x)/nval);

                     //incrementing the value of x
                     x=x+1.0;
                 }
                 
                 //printing the value of sum using Math.floor and without using any of the format functions
                 //since format functions rounds off the values and does not give
                 // the exact output as mentioned in the given question
                  System.out.println("\t The Sum is : "+ Math.floor(sum * 100) / 100);
                  System.out.println("");
             }
         }

    }
}