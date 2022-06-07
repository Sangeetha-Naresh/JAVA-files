 class truthtable
 {

     public static void main(String []args)
     {
         // iterating from i=0 and checking if i is not equal to 8 
        for (int i = 0 ; i <8 ; i++) 
        {
           // the built in function returns the binary equivalent of integer value i
            String s = Integer.toBinaryString(i);

            //check if the length of string does not exceed 
            for(;s.length() != 3;)
            {
                //concatenate the character '0' as a prefix for the values 0, 1, 2, 3
                //since they would otherwise print it as 0, 1, 10, 11
                s = '0'+s;
            }

            //print the final binary truth table
            System.out.println(s);
        }
     }
}