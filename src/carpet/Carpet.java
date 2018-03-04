/*
 * Nicole Tao
 * Carpet.java
 * This program calculates the cost to carpet a room
 * March 2nd, 2018
 */
package carpet;

/**
 *
 * @author Nicole
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 8.5;
        double width = 6.0;
        //This will calculate the area of the room
        double area = length*width;
        double cost = 19.95;
        //This will calculate the cost to carpet the room
        double totalCost = area*cost;
        //This SOP states the cost to carpet a room in sentence form
        System.out.println("The cost to carpet the room is " + totalCost);
    }
    
}
