//creating the class Point

class Point
{
    //declaring variables
    int x,y;

    //declaring default constructor
    Point(){}

    //declaring constructor with two integer parameters
    Point(int xval, int yval)
    {
        x=xval;
        y=yval;
    }

   //declaring constructor with Point object as parameter
    Point(Point p)
    {
        x=p.x;
        y=p.y;
    }

    //defining the setter and getter methods for x and y values
    void setX(int xval)
    {
        x=xval;
    }
    
    void setY(int yval)
    {
        y=yval;
    }

    int getX()
    {
        return x;
    }
     
    int getY()
    {
        return y;
    }

   //overriding the toString method to display the values of x and y in string format
   public String toString()
    {
         String s,s1,s2;

         //converting the integer values to string
        s1=String.valueOf(x);
        s2=String.valueOf(y);

        s="x-axis is : "+s1+" and the y axis is : "+s2;
        return s;
    }
}

//creating the Line class
class Line
{
    //creating objects of type Point
    Point begin = new Point();
    Point end = new Point();

    //declaring default constructor
    Line(){}
    
    //declaring constructor with two point objects as  parameters
    Line(Point b, Point e)
    {
        begin=b;
        end=e;
    }

     //defining the setter and getter methods for point1 and point2 values
    void setBegin(Point p)
    {
        begin=p;
    }

    void setEnd(Point p)
    {
        end=p;
    }

    Point getBegin()
    {
        return begin;
    }

    Point getEnd()
    {
        return end;
    }


    //overriding the toString method to display the values of begin point and end point in string format
    //Also displaying the result of calculateLength() and calculateSlope() in string format
    public String toString()
    {
         String s,s1,s2,s3,s4,s5,s6;

         //converting the integer values to string
        s1=String.valueOf(begin.x);
        s2=String.valueOf(begin.y);

        s3=String.valueOf(end.x);
        s4=String.valueOf(end.y);

        
        s5=String.format("%.2f", calculateLength());

        s6=String.valueOf(calculateSlope());

        s="BEGIN POINT is : "+s1+" and "+s2 + " END POINT IS : "+s3+" and "+s4+" LENGTH : "+s5+" SLOPE: "+s6;
        return s;
    }

    double calculateLength()
    {
        double length;

        double x1, x2, y1, y2;

        x1=begin.x;
        y1=begin.y;

        x2=end.x;
        y2=end.y;

        //calculating the length of the line using the distance formula
        length=Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

        return length;

    }

    double calculateSlope()
    {
        double slope;

        double x1, x2, y1, y2;

        x1=begin.x;
        y1=begin.y;

        x2=end.x;
        y2=end.y;


       //calculating the slope using slope formula
        slope=(y2 - y1) / (x2 - x1) ;

        return slope;

    }

    String calculateLineEquation()
    {
        //calculating the equation of line using the line equation formula
        int a = end.y - begin.y;
        int b = begin.x - end.x;
        int c = a * (begin.x) + b * (begin.y);

        String s;
 
        //returning the result in y=mx+c format
        if (b < 0) 
        {
            s="The line passing through points  is: "+ a + "x + " + b + "y = " + c;
        }
        else 
        {
            s="The line passing through points P and Q is: "
                + a + "x + " + b + "y = " + c;
        }

        return s;
    }

}
class PointLine
{
    public static void main(String args[])
    {
        //creating two point objects
        Point p1=new Point(0,1);
        Point p2=new Point(2,4);

      
        //displaying the points
        System.out.println("POINT 1 is : "+p1.toString());
        System.out.println("POINT 2 is : "+p2.toString());

        //creating a line using the previous points p1 and p2
        Line l1=new Line(p1,p2);

        System.out.println("THE LINE is : ");

        //displaying the line information methods
        System.out.println(l1.toString());

       // displaying the equation of line by calling the method
        System.out.println(l1.calculateLineEquation());
    }
}