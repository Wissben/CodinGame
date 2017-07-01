import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
 
class unit {
    public int x,y;
    public int level;
    public Grid playground;
    
    public unit (int x , int y,Grid g)
    {
        this.x = x;
        this.y = y;
        this.level = 0;
        this.plavoid=g;
    }
    
    public String move_build(String move , String build)
    {
        String act = move+" "+build;
        if(move == "N" || build =="N" )
        {
            x++;
            if(this.outOfBound())
                this.regulate();
            this.playground[
        }
        if(move == "
        
    }
    
    public void regulate()
    {
        if(this.x>playground.width)
            this.x=width;
        if(this.x<0)
            this.x=0;
        if(this.y > playground.height)
            this.y)playground.height;
        if(y<0)
            y=0;
    }
    
    public boolean outOfBound()
    {
        return this.x>this.playground.width     ||
               this.x<0                         ||
               this.y>this.playground.height    ||
               this.y<0;
    }
    
}
 
 
class Grid{
    int width , height ;
    int maxLevel; 
    String[] mat;
    public Grid(String[] mat)
    {
        if(mat != null)
        {
            this.width=mat[0].length();
            this.height=mat.size;
            this.mat= mat.clone();
        }
        
    }
}
 
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int unitsPerPlayer = in.nextInt();

        // game loop
        while (true) {
            for (int i = 0; i < size; i++) {
                String row = in.next();
            }
            for (int i = 0; i < unitsPerPlayer; i++) {
                int unitX = in.nextInt();
                int unitY = in.nextInt();
            }
            for (int i = 0; i < unitsPerPlayer; i++) {
                int otherX = in.nextInt();
                int otherY = in.nextInt();
            }
            int legalActions = in.nextInt();
            for (int i = 0; i < legalActions; i++) {
                String atype = in.next();
                int index = in.nextInt();
                String dir1 = in.next();
                String dir2 = in.next();
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println("MOVE&BUILD 0 N S");
        }
    }
}
