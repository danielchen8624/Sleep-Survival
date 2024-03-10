import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;

public class LevelOne6
{

    public LevelOne6 ()
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

                if ((x >= 21 && x <= 199) && (y >= 50 && y <= 218)) //left
                {
                    frame.setVisible (false);
                    new LevelOne7 ();
                }
                else if ((x >= 226 && x <= 403) && (y >= 50 && y <= 218))
                {
                    frame.setVisible (false);
                    new LevelOneL ();
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
        new LevelOne6 ();

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
            g.fillRect (20, 50, 180, 170);
            g.fillRect (225, 50, 180, 170);

            Color midnight2 = new Color (8, 16, 166);
            g.setColor (midnight2);
            g2d.fillRoundRect (430, 50, 30, 170, 50, 30);
            g2d.setColor (Color.yellow);
            g2d.fillRoundRect (430, 60, 30, 160, 50, 30);


            Font largeSerifFont = new Font ("Level 1", Font.PLAIN, 25);
            g.setFont (largeSerifFont);
            g.drawString ("Listen to Music ", 25, 130);

            g.drawString ("Eat a  ", 275, 120);
            g.drawString ("Large Meal  ", 245, 150);

        }
    }
}
