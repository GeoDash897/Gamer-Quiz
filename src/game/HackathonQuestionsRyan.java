package game;

//Add Title screen, update screen (Sans fight),
import java.awt.Graphics2D;
import java.awt.*;//needed for graphics
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**This class tests the player about video game culture from the modern era (2000s to today).
 * It also manages the final boss fight minigame at the end of the quiz.
 * 
 * @author Ryan San Jose
 */
public class HackathonQuestionsRyan extends Alpha implements KeyListener, ActionListener {
    private static int selectedanswer = 1;
    private static int userChoice = selectedanswer;
    private boolean sanshahatime = false;
    private String answer;
    private static Image caves;
    private static Image Rhydon;
    private static Image Bulbasaur;
    private static Image Mew;
    private static Image Arceus;
    private static Image Blackhole;
    public Minigame sans;
    private QuestionBank qb;
    
    public HackathonQuestionsRyan() {
        //Creates Minigame class- used to manage the final boss manage   
        sans = new Minigame();
        qb = new QuestionBank();
        caves = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\MinecraftCave.png");
        Rhydon = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Rhydon.png");
        Bulbasaur = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Bulbasaur.png");
        Mew = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Mew.png");
        Arceus = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Arceus.png");
        Blackhole = Toolkit.getDefaultToolkit().getImage("src\\game\\resources\\Blackhole.jpg");
    }
    
    /**Runs main logic of class.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void standard(Graphics2D g2) {
        
        g2.drawImage(caves, 0, 0, 2304, 1440, this);
        g2.setColor(Color.cyan);
        Font font = new Font("Serif", 35, 35);
        g2.setFont(font);
        if (questionNumber == 19) {
            sans.badtime(g2);
        }
        else {
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
    
    /**Draws the current question on screen.
    * 
    * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
    */
    public void drawQuestion(Graphics2D g2) {
        if (questionNumber == 15) {
            g2.drawString((questionNumber+1)+". "+qb.era4Questions(questionNumber - 15), 350, 40);
        }
        else if (questionNumber == 16) {
            g2.drawString((questionNumber+1)+". "+qb.era4Questions(questionNumber - 15), 100, 40);
        }
        else if (questionNumber == 17) {
            g2.drawString((questionNumber+1)+". "+qb.era4Questions(questionNumber - 15), 350, 40);
        }
        else if (questionNumber == 18) {
            g2.drawString((questionNumber+1)+". "+qb.era4Questions(questionNumber - 15), 350, 40);
        }

    }

    /*Looking back, these drawing methods could have been programmed better to avoid repetition.*/
    
    /**Draws the first answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
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

    /**Draws the second answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
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

    /**Draws the third answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
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

    /**Draws the fourth answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
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

    /*Controls input for selecting the answer choices
    Note!- If the question is 19, it sends the input to the Minigame class*/
    
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
        }
    }

    //Sends releasing input to the Minigame class
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_LEFT) {
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_RIGHT) {
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_UP) {
            sans.keyReleased(e);
        }
        if (e.getKeyCode() == e.VK_SPACE) {
            sans.keyReleased(e);
        }
    }

    public void actionPerformed(ActionEvent e) {

    }
}
