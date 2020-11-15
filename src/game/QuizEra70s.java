package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.*;
import java.util.stream.Collectors;

/**
 * This class quizzes users on machines and subcultures in the 1970s.
 * @author Wahub Ahmed
 */
public class QuizEra70s extends Alpha implements KeyListener {

    private Dimension screenSize;
    private int width;
    private int height;

    private static int xFlicker;
    private static int yFlicker;
    private static int blinkTimer;
    private static int timer;
    private static boolean postBootUp;

    private static QuestionBank qb;
    private static ArrayList<String> userResponse;
    private static ArrayList<String> correctAnswer;
    
    public QuizEra70s() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int) screenSize.getWidth();
        height = (int) screenSize.getHeight();
        xFlicker = 0;
        yFlicker = -400;
        blinkTimer = 0;
        postBootUp = false;
        timer = 0;
        qb = new QuestionBank();
        userResponse = new ArrayList<String>();
        correctAnswer = new ArrayList<String>();             
    }
    
    /**Runs main logic of class.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void standard(Graphics2D g2) {
        flicker(g2);
        if (postBootUp == false) {
            bootUpScreen(g2);
        }
        else if (postBootUp == true) {
            drawQuestion(g2);
            drawAnswerChoice1(g2);
            drawAnswerChoice2(g2);
            drawAnswerChoice3(g2);
            drawAnswerChoice4(g2);
            correctAnswerChoices(g2);
            userResponse(g2);
        }
    }

    public static void pause(int time) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    /**Runs logic for moving and drawing transparent green scan lines along the screen to simulate
     * a CRT monitor effect.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void flicker(Graphics2D g2) {
        //Note that this logic is equal to height + (height/4)
        if (yFlicker <= height + height / 4) {
            yFlicker += 5;
        }
        else if (yFlicker > height + height / 4) {
            yFlicker = -400;
        }
        Color tranparentGreen = new Color(0f, 1f, 0f, .5f);
        g2.setColor(tranparentGreen);
        g2.fillRect(xFlicker, yFlicker, width, height / 4);
        Color yeet = new Color(0.4f, 0.7f, 0.4f, 1f);
        g2.setColor(yeet);
        /*Transparent green is drawn behind the moving lines
        Draw individual green lines that move along the screen to simulate CRT scan lines
        Note that lines are semi-transparent in order to allow player to see through lines
        (actually read the text)*/
        g2.fillRect(xFlicker, yFlicker, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 20, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 40, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 60, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 80, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 100, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 120, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 140, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 160, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 180, width, height / 128);
        g2.fillRect(xFlicker, yFlicker + 200, width, height / 128);
        g2.setColor(terminalGreen);
    }

    /**Controls start up sequence prior to revealing the first question.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void bootUpScreen(Graphics2D g2) {
        g2.setColor(terminalGreen);
        timer++;
        if (timer > 200) {
            g2.drawString("Booting System/370...", 25, 25);
        }
        if (timer > 600) {
            g2.drawString("Implementing Memory Model...", 25, 50);
        }
        if (timer > 800) {
            g2.drawString("Obtaining TCP connection to RewindTime...", 25, 75);
        }
        if (timer > 1100) {
            g2.drawString("Compiling the modules...Done!", 25, 100);
        }
        if (timer > 1150) {
            g2.drawString("***IBM Inc.***", 25, 125);
        }
        if (timer > 1300) {
            Music.runEra1Theme(1, 0);
            postBootUp = true;
            timer = 0;
        }

    }

    /**Draws the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void drawQuestion(Graphics2D g2) {
        g2.drawString(qb.era1Questions(questionNumber), 100, 100);
    }

    /**Draws the first answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void drawAnswerChoice1(Graphics2D g2) {
        g2.drawString("1. " + qb.era1Answer1(questionNumber), 100, 125);
    }

    /**Draws the second answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void drawAnswerChoice2(Graphics2D g2) {
        g2.drawString("2. " + qb.era1Answer2(questionNumber), 100, 150);
    }

    /**Draws the third answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void drawAnswerChoice3(Graphics2D g2) {
        g2.drawString("3. " + qb.era1Answer3(questionNumber), 100, 175);
    }

    /**Draws the fourth answer choice for the current question on screen.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void drawAnswerChoice4(Graphics2D g2) {
        g2.drawString("4. " + qb.era1Answer4(questionNumber), 100, 200);
    }

    /**Adds the correct answers to the correctAnswers ArrayList- comes from
     * the {@linkplain game.QuestionBank QuestionBank} class.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void correctAnswerChoices(Graphics2D g2) {
        correctAnswer.add(qb.era1Answer2(0));
        correctAnswer.add(qb.era1Answer1(1));
        correctAnswer.add(qb.era1Answer4(2));
        correctAnswer.add(qb.era1Answer3(3));
        correctAnswer.add(qb.era1Answer4(4));
    }

    /**Draws the player's response on the screen (simulates typing in command prompt)
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void userResponse(Graphics2D g2) {
        g2.drawString("C:\\\\", 25, 250);
        for (int i = 0; i < userResponse.size(); i++) {
            g2.drawString(userResponse.get(i), 100 + (i * 20), 250);
        }
        blinkTimer++;
        if (blinkTimer < 100) {
            g2.fillRect((userResponse.size() * 20) + 100, 227, 25, 25);
        }
        else if (blinkTimer >= 200) {
            blinkTimer = 0;
        }
    }

    /**Unfinished method; was supposed to create a glitch effect that would
     * move along the screen during a timed question (also not added) - covering it in the process.
     * 
     * @param g2 {@linkplain java.awt.Graphics2D Graphics2D} object used for painting.
     */
    public void glitch(Graphics2D g2) {
        int countDown;
        int xGlitch = 0;
        int yGlitch = 0;
        int glitchWidth = (int) (Math.random() * 25) + 1;
        int glitchLength = (int) (Math.random() * 25) + 1;
        g2.fillRect(0, 0, glitchWidth, glitchLength);
        for (countDown = 0; countDown <= 10; countDown++) {
            g2.drawString("Error: Cache Overflow", 25, 25);
            xGlitch += 25;
            yGlitch += 25;
        }
        if (countDown > 10) {
            System.exit(0);
        }
    }

    //checkfor key type
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_1) {
            userResponse.add("1");
        }
        if (e.getKeyCode() == e.VK_2) {
            userResponse.add("2");
        }
        if (e.getKeyCode() == e.VK_3) {
            userResponse.add("3");
        }
        if (e.getKeyCode() == e.VK_4) {
            userResponse.add("4");
        }
        if (e.getKeyCode() == e.VK_BACK_SPACE) {
            if (userResponse.size() > 0) {
                userResponse.remove(userResponse.size() - 1);
            }
        }
        if (e.getKeyCode() == e.VK_ENTER) {
            String array[] = new String[userResponse.size()];
            for (int j = 0; j < userResponse.size(); j++) {
                array[j] = userResponse.get(j);
            }
            String userString = userResponse.stream().collect(Collectors.joining(""));
            //String concatResponse = userResponse.get(1).concat(userResponse.get(0));
            if (questionNumber == 0 && userString == "2") {
                questionNumber++;
                userResponse.clear();
            }
            if (questionNumber == 1 && userString == "1") {
                questionNumber++;
                userResponse.clear();
            }
            if (questionNumber == 2 && userString == "4") {
                questionNumber++;
                userResponse.clear();
            }
            if (questionNumber == 3 && userString == "3") {
                questionNumber++;
                userResponse.clear();
            }
            if (questionNumber == 4 && userString == "2") {
                Music.runEra1Theme(0, 0);
                Music.runEra2Theme(1, 0);
                era = 2;
                questionNumber++;
            }

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
