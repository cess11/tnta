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

        int charsum = tf.sumChars();

        System.out.println("You entered " + charsum + " amount of characters.");

        int wordsum = tf.sumWords();

        System.out.println("You entered " + wordsum + " amount of words.");

        String longest = tf.longestWord();

        System.out.println("You entered " + longest + " amount of words.");
    }
}
