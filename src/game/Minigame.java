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

/**
 *
 * @author ryansanjose
 */
public class Minigame extends HackathonQuestionsRyan implements KeyListener, ActionListener {
    private static Image sans;
    private static Image player;
    private static Image beam;
    private static Image ball;
    private static int sx = 100;
    private static int sy = 400;
    private static int px = 700;
    private static int py = 400;
    private static int bax = -100;
    private static int bay = -100;
    private static boolean left = false;
    private static boolean right = false;
    private static boolean up = false;
    private static boolean down = false;
    private static boolean sup = false;
    private static boolean sdown = true;
    private static boolean supnext = false;
    private static boolean sdownnext = false;
    private static boolean fire = false;
    private static boolean sfire = false;
    private static boolean pew = false;
    private static boolean end = false;
    private static int beamwidth = 0;
    private static Rectangle hitsans;
    private static Rectangle hitplay;
    private static Rectangle hitbeam;
    private static Rectangle hitball;
    private static Image victory;

    public void badtime(Graphics2D g2) {
        sans = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\sanshaha.png");
        player = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Naenaeman.png");
        beam = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Beam.png");
        ball = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Ball.png");
        victory = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Victory.gif");
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
        g2.drawImage(sans, sx, sy, 200, 200, this);
        g2.drawImage(player, px, py, 200, 200, this);
        g2.drawImage(beam, sx + 10, sy + 25, beamwidth, 100, this);
        g2.drawImage(ball, bax, bay, 75, 75, this);
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
        if (sdown) {
            sy += 3;
            if (sy >= 500) {
                sdown = false;
                supnext = true;
                sfire = true;
            }
        }
        if (sup) {
            sy -= 3;
            if (sy <= 50) {
                sup = false;
                sdownnext = true;
                sfire = true;

            }
        }
        if (fire) {
            bax = px;
            bay = py + 15;
            fire = false;
            pew = true;
        }
        if (pew) {
            bax -= 20;
            if (bax <= sx + 200) {
                if (bay + 75 >= sy && bay <= sy + 200) {
                    sdown = false;
                    sup = false;
                    sdownnext = false;
                    supnext = false;
                    sfire = false;
                    end = true;
                }
            }
            if (bax <= 0) {
                pew = false;
                bax = -100;
                bay = -100;
            }
        }
        if (sfire) {
            beamwidth += 10;
            if (sx + 10 + beamwidth >= px) {
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
            g2.drawImage(victory, -200, 0, 1920, 1080, this);
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
