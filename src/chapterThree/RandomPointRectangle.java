package chapterThree;

/**
 *
 * @author kalfo
 * 
 * Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0,0) with width 100 and height 200. 
 */
public class RandomPointRectangle {
    public static void main(String[] args){
        
        // Record Rectangle width and height
        int rectangleWidth = 100;
        int rectangleHeight = 200;
       
        
        // generate first coordanate
        int x = (int)(Math.random() * 100);
        int y = (int)(Math.random() * 1000 % 100);
        System.out.println(x + " " + y);
        
        // check to see if coordanate is within the rectangle 
        
        if (x > rectangleWidth || y > rectangleHeight )
            System.out.println("That point exists outside the bound of the rectangle.");
        else 
            System.out.print("That point exists inside the rectangle!");
        
        
        
        
    }
    
}
