package com.example;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringFetch sf = new StringFetch(new Scanner(System.in), "Enter text", "stop");
        ArrayList<String> all_reads = sf.fetchLoop();

        TurdFuzz tf = new TurdFuzz(all_reads);

        System.out.println("You entered " + tf.sumChars() + " amount of characters.");

        System.out.println("You entered " + tf.sumWords() + " amount of words.");

        System.out.println("You entered " + tf.longestWord() + " as longest word.");
    }
}
