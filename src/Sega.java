
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GeoSonicDash
 */
public class Sega extends Alpha implements ActionListener, KeyListener {
    private static QuestionBank questionBank = new QuestionBank();
    private static int answerChoice = 1;
    private static int xPlane = 2000;
    private static Image background1 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 1.png");
    private static Image background2 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 2.png");
    private static Image background3 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 3.png");
    private static Image background4 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 4.png");
    private static Image background5 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 5.png");
    private static Image background6 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 6.png");
    private static Image background7 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 7.png");
    private static Image background8 = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Background 8.png");
    private static Image leftCorner = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Ground Left Corner.png");
    private static Image leftEdge = Toolkit.getDefaultToolkit().getImage("src\\resources\\HydroCity Ground Left Edge.png");
    private static Image waterfall = Toolkit.getDefaultToolkit().getImage("src\\resources\\Waterfall.gif");
    private static Image sonicVictory = Toolkit.getDefaultToolkit().getImage("src\\resources\\Sonic Victory.gif");
    private static Image earthwormBack1 = Toolkit.getDefaultToolkit().getImage("src\\resources\\JJ Background 1.png");
    private static Image earthwormBack2 = Toolkit.getDefaultToolkit().getImage("src\\resources\\JJ Background 2.png");
    private static Image earthwormBack3 = Toolkit.getDefaultToolkit().getImage("src\\resources\\JJ Background 3.png");
    private static Image earthwormMainBackground = Toolkit.getDefaultToolkit().getImage("src\\resources\\JJ Main Background.png");
    private static String answerString = "Hello";
    public void standard(Graphics2D g2) {
        drawBackground(g2);
        drawQuestion(g2);
        drawChoice1(g2);
        drawChoice2(g2);
        drawChoice3(g2);
        drawChoice4(g2);
        g2.drawString(""+answerChoice,300,300);
        g2.drawString(""+answerString,325,300);
        if(answerChoice == 1) {
            answerString = questionBank.era3Answer1(questionNumber-10);
        }
        else if(answerChoice == 1) {
            answerString = questionBank.era3Answer1(questionNumber-10);
        }
        else if(answerChoice == 2) {
            answerString = questionBank.era3Answer2(questionNumber-10);
        }
        else if(answerChoice == 3) {
            answerString = questionBank.era3Answer3(questionNumber-10);
        }
        else if(answerChoice == 4) {
            answerString = questionBank.era3Answer4(questionNumber-10);
        }

    }
    public void drawBackground(Graphics2D g2) {
        if(questionNumber == 10) {
            g2.drawImage(background1,0,0,384,384,this);
            g2.drawImage(background2,384,0,384,384,this);
            g2.drawImage(background3,768,0,384,384,this);
            g2.drawImage(background4,1152,0,384,384,this);
            g2.drawImage(background5,0,384,384,384,this);
            g2.drawImage(background6,384,384,384,384,this);
            g2.drawImage(background7,768,384,384,384,this);
            g2.drawImage(background8,1152,384,384,384,this);
            g2.drawImage(waterfall,1400,0,192,192,this);
            g2.drawImage(waterfall,1400,192,192,192,this);
            g2.drawImage(waterfall,1400,384,192,192,this);
            g2.drawImage(leftCorner,1152,576,384,192,this);
            g2.drawImage(leftEdge,1152,768,384,192,this);
            g2.drawImage(sonicVictory,1152,372,288,288,this);
        }
        else if(questionNumber == 11) {
            Image earthwormJim = Toolkit.getDefaultToolkit().getImage("src\\resources\\Earthworm Jim.gif");
            g2.drawImage(earthwormMainBackground,0,0,1920,1080,this);
            g2.drawImage(earthwormBack1,0,400,615,615,this);
            g2.drawImage(earthwormBack2,615,335,780,684,this);
            g2.drawImage(earthwormBack3,1395,335,606,684,this);
            g2.drawImage(earthwormJim,325,450,400,200,this);
        }
        else if(questionNumber == 12) {
            Image treeBackground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Tree Background.png");
            Image treeTrunk = Toolkit.getDefaultToolkit().getImage("src\\resources\\Tree Trunk.png");
            Image marioGround = Toolkit.getDefaultToolkit().getImage("src\\resources\\Mario Ground.png");
            Image nightBackground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Night Background.png");
            g2.drawImage(nightBackground,0,0,768,711,this);
            g2.drawImage(nightBackground,768,0,768,711,this);
            g2.drawImage(treeTrunk,-50,0,200,600,this); 
            g2.drawImage(treeTrunk,-50,600,200,600,this); 
            g2.drawImage(treeTrunk,768,0,200,600,this); 
            g2.drawImage(treeTrunk,768,600,200,600,this); 
            g2.drawImage(treeTrunk,300,0,200,600,this); 
            g2.drawImage(treeTrunk,300,600,200,600,this);
            g2.drawImage(treeTrunk,1200,0,200,600,this); 
            g2.drawImage(treeTrunk,1200,600,200,600,this);
            g2.drawImage(treeBackground,768,0,768,288,this);
            g2.drawImage(treeBackground,0,0,768,288,this);
            for(int i = 0; i < 7;i++) {
                g2.drawImage(marioGround,-50+(i*480),700,480,192,this);    
            }
              
        }
        else if(questionNumber == 13) {
            Image shore = Toolkit.getDefaultToolkit().getImage("src\\resources\\Shore.gif");
            Image background = Toolkit.getDefaultToolkit().getImage("src\\resources\\MS3 Background.png");
            Image background2 = Toolkit.getDefaultToolkit().getImage("src\\resources\\MS3 Background 2.png");
            Image marco = Toolkit.getDefaultToolkit().getImage("src\\resources\\Marco Shooting.gif");
            Image rebel = Toolkit.getDefaultToolkit().getImage("src\\resources\\Rebel Soldier Stand.png");
            Image plane = Toolkit.getDefaultToolkit().getImage("src\\resources\\Airplane.png");
            g2.drawImage(background,0,0,936,600,this);
            g2.drawImage(shore,0,600,2115,195,this);
            g2.drawImage(background2,936,0,936,600,this);
            g2.drawImage(marco,400,500,200,148,this);
            g2.drawImage(rebel,150,500,108,152,this);
            g2.drawImage(plane,xPlane,100,320,152,this);
            xPlane-=5;
            if(xPlane < -500) {
                xPlane = 2000;
            }
        }
        else if(questionNumber == 14){
            Image crowd = Toolkit.getDefaultToolkit().getImage("src\\resources\\The Arena.gif");
            Image foreground = Toolkit.getDefaultToolkit().getImage("src\\resources\\The Arena Foreground.png");
            Image kirbySleep = Toolkit.getDefaultToolkit().getImage("src\\resources\\Kirby Sleep.gif");
            Image thief = Toolkit.getDefaultToolkit().getImage("src\\resources\\Thief Surprised.png");
            g2.drawImage(crowd,-200,0,1920,525,this);
            g2.drawImage(foreground,-200,250,1920,550,this);
            g2.drawImage(kirbySleep,300,500,250,184,this);
            g2.drawImage(thief,1200,500,250,184,this);
        }
    }
    public void drawQuestion(Graphics2D g2) {
        String test = questionBank.era3Questions(questionNumber-10);
        String temp[] = test.split("");
        ArrayList<String> arrayListOfLetters = new ArrayList<String>(); 
        ArrayList<Image> arrayListOfImages = new ArrayList<Image>(); 
        for(int i = 0; i < temp.length; i++) {
            arrayListOfLetters.add(temp[i]);
        }
        for(int i = 0; i < arrayListOfLetters.size(); i++) {
            if(arrayListOfLetters.get(i).equals("A")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\A.png"));      
            }
            else if(arrayListOfLetters.get(i).equals("B")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\B.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("C")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\C.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("D")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\D.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("E")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\E.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("F")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\F.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("G")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\G.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("H")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\H.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("I")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("J")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\J.png"));               
            }          
            else if(arrayListOfLetters.get(i).equals("K")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\K.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("L")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\L.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("M")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\M.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("N")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\N.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("O")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\O.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("P")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\P.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Q")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Q.png"));              
            }          
            else if(arrayListOfLetters.get(i).equals("R")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\R.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("S")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\S.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("T")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\T.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("U")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\U.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("V")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\V.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("W")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\W.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("X")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\X.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Y")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Y.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("Z")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Z.png"));           
            }
            else if(arrayListOfLetters.get(i).equals(" ")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Blank.png"));             
            }
        }
        for(int i = 0; i < arrayListOfImages.size(); i++) {
            int iCounter = 0;
            for(int j = 0; j < i;j++) {
                if(arrayListOfImages.get(j).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    iCounter++;    
                }             
            }
            if(i < 17) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 150+(i*64)-(iCounter*36),75, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 150+(i*64)-(iCounter*36),75, 28,64,this);   
                }   
                iCounter = 0;
            }
            else if(i >= 17 && i < 34) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 150+((i-16)*64)-(iCounter*36),139, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 150+((i-16)*64)-(iCounter*36),139, 28,64,this);   
                }   
                iCounter = 0;    
            }
            else if(i >= 34 && i < 51) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 150+((i-33)*64)-(iCounter*36), 203, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 150+((i-33)*64)-(iCounter*36), 203, 28,64,this);   
                }   
                iCounter = 0;    
            }
        }
    }
    public void drawChoice1(Graphics2D g2) {
        String test = questionBank.era3Answer1(questionNumber-10);
        String temp[] = test.split("");
        ArrayList<String> arrayListOfLetters = new ArrayList<String>(); 
        ArrayList<Image> arrayListOfImages = new ArrayList<Image>(); 
        for(int i = 0; i < temp.length; i++) {
            arrayListOfLetters.add(temp[i]);
        }
        for(int i = 0; i < arrayListOfLetters.size(); i++) {
            if(arrayListOfLetters.get(i).equals("A")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\A.png"));      
            }
            else if(arrayListOfLetters.get(i).equals("B")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\B.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("C")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\C.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("D")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\D.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("E")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\E.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("F")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\F.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("G")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\G.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("H")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\H.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("I")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("J")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\J.png"));               
            }          
            else if(arrayListOfLetters.get(i).equals("K")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\K.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("L")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\L.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("M")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\M.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("N")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\N.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("O")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\O.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("P")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\P.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Q")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Q.png"));              
            }          
            else if(arrayListOfLetters.get(i).equals("R")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\R.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("S")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\S.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("T")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\T.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("U")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\U.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("V")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\V.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("W")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\W.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("X")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\X.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Y")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Y.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("Z")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Z.png"));           
            }
            else if(arrayListOfLetters.get(i).equals(" ")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Blank.png"));             
            }
        }
        for(int i = 0; i < arrayListOfImages.size(); i++) {
            int iCounter = 0;
            for(int j = 0; j < i;j++) {
                if(arrayListOfImages.get(j).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    iCounter++;    
                }             
            }
            if(i < 10) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+(i*64)-(iCounter*36), 400, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+(i*64)-(iCounter*36), 400, 28,64,this);   
                }   
                iCounter = 0;
            }
            else if(i >= 10 && i < 20) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-9)*64)-(iCounter*36), 464, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-9)*64)-(iCounter*36), 464, 28,64,this);   
                }   
                iCounter = 0;    
            }
            else if(i >= 20 && i < 30) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-19)*64)-(iCounter*36), 528, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-19)*64)-(iCounter*36), 528, 28,64,this);   
                }   
                iCounter = 0;    
            }
        }
    }
    public void drawChoice2(Graphics2D g2) {
        String test = questionBank.era3Answer2(questionNumber-10);
        String temp[] = test.split("");
        ArrayList<String> arrayListOfLetters = new ArrayList<String>(); 
        ArrayList<Image> arrayListOfImages = new ArrayList<Image>(); 
        for(int i = 0; i < temp.length; i++) {
            arrayListOfLetters.add(temp[i]);
        }
        for(int i = 0; i < arrayListOfLetters.size(); i++) {
            if(arrayListOfLetters.get(i).equals("A")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\A.png"));      
            }
            else if(arrayListOfLetters.get(i).equals("B")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\B.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("C")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\C.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("D")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\D.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("E")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\E.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("F")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\F.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("G")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\G.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("H")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\H.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("I")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("J")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\J.png"));               
            }          
            else if(arrayListOfLetters.get(i).equals("K")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\K.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("L")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\L.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("M")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\M.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("N")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\N.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("O")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\O.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("P")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\P.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Q")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Q.png"));              
            }          
            else if(arrayListOfLetters.get(i).equals("R")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\R.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("S")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\S.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("T")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\T.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("U")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\U.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("V")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\V.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("W")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\W.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("X")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\X.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Y")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Y.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("Z")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Z.png"));           
            }
            else if(arrayListOfLetters.get(i).equals(" ")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Blank.png"));             
            }
        }
        for(int i = 0; i < arrayListOfImages.size(); i++) {
            int iCounter = 0;
            for(int j = 0; j < i;j++) {
                if(arrayListOfImages.get(j).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    iCounter++;    
                }             
            }
            if(i < 10) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+(i*64)-(iCounter*36), 400, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+(i*64)-(iCounter*36), 400, 28,64,this);   
                }   
                iCounter = 0;
            }
            else if(i >= 10 && i < 20) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-10)*64)-(iCounter*36), 464, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-10)*64)-(iCounter*36), 464, 28,64,this);   
                }   
                iCounter = 0;    
            }
            else if(i >= 20 && i < 30) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-19)*64)-(iCounter*36), 528, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-19)*64)-(iCounter*36), 528, 28,64,this);   
                }   
                iCounter = 0;    
            }
        }
    }
    public void drawChoice3(Graphics2D g2) {
        String test = questionBank.era3Answer3(questionNumber-10);
        String temp[] = test.split("");
        ArrayList<String> arrayListOfLetters = new ArrayList<String>(); 
        ArrayList<Image> arrayListOfImages = new ArrayList<Image>(); 
        for(int i = 0; i < temp.length; i++) {
            arrayListOfLetters.add(temp[i]);
        }
        for(int i = 0; i < arrayListOfLetters.size(); i++) {
            if(arrayListOfLetters.get(i).equals("A")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\A.png"));      
            }
            else if(arrayListOfLetters.get(i).equals("B")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\B.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("C")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\C.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("D")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\D.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("E")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\E.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("F")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\F.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("G")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\G.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("H")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\H.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("I")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("J")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\J.png"));               
            }          
            else if(arrayListOfLetters.get(i).equals("K")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\K.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("L")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\L.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("M")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\M.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("N")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\N.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("O")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\O.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("P")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\P.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Q")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Q.png"));              
            }          
            else if(arrayListOfLetters.get(i).equals("R")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\R.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("S")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\S.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("T")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\T.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("U")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\U.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("V")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\V.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("W")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\W.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("X")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\X.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Y")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Y.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("Z")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Z.png"));           
            }
            else if(arrayListOfLetters.get(i).equals(" ")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Blank.png"));             
            }
        }
        for(int i = 0; i < arrayListOfImages.size(); i++) {
            int iCounter = 0;
            for(int j = 0; j < i;j++) {
                if(arrayListOfImages.get(j).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    iCounter++;    
                }             
            }
            if(i < 10) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+(i*64)-(iCounter*36), 600, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+(i*64)-(iCounter*36), 600, 28,64,this);   
                }   
                iCounter = 0;
            }
            else if(i >= 10 && i < 20) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-10)*64)-(iCounter*36), 664, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-10)*64)-(iCounter*36), 664, 28,64,this);   
                }   
                iCounter = 0;    
            }
            else if(i >= 20 && i < 30) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-19)*64)-(iCounter*36), 728, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 100+((i-19)*64)-(iCounter*36), 728, 28,64,this);   
                }   
                iCounter = 0;    
            }
        }
    }
    public void drawChoice4(Graphics2D g2) {
        String test = questionBank.era3Answer4(questionNumber-10);
        String temp[] = test.split("");
        ArrayList<String> arrayListOfLetters = new ArrayList<String>(); 
        ArrayList<Image> arrayListOfImages = new ArrayList<Image>(); 
        for(int i = 0; i < temp.length; i++) {
            arrayListOfLetters.add(temp[i]);
        }
        for(int i = 0; i < arrayListOfLetters.size(); i++) {
            if(arrayListOfLetters.get(i).equals("A")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\A.png"));      
            }
            else if(arrayListOfLetters.get(i).equals("B")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\B.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("C")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\C.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("D")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\D.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("E")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\E.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("F")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\F.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("G")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\G.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("H")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\H.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("I")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("J")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\J.png"));               
            }          
            else if(arrayListOfLetters.get(i).equals("K")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\K.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("L")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\L.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("M")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\M.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("N")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\N.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("O")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\O.png"));              
            }
            else if(arrayListOfLetters.get(i).equals("P")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\P.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Q")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Q.png"));              
            }          
            else if(arrayListOfLetters.get(i).equals("R")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\R.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("S")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\S.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("T")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\T.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("U")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\U.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("V")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\V.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("W")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\W.png"));               
            }
            else if(arrayListOfLetters.get(i).equals("X")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\X.png"));                
            }
            else if(arrayListOfLetters.get(i).equals("Y")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Y.png"));            
            }
            else if(arrayListOfLetters.get(i).equals("Z")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Z.png"));           
            }
            else if(arrayListOfLetters.get(i).equals(" ")) {
                arrayListOfImages.add(Toolkit.getDefaultToolkit().getImage("src\\resources\\Blank.png"));             
            }
        }
        for(int i = 0; i < arrayListOfImages.size(); i++) {
            int iCounter = 0;
            for(int j = 0; j < i;j++) {
                if(arrayListOfImages.get(j).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    iCounter++;    
                }             
            }
            if(i < 10) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+(i*64)-(iCounter*36), 600, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+(i*64)-(iCounter*36), 600, 28,64,this);   
                }   
                iCounter = 0;
            }
            else if(i >= 10 && i < 20) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-10)*64)-(iCounter*36), 664, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-10)*64)-(iCounter*36), 664, 28,64,this);   
                }   
                iCounter = 0;    
            }
            else if(i >= 20 && i < 30) {
                if(!arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-19)*64)-(iCounter*36), 728, 64,64,this);   
                }
                else if(arrayListOfImages.get(i).equals(Toolkit.getDefaultToolkit().getImage("src\\resources\\I.png"))) {
                    g2.drawImage(arrayListOfImages.get(i), 800+((i-19)*64)-(iCounter*36), 728, 28,64,this);   
                }   
                iCounter = 0;    
            }
        }
    }    
    public void keyPressed(KeyEvent e) {
        if((e.getKeyCode() == e.VK_RIGHT && answerChoice == 1) || (e.getKeyCode() == e.VK_RIGHT && answerChoice == 3)) {
            answerChoice++;
        }     
        if((e.getKeyCode() == e.VK_LEFT && answerChoice == 2) || (e.getKeyCode() == e.VK_LEFT && answerChoice == 4)) {
            answerChoice--; 
        } 
        if((e.getKeyCode() == e.VK_DOWN && answerChoice == 1) || (e.getKeyCode() == e.VK_DOWN && answerChoice == 2)) {
            answerChoice+=2;
        } 
        if((e.getKeyCode() == e.VK_UP && answerChoice == 3) || (e.getKeyCode() == e.VK_UP && answerChoice == 4)) {
            answerChoice-=2;
        } 
        if(e.getKeyCode() == e.VK_ENTER) {
            if(answerString.equals("CALIFORNIA") && questionNumber == 10) {
                questionNumber++;
            }
            else if(answerString.equals("NINE") && questionNumber == 11) {
                questionNumber++;
            }
            else if(answerString.equals("MAGIC MUSHROOM") && questionNumber == 12) {
                questionNumber++;
            }
            else if(answerString.equals("SHOTGUN") && questionNumber == 13) {
                questionNumber++;
            }
            else if(answerString.equals("GUN") && questionNumber == 14) {
                Music.runEra3Theme(0,0);
                Music.runEra4Theme(1,0);
                era = 4;
                questionNumber++;
            }
        }
    }
    public void keyReleased(KeyEvent e) {
        
    }
}
