package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Image;
import java.awt.Rectangle;

/**This class controls the minigame that appears at the end of the quiz (the last question).
 * It is part of the Modern Era section of the quiz.
 *
 * @author Ryan San Jose
 */
public class Minigame implements KeyListener, ActionListener {
    private static int sx;
    private static int sy;
    private static int px;
    private static int py;
    private static int bax;
    private static int bay;
    private static int beamwidth;
    private static boolean left;
    private static boolean right;
    private static boolean up;
    private static boolean down;
    private static boolean sup;
    private static boolean sdown;
    private static boolean supnext;
    private static boolean sdownnext;
    private static boolean fire;
    private static boolean sfire;
    private static boolean pew;
    private static boolean end;
    private static Image sans;
    private static Image player;    
    private static Image beam;
    private static Image ball;
    private static Image victory;
    private static Rectangle hitsans;
    private static Rectangle hitplay;
    private static Rectangle hitbeam;
    private static Rectangle hitball;
   
    public Minigame() {
        sx = 100;
        sy = 400;
        px = 700;
        py = 400;
        bax = -100;
        bay = -100;
        beamwidth = 0;
        left = false;
        right = false;
        up = false;
        down = false;
        sup = false;
        sdown = true;
        supnext = false;
        sdownnext = false;
        fire = false;
        sfire = false;
        pew = false;
        end = false;
        sans = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\sanshaha.png");
        player = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Naenaeman.png");
        beam = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Beam.png");
        ball = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Ball.png");
        victory = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Victory.gif");
        hitsans = new Rectangle(sx, sy, 200, 200);
        hitplay = new Rectangle(px, py, 200, 200);
        hitbeam = new Rectangle(sx + 10, sy + 25, beamwidth, 100);
        hitball = new Rectangle(bax, bay, 75, 75);
    }
    
    /**Runs main logic of class.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void badtime(Graphics2D g2) {
        hitsans = new Rectangle(sx, sy, 200, 200);
        hitplay = new Rectangle(px, py, 200, 200);
        hitbeam = new Rectangle(sx + 10, sy + 25, beamwidth, 100);
        hitball = new Rectangle(bax, bay, 75, 75);
        System.out.println("" + left);
        System.out.println("" + right);
        System.out.println("" + down);
        System.out.println("" + up);
        g2.setColor(Color.black);
        g2.fillRect(0, 0, 3000, 3000);

        Font font = new Font("Serif", 50, 50);
        //Delete
        /*g2.setColor(Color.red);
        g2.fillRect(px, py, 200, 200);
        g2.setColor(Color.blue);
        g2.fillRect(sx, sy, 200, 200);
        g2.setColor(Color.green);
        g2.fillRect(sx+10, sy+25, beamwidth, 100);
        g2.setColor(Color.orange);
        g2.fillRect(bax, bay, 75, 75);*/
        g2.drawImage(sans, sx, sy, 200, 200, null);
        g2.drawImage(player, px, py, 200, 200, null);
        g2.drawImage(beam, sx + 10, sy + 25, beamwidth, 100, null);
        g2.drawImage(ball, bax, bay, 75, 75, null);
        //Move player's x and y depending on keys being pressed
        if (left) {
            px -= 5;
        }
        if (right) {
            px += 5;
        }
        if (down) {
            py += 5;
        }
        if (up) {
            py -= 5;
        }
        //If flag for moving Sans down is true, move him down on screen
        if (sdown) {
            sy += 3;
            if (sy >= 500) {
                /*If Sans' y reaches >= 500, stop moving, prepare to fire and move up (set booleans)
                He will move up after he fires*/
                sdown = false;
                supnext = true;
                sfire = true;
            }
        }
        //If flag for moving Sans up is true, move him up on screen
        if (sup) {
            sy -= 3;
            if (sy <= 50) {
                /*If Sans' y reaches <= 50, stop moving, prepare to fire and move down (set booleans)
                He will move down after he fires*/
                sup = false;
                sdownnext = true;
                sfire = true;

            }
        }
        //Controls player firing beam balls
        if (fire) {
            //Set beam ball picture and hitBox to correct position (where player current is) 
            bax = px;
            bay = py + 15;
            fire = false;
            pew = true;
        }
        //Shoot out player's beam balls
        if (pew) {
            bax -= 20;
            if (bax <= sx + 200) {
                //If beam ball hit Sans, end the minigame- go to victory screen
                if (bay + 75 >= sy && bay <= sy + 200) {
                    sdown = false;
                    sup = false;
                    sdownnext = false;
                    supnext = false;
                    sfire = false;
                    end = true;
                }
            }
            //Reset firing process once beam ball if off screen
            if (bax <= 0) {
                pew = false;
                bax = -100;
                bay = -100;
            }
        }
        //Controls processes when Sans' fires
        if (sfire) {
            beamwidth += 10;
            if (sx + 10 + beamwidth >= px) {
                /*Ryan coded the player getting hit by the beam using the player's y position
                and comparing that to the state of Sans (if he is on the bottom or top
                of the screen. 
                He did not use the intersect method from Rectangle- which would have been better looking back
                (we were crunched for time).
                sdownnext = Sans is currently at the top of the screen
                supnext = Sans is currently at the top of the screen
                If Sans is on top, and player on top, and the edge of the beam is >= player x- "kill" the player (quit game)*
                If Sans is on down, and player on down, and the edge of the beam is >= player x- "kill" the player (quit game)*/
                if (sdownnext) {
                    if (py > -153 && py < 147) {
                        System.exit(0);
                    }
                }
                else if (supnext) {
                    if (py > 302 && py < 602) {
                        System.exit(0);
                    }
                }
            }
            if (beamwidth >= 1200) {
                beamwidth = 0;
                sfire = false;
                if (sdownnext) {
                    sdownnext = false;
                    sdown = true;
                }
                if (supnext) {
                    supnext = false;
                    sup = true;
                }
            }
        }
        if (end) {
            g2.drawImage(victory, -200, 0, 1920, 1080, null);
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_LEFT) {
            left = true;
        }
        if (e.getKeyCode() == e.VK_RIGHT) {
            right = true;
        }
        if (e.getKeyCode() == e.VK_UP) {
            up = true;
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            down = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_LEFT) {
            left = false;
        }
        if (e.getKeyCode() == e.VK_RIGHT) {
            right = false;
        }
        if (e.getKeyCode() == e.VK_UP) {
            up = false;
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            down = false;
        }
        if (e.getKeyCode() == e.VK_SPACE) {
            fire = true;
        }
    }

    public void actionPerformed(ActionEvent e) {

    }
}
