package game;

//Add Title screen, update screen (Sans fight),
/**
 *
 * @author Ryan San Jose
 */
import java.awt.Graphics2D;
import java.awt.*;//needed for graphics
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HackathonQuestionsRyan extends Alpha implements KeyListener, ActionListener {
    private static Image Rhydon;
    private static Image Bulbasaur;
    private static Image Mew;
    private static Image Arceus;
    private static Image Blackhole;
    private static int selectedanswer = 1;
    private static int userChoice = selectedanswer;
    private QuestionBank qb = new QuestionBank();
    private String answer;
    public Minigame sans;
    private boolean sanshahatime = false;
    private static Image caves;

    public void standard(Graphics2D g2) {
        sans = new Minigame();
        caves = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\MinecraftCave.png");
        Rhydon = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Rhydon.png");
        Bulbasaur = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Bulbasaur.png");
        Mew = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Mew.png");
        Arceus = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Arceus.png");
        Blackhole = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Blackhole.jpg");
        g2.drawImage(caves, 0, 0, 2304, 1440, this);
        g2.setColor(Color.cyan);
        Font font = new Font("Serif", 35, 35);
        g2.setFont(font);
        if (questionNumber == 19) {
            sans.badtime(g2);
        }
        else {
            qb = new QuestionBank();
            drawQuestion(g2);
            drawAnswer1(g2);
            drawAnswer2(g2);
            drawAnswer3(g2);
            drawAnswer4(g2);
            //This is after the drawAnswer things
            if (questionNumber == 15) {
                g2.drawImage(Blackhole, 545, 250, 240, 300, this);
            }
            if (selectedanswer == 1 && questionNumber == 18) {
                g2.drawImage(Rhydon, 545, 250, 240, 300, this);
            }
            else if (selectedanswer == 2 && questionNumber == 18) {
                g2.drawImage(Bulbasaur, 545, 250, 240, 300, this);
            }
            else if (selectedanswer == 3 && questionNumber == 18) {
                g2.drawImage(Mew, 545, 250, 240, 300, this);
            }
            else if (selectedanswer == 4 && questionNumber == 18) {
                g2.drawImage(Arceus, 545, 250, 240, 300, this);
            }

        }

    }

    public void drawQuestion(Graphics2D g2) {
        if (questionNumber == 15) {
            g2.drawString(qb.era4Questions(questionNumber - 15), 350, 40);
        }
        else if (questionNumber == 16) {
            g2.drawString(qb.era4Questions(questionNumber - 15), 350, 40);
        }
        else if (questionNumber == 17) {
            g2.drawString(qb.era4Questions(questionNumber - 15), 350, 40);
        }
        else if (questionNumber == 18) {
            g2.drawString(qb.era4Questions(questionNumber - 15), 350, 40);
        }

    }

    public void drawAnswer1(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(90, 250, 450, 100);
        if (selectedanswer == 1) {
            g2.setColor(Color.green);
        }
        else {
            g2.setColor(Color.red);
        }
        g2.drawRect(90, 250, 450, 100);
        if (questionNumber == 15) {
            g2.drawString(qb.era4Answer1(questionNumber - 15), 100, 300);
        }
        else if (questionNumber == 16) {
            g2.drawString(qb.era4Answer1(questionNumber - 15), 100, 300);
        }
        else if (questionNumber == 17) {
            g2.drawString(qb.era4Answer1(questionNumber - 15), 100, 300);
        }
        else if (questionNumber == 18) {
            g2.drawString(qb.era4Answer1(questionNumber - 15), 100, 300);
        }
    }

    public void drawAnswer2(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(790, 250, 450, 100);
        if (selectedanswer == 2) {
            g2.setColor(Color.green);
        }
        else {
            g2.setColor(Color.red);
        }
        g2.drawRect(790, 250, 450, 100);
        if (questionNumber == 15) {
            g2.drawString(qb.era4Answer2(questionNumber - 15), 800, 300);
        }
        else if (questionNumber == 16) {
            g2.drawString(qb.era4Answer2(questionNumber - 15), 800, 300);
        }
        else if (questionNumber == 17) {
            g2.drawString(qb.era4Answer2(questionNumber - 15), 800, 300);
        }
        else if (questionNumber == 18) {
            g2.drawString(qb.era4Answer2(questionNumber - 15), 800, 300);
        }
    }

    public void drawAnswer3(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(90, 450, 450, 100);
        if (selectedanswer == 3) {
            g2.setColor(Color.green);
        }
        else {
            g2.setColor(Color.red);
        }
        g2.drawRect(90, 450, 450, 100);
        if (questionNumber == 15) {
            g2.drawString(qb.era4Answer3(questionNumber - 15), 100, 500);
        }
        else if (questionNumber == 16) {
            g2.drawString(qb.era4Answer3(questionNumber - 15), 100, 500);
        }
        else if (questionNumber == 17) {
            g2.drawString(qb.era4Answer3(questionNumber - 15), 100, 500);
        }
        else if (questionNumber == 18) {
            g2.drawString(qb.era4Answer3(questionNumber - 15), 100, 500);
        }
    }

    public void drawAnswer4(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(790, 450, 450, 100);
        if (selectedanswer == 4) {
            g2.setColor(Color.green);
        }
        else {
            g2.setColor(Color.red);
        }
        g2.drawRect(790, 450, 450, 100);
        if (questionNumber == 15) {
            g2.drawString(qb.era4Answer4(questionNumber - 15), 800, 500);
        }
        else if (questionNumber == 16) {
            g2.drawString(qb.era4Answer4(questionNumber - 15), 800, 500);
        }
        else if (questionNumber == 17) {
            g2.drawString(qb.era4Answer4(questionNumber - 15), 800, 500);
        }
        else if (questionNumber == 18) {
            g2.drawString(qb.era4Answer4(questionNumber - 15), 800, 500);
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_LEFT) {
            if (selectedanswer == 2) {
                selectedanswer = 1;
                userChoice = 1;
            }
            if (selectedanswer == 4) {
                selectedanswer = 3;
                userChoice = 3;
            }
            if (questionNumber == 19) {
                sans = new Minigame();
                sans.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_RIGHT) {
            if (selectedanswer == 1) {
                selectedanswer = 2;
                userChoice = 2;
            }
            if (selectedanswer == 3) {
                selectedanswer = 4;
                userChoice = 4;
            }
            if (questionNumber == 19) {
                sans = new Minigame();
                sans.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_UP) {
            if (selectedanswer == 3) {
                selectedanswer = 1;
                userChoice = 1;
            }
            if (selectedanswer == 4) {
                selectedanswer = 2;
                userChoice = 2;
            }
            if (questionNumber == 19) {
                sans = new Minigame();
                sans.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            if (selectedanswer == 2) {
                selectedanswer = 4;
                userChoice = 4;
            }
            if (selectedanswer == 1) {
                selectedanswer = 3;
                userChoice = 3;
            }
            if (questionNumber == 19) {
                sans = new Minigame();
                sans.keyPressed(e);
            }
        }
        if (e.getKeyCode() == e.VK_ENTER) {
            if (userChoice == 1) {
                answer = qb.era4Answer1(questionNumber - 15);
            }
            else if (userChoice == 2) {
                answer = qb.era4Answer2(questionNumber - 15);
            }
            else if (userChoice == 3) {
                answer = qb.era4Answer3(questionNumber - 15);
            }
            else if (userChoice == 4) {
                answer = qb.era4Answer4(questionNumber - 15);
            }
            System.out.println(answer);
            if (answer.equals("5 PB") && questionNumber == 15) {
                questionNumber++;
                selectedanswer = 1;
                userChoice = 1;
            }
            else if (answer.equals("30 Million+, Dota 2") && questionNumber == 16) {
                questionNumber++;
                selectedanswer = 1;
                userChoice = 1;
            }
            else if (answer.equals("Pig") && questionNumber == 17) {
                questionNumber++;
                selectedanswer = 1;
                userChoice = 1;
            }
            else if (answer.equals("Rhydon") && questionNumber == 18) {
                questionNumber++;
                selectedanswer = 1;
                userChoice = 1;
            }
            else {
                System.exit(0);
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_LEFT) {
            sans = new Minigame();
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_RIGHT) {
            sans = new Minigame();
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            sans = new Minigame();
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_UP) {
            sans = new Minigame();
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_SPACE) {
            sans = new Minigame();
            sans.keyReleased(e);
        }
    }

    public void actionPerformed(ActionEvent e) {

    }
}
