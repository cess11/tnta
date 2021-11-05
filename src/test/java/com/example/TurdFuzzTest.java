package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TurdFuzzTest 
{
    private ArrayList<String> al;
    private TurdFuzz tf;
    private String longest;

    public TurdFuzzTest()
    {
        longest = "longestlongwordfromhell";
        al = new ArrayList<>();

        al.add("megastringe");
        al.add("megastringe plus more");
        al.add("megastringe wit " + longest);

        tf = new TurdFuzz(al);
    }

    @Test
    public void testSumChars()
    {
        assertEquals(71, tf.sumChars());
    }
    
    @Test
    public void testSumWords()
    {
        assertEquals(7, tf.sumWords());
    }

    @Test
    public void testLongestWord()
    {
        assertEquals(longest, tf.longestWord());
    }
}
