import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

class Defibrilator{
    int id=0;
    String name;
    String add;
    String phone;
    double longitude,latitude;

    Defibrilator(int id ,String name, String add, String phone, double longitude , double latitude)
    {
        this.id=id;
        this.name=name;
        this.add=add;
        this.phone=phone;
        this.longitude=longitude;
        this.latitude=latitude;
    }
    Defibrilator(String[] desc)
    {
        if(!desc[0].isEmpty())
            id=Integer.parseInt(desc[0]);
        if(!desc[1].isEmpty())
            this.name=desc[1];
        if(!desc[2].isEmpty())
            this.add=desc[2];
        if(!desc[3].isEmpty())
            this.phone=desc[3];
        if(!desc[4].isEmpty())
            this.longitude=Solution.commaToPointDouble(desc[4]);
        if(!desc[5].isEmpty())
            this.latitude=Solution.commaToPointDouble(desc[5]);
    }


}
class Solution {


    public static double commaToPointDouble(String s)
    {
        String[] decimal;
        decimal = s.split(",");
        double s_double = Double.parseDouble(decimal[0]+"."+decimal[1]);
        return s_double;
    }

    public static double degToRad(double deg)
    {
        return (deg*(double)Math.PI/180);
    }


    public static double getDistByRadians(double longitudeA , double longitudeB , double latitudeA , double latitudeB)
    {
        //the parameters must be in Radians so a conversion is needed
        double x = (longitudeB - longitudeA) * (double) Math.cos((double)(latitudeA+latitudeB)/2);
        double y = latitudeB - latitudeA;
        double x2 = (double)Math.pow(x,2);
        double y2 = (double)Math.pow(y,2);
        double d = (double)Math.sqrt(x2+y2)*6731;
        return d;
    }
    //radians = degrees × π / 180°
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }

        ArrayList<Defibrilator> defibs = new ArrayList<Defibrilator>();

        double LON_double = commaToPointDouble(LON);
        double LAT_double = commaToPointDouble(LAT);

        System.err.println(LON_double+";"+LAT_double);
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            String[] desc = DEFIB.split(";");
            defibs.add(new Defibrilator(desc));
        }

        double minimDist=getDistByRadians(LON_double,defibs.get(0).longitude,
                                       LAT_double,defibs.get(0).latitude);
        int index=0;
        for (int i = 0 ;i< defibs.size() ;i++ )
        {
            double dist_i = getDistByRadians(LON_double,defibs.get(i).longitude,
                                            LAT_double,defibs.get(i).latitude);
            if(dist_i < minimDist )
            {
                index=i;
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(defibs.get(index).name);
    }
}
