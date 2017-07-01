import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static String toChuck(String s)
    {
        String res ="";
        String ones="";
        String zeros="";
        int count=0;
        System.err.println("s/"+s);
        for (int i = 0 ; i < s.length() ;i++ )
        {
            System.err.println("char "+s.charAt(0));
            if(s.charAt(i) == '1')
            {
                ones ="0 ";
                count = i;
               // System.err.println("count avant/"+count);
                
                while(count < s.length() && s.charAt(count)=='1')
                {
                    ones+="0";
                    count++;
                }
                
                if(count>s.length())
                {
                    //System.err.println("Message");
                     break;
                }
                   
                else
                {
                     res+=ones+" ";
                     count--;
                }
                    
            }
            if(s.charAt(i) == '0')
            {
                zeros="00 ";
                count = i;
                //System.err.println("count2 avant /"+count);
                while(count < s.length() && s.charAt(count)=='0')
                {
                    System.err.println("here");
                    zeros+="0";
                    count++;
                }
                if(count>s.length())
                {
                   // System.err.println("Message2");
                     break;
                }
                 else
                {
                     res+=zeros+" ";
                     count--;
                }
            }
           i=count;
        }
        System.err.println("a la fin "+res);
        return (res.substring(0,res.length()-1));
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        System.err.println("% "+String.format("%8s", Integer.toBinaryString('%')).replace(" ", "0"));
        char[]chars=MESSAGE.toCharArray();
        String s = "";
        for (int i = 0 ;i< chars.length ; i++)
        {
            String temp = String.format("%16s", Integer.toBinaryString(chars[i])).replace(" ", "0");
            temp=temp.substring(temp.length()/2+1,temp.length());
            s+=temp;
        }
        // rite an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(toChuck(s));
    }
}
