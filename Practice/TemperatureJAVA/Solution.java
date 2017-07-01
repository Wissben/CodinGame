import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static ArrayList<Integer> getNeg(int[] a )
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i : a  )
        {
            if(i < 0)
             al.add(i);
        }


        return al;

    }
    public static ArrayList<Integer> getPos(int[] a )
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i : a  )
        {
            if(i > 0)
             al.add(i);
        }

        return al;
    }

    public static int getClosestToZeroBySign(ArrayList<Integer> al,boolean s)
    {
      if(s)
      {
        int min = al.get(0);
        for (int a : al)
        {
          if (a < min)
            min = a;
        }
        return min;
      }
      else
      {
        int min = al.get(0);
        for (int a : al)
        {
          if(a > min)
            min = a;
        }
        return min;
      }
    }

    public static int compare(int neg,int pos)
    {
      if(neg==pos)
        return pos;
      else
      {
        return Math.min(Math.abs(neg),Math.abs(pos));
      }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        String[] tempsArray= temps.split("\\s");
        if(n==0)
        {
            System.out.println(0);
        }
        else
        {
          int[]tempsInt = new int[n];
          for (int i = 0 ; i < tempsArray.length; i++)
          {
              tempsInt[i] = Integer.valueOf(tempsArray[i]);
          }
          ArrayList<Integer> neg = getNeg(tempsInt), pos = getPos(tempsInt);
          if(pos.size()==0)
            System.out.println(getClosestToZeroBySign(neg,false));
          if(neg.size()==0)
            System.out.println(getClosestToZeroBySign(pos,true));
          if(neg.size()>0 && pos.size()>0)
          {
            int minNeg=getClosestToZeroBySign(neg,false);
            int minPos=getClosestToZeroBySign(pos,true);
            int minAbs=compare(minNeg,minPos);
            System.out.println(minAbs);
          }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        }

    }
