//creating the interface
interface MyInterface 
{
  //contains only one default method
  int CountNonZero(int n);
    
}

//creating abstract class that implements the above interface
abstract class MyClass implements MyInterface
{
    //variable to hold the count value
    int c=0;

    //recursive method definotion
    public int CountNonZero(int n)
    {
        //variable to hold the remainder
        int r;
        //checks if n is greater than 0
        if(n>0)
        {
            r=n%10;// computes the remainder from n
            
            //checks if remainder not equal to 0
            if(r!= 0)
            {
                c++;//increments the counter
            }
            //recursive call 
            CountNonZero(n/10);
        }
       
       //returns the counter value
        return c;
    }

    //absract method declaration 
    abstract double power(int n, int m);
    
}

//class that extends MyClass and implements the power method of the abstract class
class Anonymous extends MyClass 
{
    //defining the power method
     double power(int n, int m)
    {
        // variable to hold power value
        double d=1.0;
        //loop to iterate m number of times multiplication
        for(int i=1;i<=m;i++)
        {
            d=d*n; //computes each time the product
        }
        
        return d;//returns the power
    }
}

// Driver code
public class MyDriverPro 
{
    public static void main(String[] args)
    {
        //creating object for Anonymous class
       Anonymous m = new Anonymous();
  
       // calling the CountNonZero() method and assigning the result to count
        int count=m.CountNonZero(20203);

        //displaying the count value
        System.out.println("countNonzero is : "+count);

       //calling the power() method and assigning the result to p
        double  p=m.power(5,2);

           //displaying the p value
        System.out.println("The power value is : "+ p);
          
    }
}