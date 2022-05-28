import java.util.*;

//creating the calender class
class CalenderItem
{
    //declaring the month and day attributes
    int month;
    int day;

    //defining the constructor
    CalenderItem(int m, int d)
    {
        month=m;
        day=d;
    }

    //defining the move method
    void move(int d ,int m)
    {
        //updating the day and month values
        day=d;
        month=m;
    }

    //overriding the toString method of the String class
    public String toString()
    {
        String s,s1,s2;
        //converting the integer values to string
        s1=String.valueOf(day);
        s2=String.valueOf(month);

        //concatenating the day and month using the / character
        s=s1+"/"+s2;

        //returning the final string
        return s;
    }
}

//creating a class Meeting that extends CalenderItem
class Meeting extends CalenderItem
{
    String time;

    //Creating arraylist for participants
    ArrayList<String> participants=new ArrayList<String>();

    //defining the constructor
    Meeting(int d, int m , String t)
    {
        //calling the constructor of super class
        super(m,d);
        //assigning value of t to time
        time=t;
    }

    //defining the addParticipant method
    void addParticipant(String p)
    {
        //adding a string value to the participants list
        participants.add(p);
    }

    //defining the move method to upadte the values
    void move(int d , int m, String t)
    {
        day=d;
        month=m;
        time=t;
    }
}

//creating a class Birthday that extends CalenderItem
class Birthday extends CalenderItem
{
    //declaring attributes
    String name;

    int birthyear;

    //defining the constructor Birthday
    Birthday( String n,int d, int m)
    {
        //calling the super class constructor
        super(m,d);
        //assigning the value n to name
        name=n;
    }
   
   // overriding the toString method of the String class
   public String toString()
    {
        String s,s1,s2;
         //converting the integer values to string
        s1=String.valueOf(day);
        s2=String.valueOf(month);

        //concatenating the day and month using the / character and also including the name
        s=name+"'s birthday is on "+s1+"/"+s2;

        //returning the final string
        return s;
    }
}

//main class

class DateTime
{
    public static void main(String args[])
    {
        //Creating objects of meeting class and birthday class
        Meeting m= new Meeting(24,5,"14:30");
        Birthday b= new Birthday("John",8,7);

        //displaying the meeting date and time
        System.out.println("meeting day is on : "+m.day+" and meeting time is at: "+m.time);

        //adding the partipants to the meeting
        m.addParticipant("Sam");
        m.addParticipant("John");

        //displaying the participants
        System.out.println("Participants of the meeting are: "+m.participants);

        //displaying John's birthday
        System.out.println(b.toString());
    }
}