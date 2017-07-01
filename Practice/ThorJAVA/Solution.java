import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int dx = lightX-initialTX;
        int dy = lightY-initialTY;
        System.err.println(initialTX+";"+initialTY+"-->"+lightX+";"+lightY
                           +"       "+dx+"/"+dy);
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            if (dx > 0 && dy == 0)
            {
                System.out.println("E");
                dx--;
            }
            if (dx < 0 && dy == 0)
            {
                System.out.println("W");
                dx++;
            }
            if (dx ==0 && dy < 0)
            {
                System.out.println("N");
                dy ++ ;
            }
            if (dx == 0 && dy > 0)
            {
                System.out.println("S");
                dy --;
            }
            if (dx < 0 && dy < 0)
            {
                System.out.println("NW");
                dx ++;
                dy ++;
            }
            if (dx > 0 && dy < 0)
            {
                System.out.println("NE");
                dx --;
                dy ++;
            }
            if (dx < 0 && dy > 0)
            {
                System.out.println("SW");
                dx ++;
                dy--;
            }
            if (dx >0 && dy >0)
            {
                System.out.println("SE");
                dx --;
                dy --;
            }
            
            System.err.println(dx+";"+dy);
            // To debug: System.err.println("Debug messages...");
            if(dx==0 && dy == 0)
                break;
            // A single line providing the move to be made: N NE E SE S SW W or NW
            }
    }
}
