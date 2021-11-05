package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TurdFuzzTest 
{
    private ArrayList<String> al;
    private TurdFuzz tfwithstrings;
    private TurdFuzz tfwithempty;
    private String longest;

    public TurdFuzzTest()
    {
        longest = "longestlongwordfromhell";
        al = new ArrayList<>();

        al.add("megastringe");
        al.add("megastringe plus more");
        al.add("megastringe wit " + longest);

        tfwithstrings = new TurdFuzz(al);
        tfwithempty = new TurdFuzz(new ArrayList<String>());
    }

    @Test
    public void testSumChars()
    {
        assertEquals(71, tfwithstrings.sumChars());
    }
    
    @Test
    public void testSumWords()
    {
        assertEquals(7, tfwithstrings.sumWords());
    }

    @Test
    public void testLongestWord()
    {
        assertEquals(longest, tfwithstrings.longestWord());
    }
    
    @Test
    public void testSumCharsWithEmpty()
    {
        assertEquals(0, tfwithempty.sumChars());
    }
    
    @Test
    public void testSumWordsWithEmpty()
    {
        assertEquals(0, tfwithempty.sumWords());
    }

    @Test
    public void testLongestWordWithEmpty()
    {
        assertEquals("", tfwithempty.longestWord());
    }
}
