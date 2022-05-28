import java.util.*;
//creating the reader class
class Reader
{
    //creating the attributes for class Reader
    String name, surname;
    int age,ph_no;

    //creating an array list of books taken by reader
    ArrayList<String> hasBooks =new ArrayList<String>();

    //defining a constructor that initializes all values
    Reader(String na, String sur,int a,int no)
    {
        name=na;
        surname=sur;
        age=a;
        ph_no=no;
    }

    //defining the addBooks method
    void addBooks(String b)
    {
        //adding a string value to the books list
        hasBooks.add(b);
        
      
    }

    //printing the user details
    void printUser()
    {
        System.out.println("Name: "+name);
        System.out.println("SurName: "+surname);
        System.out.println("age: "+age);
        System.out.println("Phone number: "+ph_no);
       
    }

   //printing the books the reader has taken
    void printUserBooks()
    {
         System.out.println("Books taken by the reader are: "+hasBooks);
        System.out.println("--------------------------------------------------------");
    }

}

//creating the Book class
class Book
{
    
    //creating the attributes for class Book
    String name, author,publisher;
    int year;

    //defining a constructor that initializes all values 
    Book(String na,String au, String pub, int y)
    {
        name=na;
        author=au;
        publisher=pub;
        year=y;
    }

    //printing book details
    void printBook(String n)
    {
        System.out.println("Name of the Book: "+n);
        System.out.println("Author: "+author);
        System.out.println("Publisher: "+publisher);
        System.out.println("Publishment Year: "+year);
        System.out.println("--------------------------------------------------------");
    }

    //static method that prints the statement 
    static void printAllbooks()
    {
        System.out.println("All the books in library are: ");
    }
}

//creating the main class
class library
{
       public static void main(String args[])
    {
        //creating reader objects
        Reader r1= new Reader("John","A",34,56789878);
        Reader r2= new Reader("Sam","R",67,34783478);
        Reader r3= new Reader("Alice","W",44,67789878);

        //creating book objects
        Book b1=new Book("Pride and Prejudice","Jane Austen","Thomas Egerton",1813);
        Book b2=new Book("The Red and the Black","Stendhal","Bourbon Restoration ", 1814);
        Book b3=new Book("David Copperfield","Charles Dickens","Bradbury & Evans",1850 );
        Book b4=new Book("Wuthering Heights","Emily Bronte","Simon & Schuster",1847 );

        //creating book array
        Book b[]= new Book[4];

        //assigning the book objects to the array
        b[0]=b1;
        b[1]=b2;
        b[2]=b3;
        b[3]=b4;

        String name;

        //method for taking the user input
        Scanner s= new Scanner(System.in);

        //calling the add books function for reader 1
        r1.addBooks("Pride and Prejudice");
        r1.addBooks("The Red and the Black");

        
        //calling the add books function for reader 2
        r2.addBooks("David Copperfield");

        
        //calling the add books function for reader 3
        r3.addBooks("Wuthering Heights");

       //printing the reader1 details and books taken
        r1.printUser();
        r1.printUserBooks();

        //printing the reader2 details and books taken
        r2.printUser();
        r2.printUserBooks();

        //printing the reader3 details and books taken
        r3.printUser();
        r3.printUserBooks();

        System.out.println("--------------------------------------------------------");

        System.out.println("enter the name of the book you are searching for :");
        //taking the user input for the name of book
        name=s.nextLine();

        //iterating through the books array
        for(int i=0;i<b.length;i++)
        { 
           //checking if name entered matches the name in book array
            if(name.equals(b[i].name))
            {
                //calling the function to print the specific book details
                  b[i].printBook(name);
            }
            
          
        }

        System.out.println("--------------------------------------------------------");
        //calling the function to print the names of all books;
        Book.printAllbooks();
        for(int i=0;i<b.length;i++)
        { 
           System.out.println( b[i].name);
      
        }

        
    }
}