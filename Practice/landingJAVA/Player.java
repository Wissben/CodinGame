import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

class Ship {

    public int x,y,hSpeed,vSpeed,fuel,rotate,power;

    public Ship(int x , int y , int hs , int vs , int fuel , int rotate , int power )
    {
        this.x=x;
        this.y=y;
        this.hSpeed=hs;
        this.vSpeed=vs;
        this.fuel=fuel;
        this.rotate=rotate;
        this.power=power;
    }

    void update(int angularSpeed,int power)
    {
        x+=hSpeed;
        y+=vSpeed;
        vSpeed+=this.power;
        fuel-=this.power;
        rotate+=angularSpeed;
        this.power=power;
        regulate(this.x,this.y,this.hSpeed,this.vSpeed,this.fuel,this.rotate,this.power);

    }

    private void regulate(int x , int y ,int hSpeed, int vSpeed, int fuel , int angle , int power )
    {
        if(x<0)
            x=0;
        if(x>7000)
            x=7000;
        if(y<0)
            y=0;
        if(y>3000)
            y=3000;
        if(fuel < 0 )
            fuel = 0 ;
        if(angle > 90 )
            angle=90;
        if(angle < -90)
            angle = -90;
        if(power < -4)
            power = -4;
        if(power > 4 )
            power =4;
        if(hSpeed > 40)
            hSpeed=40;
        if(hSpeed < -40)
            hSpeed=-40;
        if(vSpeed > 40)
            hSpeed=40;
        if(hSpeed < -40)
            vSpeed=-40;

    }
}
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).
            Ship s = new Ship(X,Y,hSpeed,vSpeed,fuel,0,power);
            s.update(0,power);
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // 2 integers: rotate power. rotate is the desired rotation angle (should be 0 for level 1), power is the desired thrust power (0 to 4).
            System.out.println("0 "+s.power);
        }
    }
}
