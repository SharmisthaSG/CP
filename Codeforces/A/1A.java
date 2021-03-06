import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class q1
{
    public static void main(String[] args)
    throws IOException
    {
        Reader.init(System.in);
        int m = Reader.nextInt();
        int n = Reader.nextInt();
        int a = Reader.nextInt();
        System.out.println(Math.ceil(m/a));
        System.out.println(Math.round( Math.ceil(m/a) * Math.ceil(n/a) ));
    }
}

class Reader 
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) 
    {
        reader = new BufferedReader(new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException 
    {
        while ( ! tokenizer.hasMoreTokens() ) 
        {
            tokenizer = new StringTokenizer(reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException 
    {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException 
    {
        return Double.parseDouble( next() );
    }
}

