package game;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author GeoSonicDash
 */
public class Music {
    private static Clip era1Theme;
    private static Clip era2Theme;
    private static Clip era3Theme;
    private static Clip era4Theme;

    public static void standard() {
        loadEra1Theme();
        loadEra2Theme();
        loadEra3Theme();
        loadEra4Theme();
    }

    public static void loadEra1Theme() {
        try {
            File musicPath = new File("src\\game\\resources\\music files\\Era1Music.wav");//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            era1Theme = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            era1Theme.open(audioInput);//opens music
            /*FloatControl gainControl = (FloatControl) era1Theme.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
            gainControl.setValue(60.0f); // Reduce volume by 30 decibels.﻿*/
            Thread.sleep(300);//stops thread (that is created by the clip class)
            //from killing its self (and the music) as it immediately starts        
        } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
        }
    }

    public static void loadEra2Theme() {
        try {
            File musicPath = new File("src\\game\\resources\\music files\\Era2Music.wav");//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            era2Theme = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            era2Theme.open(audioInput);//opens music
            /*FloatControl gainControl = (FloatControl) era3Theme.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
            gainControl.setValue(-80.0f); // Reduce volume by 30 decibels.﻿*/
            Thread.sleep(300);//stops thread (that is created by the clip class)
            //from killing its self (and the music) as it immediately starts        
        } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
        }
    }

    public static void loadEra3Theme() {
        try {
            File musicPath = new File("src\\game\\resources\\music files\\Era3Music.wav");//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            era3Theme = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            era3Theme.open(audioInput);//opens music
            /*FloatControl gainControl = (FloatControl) era2Theme.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
            gainControl.setValue(-80.0f); // Reduce volume by 30 decibels.﻿*/
            Thread.sleep(300);//stops thread (that is created by the clip class)
            //from killing its self (and the music) as it immediately starts        
        } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
        }
    }

    public static void loadEra4Theme() {
        try {
            File musicPath = new File("src\\game\\resources\\music files\\Era4Music.wav");//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            era4Theme = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            era4Theme.open(audioInput);//opens music
            /*FloatControl gainControl = (FloatControl) era2Theme.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
            gainControl.setValue(-80.0f); // Reduce volume by 30 decibels.﻿*/
            Thread.sleep(300);//stops thread (that is created by the clip class)
            //from killing its self (and the music) as it immediately starts        
        } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
        }
    }

    public static void runEra1Theme(int start, int setPosition) {
        if (start == 0) {
            era1Theme.stop();
        }
        else if (start == 1) {
            if (setPosition == 0) {
                era1Theme.setMicrosecondPosition(0);
            }
            era1Theme.start();
            era1Theme.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public static void runEra2Theme(int start, int setPosition) {
        if (start == 0) {
            era2Theme.stop();
        }
        else if (start == 1) {
            if (setPosition == 0) {
                era2Theme.setMicrosecondPosition(0);
            }
            era2Theme.start();
            era2Theme.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public static void runEra3Theme(int start, int setPosition) {
        if (start == 0) {
            era3Theme.stop();
        }
        else if (start == 1) {
            if (setPosition == 0) {
                era3Theme.setMicrosecondPosition(0);
            }
            era3Theme.start();
            era3Theme.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public static void runEra4Theme(int start, int setPosition) {
        if (start == 0) {
            era4Theme.stop();
        }
        else if (start == 1) {
            if (setPosition == 0) {
                era4Theme.setMicrosecondPosition(0);
            }
            era4Theme.start();
            era4Theme.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }
}
