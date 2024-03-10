//level 3 tutorial by daniel
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;

public class LevelThreeT
{

    public LevelThreeT ()
    {
        JFrame frame = new JFrame ("Level One");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize (500, 300);
        frame.add (new Drawing ());
        frame.setVisible (true);

        // Create a custom panel that listens for mouse clicks
        JPanel panel = new JPanel ();

        // Create a mouse listener for the panel
        MouseAdapter panelMouseAdapter = new MouseAdapter ()
        {
            @ Override
                public void mouseClicked (MouseEvent e)
            {
                int x = e.getX ();
                int y = e.getY ();
                if ((x >= 181 && x <= 279) && (y >= 200 && y <= 238))
                {
                    panel.setVisible (false);
                    frame.setVisible (false);
                    new LevelThree ().setVisible (true);
                }

            }
        }
        ;

        // Add the mouse listener to the panel
        panel.addMouseListener (panelMouseAdapter);

        // Add the panel to the frame
        frame.getContentPane ().add (panel);
        frame.setVisible (true);

    }


    public static void main (String[] args)
    {
        new LevelThreeT ();

    }


    class Drawing extends JComponent
    {
        public void paint (Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;

            Color midnight = new Color (25, 25, 112);
            g.setColor (midnight);
            g.fillRect (0, 0, 500, 300);



            g.setColor (Color.yellow);
            Font largeSerifFont = new Font ("Level 1", Font.PLAIN, 15);
            g.setFont (largeSerifFont);
            g.drawString ("Welcome to Level three. This is the final level. ", 45, 100);
            g.drawString ("Move around using arrow keys. Can you fall asleep?", 45, 120);
            g.drawString ("hint: Get up close and personal. You can click on objects.", 45, 140);
            Font begin = new Font ("Begin Button", Font.PLAIN, 25);
            g.setFont (begin);
            g.drawString ("Begin!", 195, 227);




            //details
            //moon
            g.setColor (Color.yellow);
            g.fillOval (400, 20, 50, 50);
            g.setColor (midnight);
            g.fillOval (390, 20, 50, 50);
            //stars
            g.setColor (Color.yellow);
            int[] xStar = {10, 12, 15, 12, 10, 8, 5, 8};
            int[] yStar = {10, 14, 15, 16, 20, 16, 15, 14};
            //
            int[] xStar1 = {30, 32, 35, 32, 30, 28, 25, 28};
            int[] yStar1 = {20, 24, 25, 26, 30, 26, 25, 24};
            //
            int[] xStar2 = {50, 52, 55, 52, 50, 48, 45, 48};
            int[] yStar2 = {14, 18, 19, 20, 24, 20, 19, 18};
            //
            int[] xStar3 = {70, 72, 75, 72, 70, 68, 65, 68};
            int[] yStar3 = {30, 34, 35, 36, 40, 36, 35, 34};
            //
            int[] xStar4 = {90, 92, 95, 92, 90, 88, 85, 88};
            int[] yStar4 = {14, 18, 19, 20, 24, 20, 19, 18};
            //
            int[] xStar5 = {120, 122, 125, 122, 120, 118, 115, 118};
            int[] yStar5 = {16, 20, 21, 22, 26, 22, 21, 20};
            //
            int[] xStar6 = {140, 142, 145, 142, 140, 138, 135, 138};
            int[] yStar6 = {24, 28, 29, 30, 34, 30, 29, 28};
            //
            int[] xStar7 = {160, 162, 165, 162, 160, 158, 155, 158};
            int[] yStar7 = {15, 19, 20, 21, 25, 21, 20, 19};
            //
            int[] xStar8 = {180, 182, 185, 182, 180, 178, 175, 178};
            int[] yStar8 = {17, 21, 22, 23, 27, 23, 22, 21};
            //
            int[] xStar9 = {205, 207, 210, 207, 205, 203, 200, 203};
            int[] yStar9 = {30, 34, 35, 36, 40, 36, 35, 34};
            //
            int[] xStar10 = {230, 232, 235, 232, 230, 228, 225, 228};
            int[] yStar10 = {10, 14, 15, 16, 20, 16, 15, 14};
            //
            int[] xStar11 = {250, 252, 255, 252, 250, 248, 245, 248};
            int[] yStar11 = {20, 24, 25, 26, 30, 26, 25, 24};
            //
            int[] xStar12 = {270, 272, 275, 272, 270, 268, 265, 268};
            int[] yStar12 = {16, 20, 21, 22, 26, 22, 21, 20};
            //
            int[] xStar13 = {300, 302, 305, 302, 300, 298, 295, 298};
            int[] yStar13 = {12, 16, 17, 18, 22, 18, 17, 16};
            //
            int[] xStar14 = {320, 322, 325, 322, 320, 318, 315, 318};
            int[] yStar14 = {22, 26, 27, 28, 32, 28, 27, 26};
            //
            int[] xStar15 = {330, 332, 335, 332, 330, 328, 325, 328};
            int[] yStar15 = {30, 34, 35, 36, 40, 36, 35, 34};
            //
            int[] xStar16 = {350, 352, 355, 352, 350, 348, 345, 348};
            int[] yStar16 = {20, 24, 25, 26, 30, 26, 25, 24};
            //
            int[] xStar17 = {370, 372, 375, 372, 370, 368, 365, 368};
            int[] yStar17 = {18, 22, 23, 24, 28, 24, 23, 22};

            g.fillPolygon (xStar, yStar, 8);
            g.fillPolygon (xStar1, yStar1, 8);
            g.fillPolygon (xStar2, yStar2, 8);
            g.fillPolygon (xStar3, yStar3, 8);
            g.fillPolygon (xStar4, yStar4, 8);
            g.fillPolygon (xStar5, yStar5, 8);
            g.fillPolygon (xStar6, yStar6, 8);
            g.fillPolygon (xStar7, yStar7, 8);
            g.fillPolygon (xStar8, yStar8, 8);
            g.fillPolygon (xStar9, yStar9, 8);
            g.fillPolygon (xStar10, yStar10, 8);
            g.fillPolygon (xStar11, yStar11, 8);
            g.fillPolygon (xStar12, yStar12, 8);
            g.fillPolygon (xStar13, yStar13, 8);
            g.fillPolygon (xStar14, yStar14, 8);
            g.fillPolygon (xStar15, yStar15, 8);
            g.fillPolygon (xStar16, yStar16, 8);
            g.fillPolygon (xStar17, yStar17, 8);
        }
    }
}
