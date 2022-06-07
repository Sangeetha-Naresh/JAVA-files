//importing the util package to use Scanner class for reading input
import java.util.*;

//importing the util package to use Scanner class for reading input
import java.util.*;

class Student
{
    String regno, name;

    //creating the scanner object
    Scanner s= new Scanner(System.in);

    Student(){}

    Student(String rno,String n)
    {
        regno=rno;
        name=n;
    }

    String getName()
    {
        return name;
    }
}

class Course
{
    String code, name;
    //creating an array list of books taken by reader
    ArrayList<Student> studentlist =new ArrayList<Student>();


   Course(){}

   Course(String c, String n)
   {
       code=c;
       name=n;

   }

    

    void addStudent(Student s)
    {
       studentlist.add(s);
    }

    int numberOfStudents()
    {
        return (studentlist.size());
    }

    Student getStudentAt(int i)
    {
        return studentlist.get(i);
    }

}
class Students
 {

     public static void main(String []args)
     {
        Student aStudent = new Student(); 
        //It will create object astudent of Student class by passing no arguements
        //therefore the name and regno for the astudent will  not be assigned
        //astudent will be an empty student objcet

        Student anotherStudent = new Student("123","Mary donald");
        // creates a student object "anotherStudent" by passing values 
        // to the parameterized constructor of the student class
        // "123" to the regno
        // "Mary Donald" to the name

        Student LastStudent = new Student("h213","Danielle Smith");
        // creates a student object "LastStudent" by passing values 
        // to the parameterized constructor of the student class
        // "h213" to the regno
        // "Danielle Smith" to the name

        aStudent.getName();
        // returns the name of the student
        //since no name is initialized it simply returns a null
      

        Course OODP= new Course("OODP","Object Oriented Programming and Design");
        // creates a Course object "OODP" by passing values 
        // to the parameterized constructor of the Course class
        // "OODP" to the code
        // "Object Oriented Programming and Design" to the name

        OODP.addStudent(aStudent);
        //simply adds astudent object to the studentlist of OODP object

        OODP.addStudent(anotherStudent);
         //simply adds anotherStudent object to the studentlist of OODP object

        OODP.addStudent(LastStudent);
        //simply adds LastStudent object to the studentlist of OODP object

        OODP.numberOfStudents();
        // simply returns the number of students in studentlist of OODP object

        OODP.getStudentAt(2);
        //simply returns the student object from the second index of the studentlist
        //it returns the object LastStudent

        OODP.getStudentAt(2).getName();
       // simply returns the name of the student at index 2 in the studentlist
       // the name returned is "Danielle Smith"

        OODP.getStudentAt(2).getName().charAt(0);
        // returns the character at the 0th position of the name of the student at index 2
        // returns 'D'
     }

 }