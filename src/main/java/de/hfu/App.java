package de.hfu;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Eingabe:");
		String eingabe = br.readLine();
		eingabe = eingabe.toUpperCase();
		System.out.println("Eingabe in Grossbuchstaben: " + eingabe);
    }
}
