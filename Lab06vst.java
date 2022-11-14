// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        for (int k = 0; k <= 100; k++) {
            Random rand = new Random();

            int x1 = rand.nextInt(390) + 10;
            int y1 = rand.nextInt(280) + 10;
            int width = rand.nextInt(380) + 10;
            int height = rand.nextInt(280) + 10;

           g.drawLine(x1,y1,width,height);


        }




        // Draw Random Squares





        // Draw Random Circles
        for (int k = 0; k <= 100; k++) {
            Random rand = new Random();

            int x1 = rand.nextInt(200)+10;
            int y1 = rand.nextInt(40)+340;
            int width = rand.nextInt(200);
            int height = width;

            g.drawOval(x1,y1,width,height);



        }




        // Draw 3-D Box





    }

}



    
 