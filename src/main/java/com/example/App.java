package com.example;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    private static int sumChars(ArrayList<String> al)
    {
        return al.stream().mapToInt(line -> line.length()).sum();
    }

    private static int sumWords(ArrayList<String> al)
    {
        return al.stream().mapToInt(line -> (line.split(" ")).length).sum();

    }
    public static void main( String[] args )
    {
        StringFetch sf = new StringFetch(new Scanner(System.in), "Enter text", "stop");

        ArrayList<String> all_reads = sf.fetchLoop();

        int charsum = sumChars(all_reads);

        System.out.println("You entered " + charsum + " amount of characters.");

        int wordsum = sumWords(all_reads);

        System.out.println("You entered " + wordsum + " amount of words.");
    }
}
