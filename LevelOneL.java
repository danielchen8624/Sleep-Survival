//level 1 lose by daniel
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;

public class LevelOneL
{

    public LevelOneL ()
    {
        JFrame frame = new JFrame ("Level One6");
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

                if ((x >= 90 && x <= 197) && (y >= 180 && y <= 228)) //menu
                {
                    frame.setVisible (false);
                    new Menu ();
                }
                else if ((x >= 231 && x <= 340) && (y >= 180 && y <= 228)) //Restart Level 1
                {
                    frame.setVisible (false);
                    new LevelOne ();
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
        new LevelOneL ();

    }


    class Drawing extends JComponent
    {
        public void paint (Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g;

            Color midnight = new Color (25, 25, 112);
            g.setColor (midnight);
            g.fillRect (0, 0, 500, 300);
            g.setColor (Color.blue);
            g.fillRect (70, 35, 310, 110);


            Color midnight2 = new Color (8, 16, 166);
            g.setColor (midnight2);
            g2d.fillRoundRect (430, 50, 30, 170, 50, 30);



            Font largeSerifFont = new Font ("Level 1", Font.PLAIN, 35);
            Font smallSerifFont = new Font ("Level 2", Font.PLAIN, 25);
            g.setFont (largeSerifFont);
            g.setColor (Color.yellow);
            g.drawString ("Oh no! You lost!", 100, 100);


            g.setColor (midnight2);
            g.fillRect (90, 180, 110, 50);
            g.fillRect (230, 180, 110, 50);

            g.setFont (smallSerifFont);
            g.setColor (Color.yellow);
            g.drawString ("Menu", 110, 210);
            g.drawString ("Restart", 240, 210);
        }
    }
}
