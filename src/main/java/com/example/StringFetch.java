package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class StringFetch {
    private String message;
    private String stopword;
    private Scanner scanner;

    public StringFetch(Scanner scan, String msg, String stop)
    {
        scanner = scan;
        stopword = stop;
        message = msg + " or \"" + stopword + "\" to stop.";
    }

    private String fetch(String msg)
    {
        System.out.println(msg);

        return scanner.nextLine();
    }

    public ArrayList<String> fetchLoop()
    {
        String last_read = "";
        ArrayList<String> all_reads = new ArrayList<String>();

        while (true) {
            last_read = fetch(message);
            if (last_read.equals(stopword)) {
                break;
            }

            if (last_read.contains(stopword)) {
                all_reads.add(last_read.split(stopword)[0]);
                break;
            }

            all_reads.add(last_read);
        }

        return all_reads;
    }
    
}
