//importing the util package to use Scanner class for reading input
import java.util.*;

class Norm
 {

     public static void main(String []args)
     {
         //creating an arrayof size 3
         int a[]= new  int[3];

        // declaring a norm variable to hold the value of the norm of the vector
         double norm;

        //creating the scanner object
        Scanner s= new Scanner(System.in);

        // taking the user input for the values a1 a2 and a3
        System.out.println("enter the values for a1 a2 and a3: ");

        //iterating through the array 3 times
        for(int i=0; i<3;i++)
        {
            //reading input  form keyboard
            a[i]=s.nextInt();
        }

        //calculating the norm of the vector using sqrt and pow functions of Math library 
        //and storing it in norm
        norm=Math.sqrt( Math.pow(a[0],2) + Math.pow(a[1],2) + Math.pow(a[2],2));

        //displaying the value of norm
         System.out.println("Norm of the vector is : "+String.format("%.2f",norm));
     }

 }