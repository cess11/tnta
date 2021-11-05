package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class TurdFuzz {
    private ArrayList<String> al;

    public TurdFuzz(ArrayList<String> arrayList)
    {
        al = arrayList;
    }

    public int sumChars()
    {
        return al.stream().mapToInt(line -> line.length()).sum();
    }

    public int sumWords()
    {
        return al.stream().mapToInt(line -> (line.split(" ")).length).sum();

    }

    public String longestWord()
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
}
