//Daniel Chen
//2023
//level Three
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class LevelThree extends JFrame
{
    BufferedImage lightbulb;
    BufferedImage lightbulbOff;
    BufferedImage shelf;
    BufferedImage openShelf;
    BufferedImage openShelfClothes;
    BufferedImage water;
    BufferedImage window;
    BufferedImage windowClosed;
    BufferedImage waterEmpty;
    BufferedImage bed;
    BufferedImage phone;
    BufferedImage phoneOn;
    BufferedImage rug;
    BufferedImage painting;
    BufferedImage clothes;
    BufferedImage lightswitch;
    BufferedImage lightswitchOff;
    private int playerX = 400;
    private int playerY = 300;
    private int clothesX = 350;
    private int clothesY = 330;
    private boolean lightSwitched = false;
    private boolean displayBulb = false;
    private boolean phoneIsClicked = false;
    private boolean waterDrank = false;
    private boolean curtainClosed = false;
    private boolean canSleep = false;
    private boolean phoneOff = false;
    private boolean easterEgg = false;
    private boolean shelfIsOpen = false;
    private boolean clothesTaken = false;
    private boolean clothesInShelf = false;
    private boolean cannotSleep = false;

    public LevelThree ()
    {

        setTitle ("Level Three");
        setSize (800, 600);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo (null);


        Color midnight = new Color (25, 25, 112);
        JPanel mazePanel = new JPanel ()
        {
            protected void paintComponent (Graphics g)
            {
                super.paintComponent (g);

                try
                {
                    lightbulb = ImageIO.read (new File ("lightbulb.png.png"));
                    lightbulbOff = ImageIO.read (new File ("lightbulboff.png.png"));
                    shelf = ImageIO.read (new File ("drawer.png.png"));
                    openShelf = ImageIO.read (new File ("openShelf.png"));
                    openShelfClothes = ImageIO.read (new File ("openShelfClothes.png"));
                    water = ImageIO.read (new File ("water.png.png"));
                    waterEmpty = ImageIO.read (new File ("waterEmpty.png.png"));
                    window = ImageIO.read (new File ("window.png.png"));
                    windowClosed = ImageIO.read (new File ("windowClosed.png"));
                    bed = ImageIO.read (new File ("bed.png.png"));
                    phone = ImageIO.read (new File ("phoneShut.png.png"));
                    phoneOn = ImageIO.read (new File ("phone.png.png"));
                    rug = ImageIO.read (new File ("rug.png.png"));
                    painting = ImageIO.read (new File ("painting.png.png"));
                    clothes = ImageIO.read (new File ("clothes.png"));
                    lightswitch = ImageIO.read (new File ("lightswitch.png"));
                    lightswitchOff = ImageIO.read (new File ("lightswitchDark.png"));



                }
                catch (Exception e)
                {

                }



                //background color
                if (lightSwitched)
                {
                    Color darkRoom = new Color (19, 4, 66);
                    g.setColor (darkRoom);
                    g.fillRect (0, 0, getWidth (), getHeight ());
                }
                else

                    {
                        Color wall = new Color (8, 84, 73);
                        g.setColor (wall);
                        g.fillRect (0, 0, getWidth (), getHeight ());
                    }

                //lightswitch

                if (lightSwitched)
                {
                    g.drawImage (lightswitchOff, 80, 150, 300, 300, null);
                }

                else if (!lightSwitched)
                {
                    g.drawImage (lightswitch, 80, 150, 300, 300, null);
                }
                //floor

                if (lightSwitched)
                {
                    Color lightOffBrown = new Color (33, 27, 3);
                    g.setColor (lightOffBrown);
                    g.fillRect (0, 320, getWidth (), 300);
                }

                else
                {
                    Color brown = new Color (117, 66, 7);
                    g.setColor (brown);
                    g.fillRect (0, 320, getWidth (), 300);

                }
                //rug

                g.drawImage (rug, 250, 300, 600, 500, null);

                //painting

                g.drawImage (painting, 450, -80, 500, 500, null);
                //window
                if (curtainClosed)
                {
                    g.drawImage (windowClosed, -400, -40, 1000, 1000, null);
                }
                else
                {
                    g.drawImage (window, -400, -40, 1000, 1000, null);
                }
                //lightbulb
                if (lightSwitched)
                {
                    g.drawImage (lightbulbOff, 160, -20, 500, 500, null);

                }
                else
                {
                    g.drawImage (lightbulb, 160, -20, 500, 500, null);
                }


                if (displayBulb)
                {
                    g.setColor (Color.black);
                    g.drawString ("himothy", 200, 200);
                }

                //shelf
                if (!shelfIsOpen)
                {
                    g.drawImage (shelf, 400, 100, 500, 500, null);
                }

                else if (shelfIsOpen && !clothesInShelf)
                {
                    g.drawImage (openShelf, 335, -32, 500, 500, null);
                }

                else if (shelfIsOpen && clothesInShelf)
                {
                    g.drawImage (openShelfClothes, 335, -32, 500, 500, null);
                }

                //water
                if (waterDrank)
                {
                    g.drawImage (waterEmpty, 330, 80, 500, 300, null);
                }
                else
                {
                    g.drawImage (water, 330, 80, 500, 300, null);
                }


                //bed
                g.drawImage (bed, 50, 100, 800, 800, null);

                //clothes
                if (!clothesInShelf)
                {
                    g.drawImage (clothes, clothesX, clothesY, 400, 400, null);
                }
                //phone
                if (phoneOff)
                {
                    g.drawImage (phone, 340, 60, 400, 400, null);

                }
                else
                {
                    g.drawImage (phoneOn, 340, 60, 400, 400, null);
                }
                //clothes
                if (clothesTaken)
                {
                    clothesX = playerX - 120;
                    clothesY = playerY - 120;

                }
                if (cannotSleep)
                {
                    g.setColor (Color.black);
                    g.drawString ("not yet...", 160, 400);
                }

                //player
                g.setColor (Color.red);
                g.fillOval (playerX, playerY, 20, 20);
                g.setColor (Color.black);
                g.drawOval (playerX, playerY, 20, 20);

                cannotSleep = false;
            }
        }
        ;

        mazePanel.setFocusable (true);
        mazePanel.requestFocusInWindow ();

        mazePanel.addKeyListener (new KeyAdapter ()
        {
            public void keyPressed (KeyEvent e)
            {
                int keyCode = e.getKeyCode ();
                switch (keyCode)
                {
                    case KeyEvent.VK_UP:
                        movePlayer (playerX, playerY - 2);
                        break;
                    case KeyEvent.VK_DOWN:
                        movePlayer (playerX, playerY + 2);
                        break;
                    case KeyEvent.VK_LEFT:
                        movePlayer (playerX - 2, playerY);
                        break;
                    case KeyEvent.VK_RIGHT:
                        movePlayer (playerX + 2, playerY);
                        break;
                }
                mazePanel.repaint ();
            }
        }
        );

        mazePanel.addMouseListener (new MouseAdapter ()
        {
            public void mouseClicked (MouseEvent e)
            {
                int mouseX = e.getX ();
                int mouseY = e.getY ();

                //bed

                if (phoneOff && lightSwitched && waterDrank && curtainClosed && !shelfIsOpen && clothesInShelf)
                {
                    cannotSleep = false;
                    if (playerX > 79 && playerX < 300 && playerY > 342 && playerY < 480)
                    {
                        if (mouseX > 91 && mouseX < 267 && mouseY > 379 && mouseY < 470)
                        {
                            mazePanel.repaint ();
                            setVisible (false);
                            new LevelThreeW ();

                        }
                    }

                }
                else
                {
                    if (playerX > 79 && playerX < 300 && playerY > 342 && playerY < 480)
                    {
                        if (mouseX > 91 && mouseX < 267 && mouseY > 379 && mouseY < 470)
                        {

                            cannotSleep = true;
                            mazePanel.repaint ();
                        }
                    }
                }

                //clothes
                if (playerX >= 416 && playerX <= 515 && playerY >= 395 && playerY <= 464)
                {
                    if (mouseX > 446 && mouseX < 482 && mouseY > 420 && mouseY < 463)
                    {
                        clothesTaken = true;
                        clothesX = playerX - 120;
                        clothesY = playerY - 120;

                        mazePanel.repaint ();
                    }
                }
                //phone

                if (!phoneOff)
                {
                    if (playerX > 580 && playerX < 685 && playerY > 190 && playerY < 253)
                    {
                        if (mouseX > 612 && mouseX < 648 && mouseY > 245 && mouseY < 260)
                        {
                            phoneOff = true;
                            mazePanel.repaint ();

                        }
                    }
                }

                else
                {
                    if (playerX > 580 && playerX < 685 && playerY > 190 && playerY < 253)
                    {
                        if (mouseX > 612 && mouseX < 648 && mouseY > 245 && mouseY < 260)
                        {
                            phoneOff = false;
                            mazePanel.repaint ();

                        }
                    }
                }



                //light switch

                if (!lightSwitched)
                {

                    if (playerX > 86 && playerX < 153 && playerY > 163 && playerY < 257)
                    {
                        if (mouseX > 123 && mouseX < 128 && mouseY > 205 && mouseY < 223)
                        {
                            lightSwitched = true;
                            mazePanel.repaint ();

                        }
                    }
                }
                else if (lightSwitched)
                {
                    if (playerX > 86 && playerX < 153 && playerY > 163 && playerY < 257)
                    {
                        if (mouseX > 123 && mouseX < 128 && mouseY > 205 && mouseY < 223)
                        {
                            lightSwitched = false;
                            mazePanel.repaint ();

                        }
                    }
                }

                //water drink
                if (playerX > 520 && playerX < 603 && playerY > 215 && playerY < 273)
                {
                    if (mouseX > 574 && mouseX < 593 && mouseY > 225 && mouseY < 250)
                    {
                        waterDrank = true;
                        mazePanel.repaint ();
                    }
                }


                //shelf

                if (playerX >= 515 && playerX <= 692 && playerY >= 260 && playerY <= 357)
                {
                    if (!shelfIsOpen)
                    {
                        if (mouseX >= 591 && mouseX <= 602 && mouseY >= 293 && mouseY <= 304)
                        {
                            shelfIsOpen = true;
                            mazePanel.repaint ();
                        }
                    }

                    else if (shelfIsOpen)
                    {
                        if (mouseX >= 574 && mouseX <= 581 && mouseY > 317 && mouseY <= 325)
                        {
                            shelfIsOpen = false;
                            mazePanel.repaint ();
                        }
                    }

                    if (shelfIsOpen)
                    {
                        if (clothesTaken)
                        {

                            if (mouseX >= 561 && mouseX <= 612 && mouseY > 291 && mouseY < 302)
                            {
                                clothesInShelf = true;
                                mazePanel.repaint ();
                            }
                        }

                    }

                }
                //curtain close

                if (!curtainClosed)
                {
                    if (playerX > 254 && playerX < 455 && playerY > 22 && playerY < 291)
                    {
                        if (mouseX > 250 && mouseX < 292 && mouseY > 23 && mouseY < 288)
                        {
                            curtainClosed = true;
                            mazePanel.repaint ();
                        }
                        else if (mouseX > 420 && mouseX < 470 && mouseY > 23 && mouseY < 288)
                        {
                            curtainClosed = true;
                            mazePanel.repaint ();
                        }
                    }

                }

                else if (curtainClosed)
                {
                    if (playerX > 254 && playerX < 455 && playerY > 22 && playerY < 291)
                    {
                        if (mouseX > 300 && mouseX < 417 && mouseY > 23 && mouseY < 288)
                        {
                            curtainClosed = false;
                            mazePanel.repaint ();
                        }
                    }
                }

                //easter egg
                if (playerX >= 551 && playerX <= 604 && playerY >= 64 && playerY <= 100)
                {
                    if (mouseX >= 580 && mouseX <= 588 && mouseY >= 81 && mouseY <= 90)
                    {
                        easterEgg = true;
                        setVisible (false);
                        new EasterEgg ();
                    }
                }
            }
        }
        );

        getContentPane ().add (mazePanel);
    }


    private void movePlayer (int newX, int newY)
    {
        if (newX >= 0 && newX < 971 && newY >= 0 && newY < 955)
        {
            playerX = newX;
            playerY = newY;
        }
    }



    public static void main (String[] args)
    {
        SwingUtilities.invokeLater (new Runnable ()
        {
            public void run ()
            {
                new LevelThree ().setVisible (true);
            }
        }
        );
    }
}
