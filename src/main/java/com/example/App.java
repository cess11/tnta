package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Optional;


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
    private static String longestWord(ArrayList<String> al)
    {
        ArrayList<String> words = new ArrayList<String>();

        for (String s: al) {
            words.addAll(Arrays.asList(s.split(" ")));
        }
        
        return words
            .stream()
            .reduce(
                (longest, next) -> {
                    if (longest.length() > next.length()) 
                        return longest; 
                    else 
                        return next;
                })
            .orElse("");

    }
    public static void main( String[] args )
    {
        StringFetch sf = new StringFetch(new Scanner(System.in), "Enter text", "stop");

        ArrayList<String> all_reads = sf.fetchLoop();

        int charsum = sumChars(all_reads);

        System.out.println("You entered " + charsum + " amount of characters.");

        int wordsum = sumWords(all_reads);

        System.out.println("You entered " + wordsum + " amount of words.");

        String longest = longestWord(all_reads);

        System.out.println("You entered " + longest + " amount of words.");
    }
}
