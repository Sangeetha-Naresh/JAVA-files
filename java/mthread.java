// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread 
{
    //creating a variable to store the threads name
    String name;
    
    //creating constructor for thread by passing name
    MultithreadingDemo(String n)
    {
        name=n;
    }

    //getter method to get the name of the thread
    String getThread()
    {
        return name;
    }

    //overriding run method of the Thread class
    public void run()
    {
        try 
        {
            // Displaying the thread that is running
            System.out.println("Thread " + getThread()+ " is running");
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Thread
public class mthread 
{
    public static void main(String[] args)
    {
        //calling the name of the main thread 
        callingMainThread();
       
        //creating different thread objects for the same class
        MultithreadingDemo thread3= new MultithreadingDemo("Thread3");
        MultithreadingDemo thread1= new MultithreadingDemo("Thread1");
        MultithreadingDemo thread2= new MultithreadingDemo("Thread2");

        


        thread1.setPriority(7);
       

       try {
            // thread to sleep for 1000 milliseconds
            thread2.sleep(2000);
         } catch (Exception e) {
            System.out.println(e);
         }

        thread3.start();
        thread1.start();
        thread2.start(); 
        
    }

    //static function to show the name of the main thread
    static void callingMainThread()
    {
        System.out.println("Main thread started: VIT-AP Thread");
    }
}