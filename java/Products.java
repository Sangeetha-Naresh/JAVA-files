import java.util.*;//import util package
import java.lang.*;//import lang package


import java.io.FileOutputStream;
import java.util.Formatter;


//creating the main class
class Products
{
    String product_code;
    
    //method for taking the user input
    Scanner s= new Scanner(System.in);

    //method to read the product info fro user input
    String readProductInfo()
    {
        System.out.println("Enter the product code");
        product_code=s.next();
        return product_code;
    }

    //extract info method that extracts the country, code and serial and writes to a file
    void extractInfo(String str) throws Exception
    {
        //creating empty strings
        String country="";
        String code="";
        String  serial="";

        String temp;

        //initilaizing flag and pos as zero
        int pos=0;
        int flag=0;

        //iterating through the string
        for(int i=0;i<str.length();i++)
        {
            //checking if the character is a -
            if(str.charAt(i)=='-'&&flag==0)
            {
                //if true setting the position to pos and making flag true
                 pos=i;
                 flag=1;
            }
            
            //extracting the country from 0th postion to the first occurence of -
            country=str.substring(0,str.indexOf("-"));

            //extracting the code from pos+1 th postion to the last occurence of -
            code=str.substring(pos+1,str.lastIndexOf("-"));

             //extracting the serial from the last occurence of - to theend of string
            serial=str.substring(str.lastIndexOf("-")+1,str.length());
        }

        //printing the extacted strings
        System.out.println("Country: "+country);
        System.out.println("Code: "+code);
        System.out.println("Serial: "+serial);


        //writing into a file using java.util.Formatter


        Formatter fmtCon = new Formatter(System.out);
        Formatter fmtFile;
        fmtFile = new Formatter(new FileOutputStream("info.txt"));

        fmtFile.format("Country: "+country+", Code: "+code+", Serial: "+serial);
        fmtFile.close();

        if (fmtFile.ioException() != null) 
        {
            System.out.println("File I/O Error Occurred");
        }
    }


    public static void main(String args[])
    {
        //creating the product object
        Product p= new Product();

        //creating a string object
        String pc;

        //calling the readProductInfo method and returning the string to pc
        pc=p.readProductInfo();

       //calling the extractinfo method by passing pc
        p.extractInfo(pc);

    }
}