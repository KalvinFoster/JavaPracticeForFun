package chapterThree;
import java.lang.Math;
public class WhatToWorkOn {
    public static void main(String[] args) {
        
        
        // Write a program to deicide what to work on for fun
        
        int answer = (int)(Math.random() * 10 );
        
        switch(answer){
        
            case 0: System.out.println("Read for 15 min."); break;
            case 1: System.out.println("Clean for 15 min."); break;
            case 2: System.out.println("Write a program."); break;
            case 3: System.out.println("Study for 30 more min."); break;
            case 4: System.out.println("Complete one quest on WOW."); break;
            case 5: System.out.println("Walk around the block."); break;
            case 6: System.out.println("Watch a video on my next class."); break;
            case 7: System.out.println("Plank with bridget"); break;
            case 8: System.out.println("bridget does 10 squats"); break;
            case 9: System.out.println("play guitar"); break;
        }
        
        
    }
    
}
