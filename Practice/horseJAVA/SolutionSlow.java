import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class SolutionSlow {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> pis = new ArrayList<Integer>();
        int minDist=0;
        int N = in.nextInt();
        for (int i = 0; i < N; i++)
        {
            int pi = in.nextInt();
            //System.err.println(pi);
            if(pis.size() == 0)
                {
                    pis.add(pi);
                    minDist=0;
                }
            else
            {
                pis.add(pi);
                minDist=Math.abs(pi-pis.get(0));
                for (int j = 0 ; j < pis.size() ; j ++)
                    {
                        if(pis.get(j)!=pi)
                            if(Math.abs(pi-pis.get(j))<minDist)
                                minDist=Math.abs(pi-pis.get(j));
                    }
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(minDist);
    }
}
