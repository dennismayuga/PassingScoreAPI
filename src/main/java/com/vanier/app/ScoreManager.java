package com.vanier.app;

public class ScoreManager {
    public static String execute(String[] args) throws Exception{
        int score = 0;
        boolean isNumber = true;

        //integer-only input
        try{
            score = Integer.valueOf(args[0]);
        } catch(Exception NumberFormatException){
            System.out.println("Not an integer.");
            System.out.println("Log.: " + NumberFormatException.getMessage());
            isNumber = false;
        }
        
        if(isNumber)
            return passingScore(score);
        else
            return "Error.";
    }

    //create a method that receives the score and returns true/false if it is equal or greater than 6
    public static String passingScore(int score){
        if(score >= 6){
            return String.format("True.");
        }else{
            return String.format("False.");
        }
    }  
}
