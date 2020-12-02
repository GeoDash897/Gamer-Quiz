package game;

import java.util.*;

/**Stores and retrieves the questions and answers for each era.
 * 
 * @author GeoSonicDash
 */
public class QuestionBank {
    /**Return (int a) question from Era 1.
     * 
     * @param a question for the era that is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return question for the (int a) question.
     */
    public String era1Questions(int a) {
        ArrayList<String> era1questions = new ArrayList<String>(4);
        era1questions.add(0, "Which plant likes to play video games the most?");
        era1questions.add(1, "How can you use a steering wheel and a lightgun at the same time?");
        era1questions.add(2, "What’s the best pet to have?");
        era1questions.add(3, "What does IBM do?");
        era1questions.add(4, "When was the big apple used?");
        return era1questions.get(a);
    }

    /**Return answer choice 1 for the (int a) question from Era 1.
     * 
     * @param a question for the era that answer choice 1 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 1 for the (int a) question.
     */
    public String era1Answer1(int a) {
        ArrayList<String> era1choice1 = new ArrayList<String>(4);
        era1choice1.add(0, "A Java Fern");
        era1choice1.add(1, "With a Coleco Telstar");
        era1choice1.add(2, "Scooby-Doo");
        era1choice1.add(3, "Get mad stonks");
        era1choice1.add(4, "1977");
        return era1choice1.get(a);
    }

    /**Return answer choice 2 for the (int a) question from Era 1.
     * 
     * @param a question for the era that answer choice 2 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 2 for the (int a) question.
     */
    public String era1Answer2(int a) {
        ArrayList<String> era1choice2 = new ArrayList<String>(4);
        era1choice2.add(0, "A Tree");
        era1choice2.add(1, "Just shoot while driving");
        era1choice2.add(2, "Garfield");
        era1choice2.add(3, "It isn’t real");
        era1choice2.add(4, "1920s");
        return era1choice2.get(a);
    }

     /**Return answer choice 3 for the (int a) question from Era 1.
     * 
     * @param a question for the era that answer choice 3 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 3 for the (int a) question.
     */
    public String era1Answer3(int a) {
        ArrayList<String> era1choice3 = new ArrayList<String>(4);
        era1choice3.add(0, "A Factory");
        era1choice3.add(1, "Learn from John Wick");
        era1choice3.add(2, "Berd");
        era1choice3.add(3, "Code blockchains for business");
        era1choice3.add(4, "2008");
        return era1choice3.get(a);
    }

    /**Return answer choice 4 for the (int a) question from Era 1.
     * 
     * @param a question for the era that answer choice 4 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 4 for the (int a) question.
     */
    public String era1Answer4(int a) {
        ArrayList<String> era1choice4 = new ArrayList<String>(4);
        era1choice4.add(0, "A Sunflower");
        era1choice4.add(1, "Git gud");
        era1choice4.add(2, "Commodore");
        era1choice4.add(3, "Works with the government to hack into computers");
        era1choice4.add(4, "After farming an apple tree");
        return era1choice4.get(a);
    }

    /**Return (int a) question from Era 2.
     * 
     * @param a question for the era that is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return question for the (int a) question.
     */
    public String era2Questions(int a) {
        ArrayList<String> era1questions = new ArrayList<String>(4);
        era1questions.add(0, "Which ghost is the smartest?");
        era1questions.add(1, "Where’s the best place to bury unsold video games?");
        era1questions.add(2, "What Company revived video games in the U.S?");
        era1questions.add(3, "Which was the most popular?");
        return era1questions.get(a);
    }

    /**Return answer choice 1 for the (int a) question from Era 2.
     * 
     * @param a question for the era that answer choice 1 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 1 for the (int a) question.
     */
    public String era2Answer1(int a) {
        ArrayList<String> era2choice1 = new ArrayList<String>(4);
        era2choice1.add(0, "Inky");
        era2choice1.add(1, "Arizona Desert");
        era2choice1.add(2, "Atari");
        era2choice1.add(3, "Tetris");
        return era2choice1.get(a);
    }

    /**Return answer choice 2 for the (int a) question from Era 2.
     * 
     * @param a question for the era that answer choice 2 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 2 for the (int a) question.
     */
    public String era2Answer2(int a) {
        ArrayList<String> era2choice2 = new ArrayList<String>(4);
        era2choice2.add(0, "Blinky");
        era2choice2.add(1, "N.M Desert");
        era2choice2.add(2, "Activision");
        era2choice2.add(3, "Pac-Man");
        return era2choice2.get(a);
    }

    /**Return answer choice 3 for the (int a) question from Era 2.
     * 
     * @param a question for the era that answer choice 3 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 3 for the (int a) question.
     */
    public String era2Answer3(int a) {
        ArrayList<String> era2choice3 = new ArrayList<String>(4);
        era2choice3.add(0, "Pinky");
        era2choice3.add(1, "Sahara Desert");
        era2choice3.add(2, "Nintendo");
        era2choice3.add(3, "Duck Hunt");
        return era2choice3.get(a);
    }

    /**Return answer choice 4 for the (int a) question from Era 2.
     * 
     * @param a question for the era that answer choice 4 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 4 for the (int a) question.
     */
    public String era2Answer4(int a) {
        ArrayList<String> era2choice4 = new ArrayList<String>(4);
        era2choice4.add(0, "Clyde");
        era2choice4.add(1, "Gobi Desert");
        era2choice4.add(2, "Sega");
        era2choice4.add(3, "Super Mario Bros.");
        return era2choice4.get(a);
    }

    /*Note!- All of the Strings for the questions and answer choices in Era 3 are
    capitalized due to the algorithm I used to convert the text into Images to display
    on the screen*/
    
