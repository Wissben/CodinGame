import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {



    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        String[] arts = new String[H];
        Arrays.fill(arts,"");
        String[] artN=new String[H];
        Arrays.fill(artN,"");
        char[] chars = T.toCharArray();
        for (int i = 0 ; i < chars.length ; i++ )
        {
            chars[i]=Character.toUpperCase(chars[i]);
        }

            for (int i = 0; i < H; i++)
            {
                String ROW = in.nextLine();
                System.err.println(ROW);
                arts[i]=ROW;
            }

        for (int i = 0;i < chars.length ; i++)
        {
            char c = chars[i];
            if(c < 'A' || c > 'Z')
            {
                for (int j = 0 ;j < artN.length ;j++ )
                {
                  artN[j]+=arts[j].substring(arts[j].length()-L,arts[j].length());

                }
            }
            else
            {
                int cIndex=c-65;
                for (int j = 0 ;j < arts.length ;j++ )
                {
                  artN[j]+=arts[j].substring(L*cIndex,L*cIndex+L);

                }
            }
        }
        String artFinal="";
        for (int i = 0;i < H ;i++ )
        {
            artFinal+=artN[i]+"\n";
        }

        //System.err.println(art);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(artFinal);
    }
}
