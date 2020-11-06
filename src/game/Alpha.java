package game;

//6/17/19

import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import javax.swing.*;//needed for JFrame window
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alpha extends JFrame implements KeyListener, ActionListener {//opens program

    public static int era = 1;
    public static int questionNumber = 0;
    public static Font terminal;
    public static Color terminalGreen;
    public static Color cyan;
    private QuizEra70s era70s;
    private TeenHack_Era2 era80s;
    private Sega sega;
    private HackathonQuestionsRyan today;

    public Alpha() {//constructor for JPanel
        add(new JP());
    }//close Jpanel Constructor

    public static void main(String[] args) {//start main method
        Music.standard();
        System.setProperty("sun.java2d.opengl", "True");
        Alpha w = new Alpha();
        w.setTitle("VGQuiz");
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        w.addKeyListener(w);//allows for ket pressing to move objects 
        terminalGreen = new Color(70, 235, 52);
        cyan = new Color(36, 177, 201);
        try {
            terminal = Font.createFont(Font.TRUETYPE_FONT, new File("src\\game\\resources\\clacon.ttf")).deriveFont(45f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(terminal);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Alpha.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end main

    public class JP extends JPanel {//start JPanel CLass

        public JP() {
            Container c = getContentPane();
            setOpaque(false);//allows for setting a color background in JPanel
            c.setBackground(Color.black);
        }//end JP

        public void paint(Graphics g) {//opens paint method
            Graphics2D g2 = (Graphics2D) g;
            RenderingHints rh = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
            g2.setRenderingHints(rh);
            if (era == 1) {
                g2.setColor(terminalGreen);
                g2.setFont(terminal);
                era70s = new QuizEra70s();
                era70s.standard(g2);
            }
            else if (era == 2) {
                g2.setColor(terminalGreen);
                g2.setFont(terminal);
                era80s = new TeenHack_Era2();
                era80s.standard(g2);
            }
            else if (era == 3) {
                g2.setColor(terminalGreen);
                g2.setFont(terminal);
                sega = new Sega();
                sega.standard(g2);
            }
            else if (era == 4) {
                g2.setColor(cyan);
                g2.setFont(terminal);
                today = new HackathonQuestionsRyan();
                today.standard(g2);
            }
            super.paintComponent(g2);//allows for painting and
            repaint();
        }//close paint method

    }//close JPanel Class

    public static void pause(int time) {

        try //opens an exception handling statement
        {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }  //captures the exception

    }//close pause method

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_1) {
            era70s.keyPressed(e);
        }
        if (e.getKeyCode() == e.VK_2) {
            era70s.keyPressed(e);
        }
        if (e.getKeyCode() == e.VK_3) {
            era70s.keyPressed(e);
        }
        if (e.getKeyCode() == e.VK_4) {
            era70s.keyPressed(e);
        }
        if (e.getKeyCode() == e.VK_BACK_SPACE) {
            era70s.keyPressed(e);
        }
        if (e.getKeyCode() == e.VK_LEFT) {
            if (era == 2) {
                era80s = new TeenHack_Era2();
                era80s.keyPressed(e);
            }
            else if (era == 3) {
                sega = new Sega();
                sega.keyPressed(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_RIGHT) {
            if (era == 2) {
                era80s = new TeenHack_Era2();
                era80s.keyPressed(e);
            }
            else if (era == 3) {
                sega = new Sega();
                sega.keyPressed(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_UP) {
            if (era == 3) {
                sega = new Sega();
                sega.keyPressed(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            if (era == 3) {
                sega = new Sega();
                sega.keyPressed(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_SPACE) {
            if (era == 2) {
                era80s = new TeenHack_Era2();
                era80s.keyPressed(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_ENTER) {
            if (era == 1) {
                era70s = new QuizEra70s();
                era70s.keyPressed(e);
            }
            else if (era == 2) {
                era80s = new TeenHack_Era2();
                era80s.keyPressed(e);
            }
            else if (era == 3) {
                sega = new Sega();
                sega.keyPressed(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyPressed(e);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_LEFT) {
            if (era == 2) {
                era80s = new TeenHack_Era2();
                era80s.keyReleased(e);
            }
            else if (era == 3) {
                sega = new Sega();
                sega.keyReleased(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyReleased(e);
            }
        }
        if (e.getKeyCode() == e.VK_RIGHT) {
            if (era == 2) {
                era80s = new TeenHack_Era2();
                era80s.keyReleased(e);
            }
            else if (era == 3) {
                sega = new Sega();
                sega.keyReleased(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyReleased(e);
            }
        }
        if (e.getKeyCode() == e.VK_UP) {
            if (era == 3) {
                sega = new Sega();
                sega.keyReleased(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyReleased(e);
            }
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            if (era == 3) {
                sega = new Sega();
                sega.keyReleased(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyReleased(e);
            }
        }
        if (e.getKeyCode() == e.VK_ENTER) {
            if (era == 1) {
                era70s = new QuizEra70s();
                era70s.keyReleased(e);
            }
            else if (era == 3) {
                sega = new Sega();
                sega.keyReleased(e);
            }
            else if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyReleased(e);
            }
        }
        if (e.getKeyCode() == e.VK_SPACE) {
            if (era == 4) {
                today = new HackathonQuestionsRyan();
                today.keyReleased(e);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}//close program