    /**Return (int a) question from Era 3.
     * 
     * @param a question for the era that is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return question for the (int a) question.
     */
    public String era3Questions(int a) {
        ArrayList<String> era1questions = new ArrayList<String>(4);
        era1questions.add(0, "WHERE CAN YOU NOTFIND A HEDGEHOG");
        era1questions.add(1, "HOW MANY PORTS OFEARTHWORM JIM ARETHERE");
        era1questions.add(2, "WHAT IS A PLUMBERS FAVORITE MUSHROOM");
        era1questions.add(3, "WHAT IS SUPER EFFECTIVE AGAINST SQUIDS");
        era1questions.add(4, "OH CRAP! KIRBY HASA ");
        return era1questions.get(a);
    }

    /**Return answer choice 1 for the (int a) question from Era 3.
     * 
     * @param a question for the era that answer choice 1 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 1 for the (int a) question.
     */
    public String era3Answer1(int a) {
        ArrayList<String> era1choice1 = new ArrayList<String>(4);
        era1choice1.add(0, "ANTARTICA");
        era1choice1.add(1, "NINE");
        era1choice1.add(2, "MUSHROOM");
        era1choice1.add(3, "RIFLE");
        era1choice1.add(4, "GUN");
        return era1choice1.get(a);
    }

    /**Return answer choice 2 for the (int a) question from Era 3.
     * 
     * @param a question for the era that answer choice 2 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 2 for the (int a) question.
     */
    public String era3Answer2(int a) {
        ArrayList<String> era1choice2 = new ArrayList<String>(4);
        era1choice2.add(0, "CHINA");
        era1choice2.add(1, "SEVEN");
        era1choice2.add(2, "SUPER MUSHROOM");
        era1choice2.add(3, "SHOTGUN");
        era1choice2.add(4, "KNIFE");
        return era1choice2.get(a);
    }

    /**Return answer choice 3 for the (int a) question from Era 3.
     * 
     * @param a question for the era that answer choice 3 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 3 for the (int a) question.
     */
    public String era3Answer3(int a) {
        ArrayList<String> era1choice3 = new ArrayList<String>(4);
        era1choice3.add(0, "SAUDI ARABIA");
        era1choice3.add(1, "EIGHT");
        era1choice3.add(2, "ULTRA MUSHROOM");
        era1choice3.add(3, "FLAMETHROWER");
        era1choice3.add(4, "NUBLETTS");
        return era1choice3.get(a);
    }

    /**Return answer choice 4 for the (int a) question from Era 4.
     * 
     * @param a question for the era that answer choice 4 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 4 for the (int a) question.
     */
    public String era3Answer4(int a) {
        ArrayList<String> era1choice4 = new ArrayList<String>(4);
        era1choice4.add(0, "CALIFORNIA");
        era1choice4.add(1, "SIX");
        era1choice4.add(2, "MAGIC MUSHROOM");
        era1choice4.add(3, "BAZOOKA");
        era1choice4.add(4, "PISTOL");
        return era1choice4.get(a);
    }

    /**Return (int a) question from Era 4.
     * 
     * @param a question for the era that is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return question for the (int a) question.
     */
    public String era4Questions(int a) {
        ArrayList<String> era1questions = new ArrayList<String>(3);
        era1questions.add(0, "How much data was used for the black hole image?");
        era1questions.add(1, "What was the largest prize pool for an esports tournament and what game was it?");
        era1questions.add(2, "From what mob was the creeper created from?");
        era1questions.add(3, "What was the first Pokemon that was ever created?");
        return era1questions.get(a);
    }

    /**Return answer choice 1 for the (int a) question from Era 4.
     * 
     * @param a question for the era that answer choice 1 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 1 for the (int a) question.
     */
    public String era4Answer1(int a) {
        ArrayList<String> era1choice1 = new ArrayList<String>(3);
        era1choice1.add(0, "57 TB");
        era1choice1.add(1, "30 Million+, Dota 2");
        era1choice1.add(2, "Chicken");
        era1choice1.add(3, "Rhydon");
        return era1choice1.get(a);
    }

    /**Return answer choice 2 for the (int a) question from Era 4.
     * 
     * @param a question for the era that answer choice 2 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 2 for the (int a) question.
     */
    public String era4Answer2(int a) {
        ArrayList<String> era1choice2 = new ArrayList<String>(3);
        era1choice2.add(0, "738 GB");
        era1choice2.add(1, "3 Million, Fortnite");
        era1choice2.add(2, "Zombie");
        era1choice2.add(3, "Bulbasaur");
        return era1choice2.get(a);
    }
    
    /**Return answer choice 3 for the (int a) question from Era 4.
     * 
     * @param a question for the era that answer choice 3 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 3 for the (int a) question.
     */
    public String era4Answer3(int a) {
        ArrayList<String> era1choice3 = new ArrayList<String>(3);
        era1choice3.add(0, "5 PB");
        era1choice3.add(1, "60 Million, CS:GO");
        era1choice3.add(2, "Pig");
        era1choice3.add(3, "Mew");
        return era1choice3.get(a);
    }

    /**Return answer choice 4 for the (int a) question from Era 4.
     * 
     * @param a question for the era that answer choice 4 is being asked for (between 0 and 4 to 
     * keep in within size of the ArrayList).
     * @return answer choice 4 for the (int a) question.
     */
    public String era4Answer4(int a) {
        ArrayList<String> era1choice4 = new ArrayList<String>(3);
        era1choice4.add(0, "924 GB");
        era1choice4.add(1, "27 Million+, Overwatch");
        era1choice4.add(2, "Enderman");
        era1choice4.add(3, "Arceus");
        return era1choice4.get(a);
    }
}
