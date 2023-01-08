package com.vanier.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ScoreManagerTest {


    @Test
    public void failingScoreWithEquals()
    {
        String passed = ScoreManager.passingScore(3);        
        assertEquals("False." ,passed);
    }

    @Test
    public void passingScoreWith6()
    {
        String passed = ScoreManager.passingScore(6);        
        assertEquals("True." ,passed);
    }

    @Test
    public void passingScoreWith10()
    {
        String passed = ScoreManager.passingScore(10);        
        assertEquals("True." ,passed);
    }

}