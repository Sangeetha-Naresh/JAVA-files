//This sequentially execution of thread can be handled beautifully
// using Thread.join() method. 
//To handle it properly, you may have to create MyRunnable which implements Runnable interface. 
//Inside MyRunnable, you can inject a parent Thread, and call parent.join() at top of 
//MyRunnable.run() method.

public class SequentialThreadTest 
{

    static class MyRunnable implements Runnable 
    {
        static int objCount; // to keep count of sequential object

        private int objNum;
        private Thread parent; // keep track of parent thread
        
        MyRunnable(Thread parent) 
        {
            this.parent = parent;
            this.objNum = objCount + 1;
            objCount += 1;
        }

        //Override run method
        public void run() 
        {
            try 
            {
                if(parent != null) 
                {
                    //join(): It will put the current thread on wait until the thread on which it is called is dead. 
                    //If thread is interrupted then it will throw InterruptedException.
                    parent.join();
                }
                System.out.println("Thread-" + objNum + ": " + objNum+" is running");

            } 
            catch(InterruptedException e)
            {
                e.printStackTrace();
            } 
            finally 
            
            {
                // do what you need to do when thread execution is finished
                 System.out.println("Thread-" + objNum + ": " + " has finished execution");
            }
        }
    }

    public static void main(String[] args) 
    {
        int n = 3;
        
        Thread parentThread = null;

        for(int i=0; i<n; i++) 
        {
            Thread thread = new Thread(new MyRunnable(parentThread));
            thread.start();
            if(i==2)
            {
                try 
                {
                    // thread to sleep for 2000 milliseconds
                    thread.sleep(2000);
                } 
                catch (Exception e) 
                {
                    System.out.println(e);
         
                }
            }

            parentThread = thread;
        }
    }
}
