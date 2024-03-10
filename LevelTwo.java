//Level 2
//By Daniel Chen
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LevelTwo extends JFrame
{

    private boolean o1 = false;
    private boolean o2 = false;
    private boolean o3 = false;
    private boolean o4 = false;
    private boolean o5 = false;
    private int[] [] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
            {1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

    private int playerX = 1;
    private int playerY = 1;

    public LevelTwo ()
    {

        setTitle ("Level Two");
        setSize (600, 600);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo (null);


        Color midnight = new Color (25, 25, 112);
        JPanel mazePanel = new JPanel ()
        {

            protected void paintComponent (Graphics g)
            {
                super.paintComponent (g);

                int numRows = maze.length;
                int numCols = maze [0].length;
                int cellSize = Math.min (getWidth () / numCols, getHeight () / numRows);

                for (int i = 0 ; i < numRows ; i++)
                {
                    for (int j = 0 ; j < numCols ; j++)
                    {
                        int x = j * cellSize;
                        int y = i * cellSize;

                        if (maze [i] [j] == 1)
                        {
                            g.setColor (midnight);
                            g.fillRect (x, y, cellSize, cellSize);
                        }
                        else
                        {
                            g.setColor (Color.WHITE);
                            g.fillRect (x, y, cellSize, cellSize);
                        }

                        if (playerX == j && playerY == i)
                        {
                            g.setColor (Color.RED);
                            g.fillOval (x + cellSize / 4, y + cellSize / 4, cellSize / 2, cellSize / 2);
                        }
                    }
                }

                //phone
                g.fillRect (250, 80, 20, 30);
                Color phone = new Color (173, 216, 230);
                g.setColor (phone);
                g.fillRect (253, 83, 14, 24);
                g.setColor (Color.blue);
                g.fillRect (254, 86, 3, 3);
                g.fillRect (263, 91, 3, 3);
                g.setColor (Color.yellow);
                g.fillRect (259, 86, 3, 3);
                g.setColor (Color.green);
                g.fillRect (263, 86, 3, 3);
                g.setColor (Color.red);
                g.fillRect (259, 91, 3, 3);
                g.setColor (Color.magenta);
                g.fillRect (254, 91, 3, 3);
                g.setColor (Color.orange);
                g.fillRect (254, 96, 3, 3);


                //bed
                if (!o5)
                {
                    g.setColor (Color.red);
                    g.fillRect (240, 410, 30, 20);
                    Color pillow = new Color (208, 213, 219);
                    g.setColor (pillow);
                    g.fillRect (270, 410, 8, 20);
                }
                //book
                if (!o2)
                {
                    Color book = new Color (110, 176, 255);
                    g.setColor (book);
                    g.fillRect (242, 165, 36, 30);
                    g.setColor (Color.white);
                    g.fillRect (244, 167, 32, 26);
                    g.setColor (Color.black);
                    g.drawLine (260, 167, 260, 192);
                    Font font = new Font ("book", Font.PLAIN, 4);
                    g.setFont (font);
                    g.drawString ("This is a ", 245, 172);
                    g.drawString ("book.The ", 245, 177);
                    g.drawString ("text is ve", 245, 182);
                    g.drawString ("ry small", 245, 187);
                    g.drawString ("can you r", 245, 192);
                    g.drawString ("read the", 262, 172);
                    g.drawString ("text? I", 262, 177);
                    g.drawString ("don't th", 262, 182);
                    g.drawString ("ink you c", 262, 187);
                    g.drawString ("can.", 262, 192);
                }

                //homework
                Font homework = new Font ("homework", Font.PLAIN, 7);
                g.setFont (homework);
                g.setColor (Color.black);
                g.drawRect (327, 50, 25, 30);
                g.drawString ("Home", 330, 62);
                g.drawString ("work", 330, 71);

                //youtube
                g.setColor (Color.red);
                g.fillRect (50, 490, 35, 20);
                g.setColor (Color.white);
                int[] xTri = {64, 64, 72};
                int[] yTri = {492, 504, 498};
                g.fillPolygon (xTri, yTri, 3);

                //toothbrush
                if (!o4)
                {
                    Color toothbrush = new Color (56, 156, 201);
                    g.setColor (toothbrush);
                    g.fillRect (325, 400, 30, 6);
                    g.setColor (Color.black);
                    // g.drawRect(340,395,14,5);
                    g.drawLine (340, 395, 340, 399);
                    g.drawLine (342, 395, 342, 399);
                    g.drawLine (344, 395, 344, 399);
                    g.drawLine (346, 395, 346, 399);
                    g.drawLine (348, 395, 348, 399);
                    g.drawLine (350, 395, 350, 399);
                    g.drawLine (352, 395, 352, 399);
                    g.drawLine (354, 395, 354, 399);

                }

                g.setColor (Color.black);


                //water
                if (!o1)
                {
                    int[] xWater = {489, 493, 505, 509};
                    int[] yWater = {80, 105, 105, 80};
                    g.drawPolygon (xWater, yWater, 4);
                    Color water = new Color (209, 241, 255);
                    g.setColor (water);
                    int[] xWaterx = {490, 493, 505, 508};
                    int[] yWaterx = {85, 105, 105, 85};
                    g.fillPolygon (xWaterx, yWaterx, 4);
                }


                //music
                if (!o3)
                {

                    g.setColor (Color.black);
                    g.fillOval (405, 285, 10, 10);
                    g.fillOval (425, 285, 10, 10);
                    g.fillRect (411, 273, 4, 15);
                    g.fillRect (431, 273, 4, 15);
                    g.fillRect (411, 273, 20, 4);
                }
            }
        }
        ;

        mazePanel.setFocusable (true);

        mazePanel.requestFocusInWindow ();

        mazePanel.addKeyListener (new KeyAdapter ()
        {
            @ Override
                public void keyPressed (KeyEvent e)
            {
                int keyCode = e.getKeyCode ();

                switch (keyCode)
                {
                    case KeyEvent.VK_UP:
                        movePlayer (playerX, playerY - 1);
                        break;
                    case KeyEvent.VK_DOWN:
                        movePlayer (playerX, playerY + 1);
                        break;
                    case KeyEvent.VK_LEFT:
                        movePlayer (playerX - 1, playerY);
                        break;
                    case KeyEvent.VK_RIGHT:
                        movePlayer (playerX + 1, playerY);
                        break;
                }

                mazePanel.repaint ();


                if (playerX == maze [0].length - 8 && playerY == maze.length - 12)
                {
                    setVisible (false);
                    new LevelTwoL ();
                }
                else if (playerX == maze [0].length - 6 && playerY == maze.length - 13)
                {
                    setVisible (false);
                    new LevelTwoL ();
                }
                else if (playerX == maze [0].length - 13 && playerY == maze.length - 2)
                {
                    setVisible (false);
                    new LevelTwoL ();
                }

                if (playerX == maze [0].length - 2 && playerY == maze.length - 12)
                {
                    o1 = true;

                }
                if (playerX == maze [0].length - 8 && playerY == maze.length - 10)
                {
                    o2 = true;

                }
                if (playerX == maze [0].length - 4 && playerY == maze.length - 7)
                {
                    o3 = true;

                }
                if (playerX == maze [0].length - 6 && playerY == maze.length - 4)
                {
                    o4 = true;

                }
                if (playerX == maze [0].length - 8 && playerY == maze.length - 4)
                {
                    o5 = true;

                }

                if (o1 && o2 && o3 && o4 && o5)
                {
                    //Thread.sleep(500);
                    setVisible (false);
                    new LevelTwoW ();
                }


            }
        }
        );

        getContentPane ().add (mazePanel);
    }


    private void movePlayer (int newX, int newY)
    {
        if (newX >= 0 && newX < maze [0].length && newY >= 0 && newY < maze.length && maze [newY] [newX] == 0)
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
                new LevelTwo ().setVisible (true);
            }
        }
        );
    }
}

