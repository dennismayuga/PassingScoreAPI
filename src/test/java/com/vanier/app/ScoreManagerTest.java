package com.vanier.app;

import org.junit.Assert;
import org.junit.Test;

public class ScoreManagerTest {
    @Test
    public void testPassingScore3(){
    String result = ScoreManager.passingScore(3);
    Assert.assertEquals("False.", result);
    }
    @Test
    public void testPassingScore8(){
    String result = ScoreManager.passingScore(8);
    Assert.assertEquals("True.", result);
    }
    @Test
    public void testMainException()throws Exception{
        String[] args = new String[] {"a"};
        ScoreManager.execute(args);
    }
}
