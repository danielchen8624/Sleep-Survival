/**
By Daniel Chen
Menu
*/

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Menu
{
    private BufferedImage logo;
    public Menu ()
    {
        JFrame frame = new JFrame ("Menu");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize (500, 300);
        frame.add (new Drawing ());
        frame.setVisible (true);

        // Create a custom panel that listens for mouse clicks
        JPanel panel = new JPanel ();


        // Create a mouse listener for the panel
        MouseAdapter panelMouseAdapter = new MouseAdapter ()
        {


            public void mouseClicked (MouseEvent e)
            {
                int x = e.getX ();
                int y = e.getY ();

                if ((x >= 122 && x <= 188) && (y >= 89 && y <= 156))
                {
                    frame.setVisible (false);
                    new LevelOneT ();
                }
                else if ((x >= 210 && x <= 279) && (y >= 89 && y <= 156))
                {
                    frame.setVisible (false);
                    new LevelTwoT ();
                }
                else if ((x >= 300 && x <= 370) && (y >= 89 && y <= 156))
                {
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

        try
        {
            logo = ImageIO.read (new File ("companyLogo.png"));
        }
        catch (Exception e)
        {

        }

    }


    public static void main (String[] args)
    {
        new Menu ();

    }


    class Drawing extends JComponent
    {
        public void paint (Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;
            //background
            Color midnight = new Color (25, 25, 112);
            g.setColor (midnight);
            g.fillRect (0, 0, 500, 300);

            Color midnight2 = new Color (8, 16, 166);
            g.setColor (midnight2);
            g2d.fillRoundRect (100, 10, 290, 240, 50, 30);

            //level select
            Color myBlue = new Color (3, 115, 252);
            g.setColor (myBlue);
            g.fillRect (120, 20, 250, 55);
            g.fillRect (120, 88, 70, 70);
            g.fillRect (210, 88, 70, 70);
            g.fillRect (300, 88, 70, 70);
            g.fillRect (120, 168, 70, 70);
            g.fillRect (210, 168, 70, 70);
            g.fillRect (300, 168, 70, 70);

            //text
            g.setColor (Color.orange);
            Font largeSerifFont = new Font ("Serif", Font.PLAIN, 40);
            Font levelFont = new Font ("Level", Font.PLAIN, 20);

            g.setFont (largeSerifFont);
            g.drawString ("Sleep Survival", 130, 60);
            g.setFont (levelFont);
            g.drawString ("Level 1", 123, 130);
            g.drawString ("Level 2", 213, 130);
            g.drawString ("Level 3", 303, 130);
            //
            g.drawString ("Coming", 122, 200);
            g.drawString ("Coming", 212, 200);
            g.drawString ("Coming", 302, 200);
            g.drawString ("Soon !", 125, 225);
            g.drawString ("Soon !", 215, 225);
            g.drawString ("Soon !", 305, 225);

            //logo

            g.drawImage (logo, 375, 150, 130, 110, null);

        }
    }
}
