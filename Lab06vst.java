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

            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);
            g.setColor(new Color(red,green,blue));
           g.drawLine(x1,y1,width,height);


        }




        // Draw Random Squares
        for(int k = 0; k <= 100; k++){
            Random rand = new Random();

            int x1 = rand.nextInt(340) + 400;
            int y1 = rand.nextInt(240) + 10;
            int width = 50;
            int height = 50;

            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);
            g.setColor(new Color(red,green,blue));
           g.fillRect(x1,y1,width,height);

        }




        // Draw Random Circles
        for (int k = 0; k <= 100; k++) {
            Random rand = new Random();

            int x1 = rand.nextInt(185)+10;
            int y1 = rand.nextInt(65)+320;
            int width = rand.nextInt(200);
            int height = width;

            int red = rand.nextInt(256);
            int blue = rand.nextInt(256);
            int green = rand.nextInt(256);
            g.setColor(new Color(red,green,blue));
            g.drawOval(x1,y1,width,height);



        }




        // Draw 3-D Box





    }

}



    
 