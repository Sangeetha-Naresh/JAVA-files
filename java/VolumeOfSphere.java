import java.util.*;
import java.io.FileWriter; 

// creating a class Sphere
class Sphere
{
    // properties declared are name and radius
    String name;
    double radius;

    //method for taking the user input
    Scanner s= new Scanner(System.in);
    
    //method for taking theinput for name and radius of sphere from user
    void getdata()
    {
          System.out.println("Enter the name :");
          name=s.next();
          
          System.out.println("Enter the radius :");
          radius=s.nextDouble();
    }

    //method that calculates voulume of Sphere
    double calculate()
    {
        double  volume= (4*22*radius*radius*radius)/(3*7);
        return volume;
    }
}

//main class
public class VolumeOfSphere 
{
      
   public static void main(String args[]) 
    {   
        // creating twp sphere objects
            Sphere s1= new Sphere();
            Sphere s2= new Sphere();

        // creating two volume variables
            double vol1, vol2;
	
        
           //calling the getdata method to enter the sphere data 
            System.out.println("Enter the first sphere data:");
            s1.getdata();
         	System.out.println("Enter the second sphere data::");
            s2.getdata();
                
            //calling the calculate method 
	        vol1=s1.calculate();
            vol2=s2.calculate();

            //displaying the output in the program
             System.out.println("Volume Of Sphere 1 is:" +vol1);
             
             System.out.println("Volume Of Sphere 2 is:" +vol2);

             // File functions
             try
             { 
                 //converting value of volumes to string to make it compatible with the file object
                String v1=String.valueOf(vol1);
                String v2=String.valueOf(vol2);

                //creating the filewrite object and initialo=izing it to a text file
                FileWriter fw=new FileWriter("D:\\C\\spheres\\sphere.txt"); 

                //writing contents one by one to the file
                fw.write(s1.name);
                fw.write("\t");
                fw.write(v1); 

                fw.write("\n");

                fw.write(s2.name);
                fw.write("\t");
                fw.write(v2); 

                //closing the file
                fw.close(); 
            }
            catch(Exception e)
            {
                //catches any exceptions thrown from the try block
                    System.out.println(e);
            } 
      }
}