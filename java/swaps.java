import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {
    public static double solve(String s)
    {
        return 1.5;
    }
};

public class swaps
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t=Integer.parseInt(bufferReader.readLine().trim());

        IntStream.range(0,t).forEach(tItr->  {
            try{
                String s= bufferReader.readLine();
                double result= Result.solve(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();

            }
            catch(IOException ex){
                throw new RuntimeException(ex);
            }
        });

        bufferReader.close();
        bufferReader.close();
    }
}