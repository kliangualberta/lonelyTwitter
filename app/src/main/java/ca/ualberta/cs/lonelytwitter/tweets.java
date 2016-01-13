package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by kliang on 1/12/16.
 * This tweet class contains the methods needed to set the message of the tweet update the message
 * of the tweet also it can do set the mood of the tweet. The getMoodLst will return the list of
 * moods. Once have the list of moods, one can index through the array list and call the function
 * mood() to get a String representatio nof the mood.
 *
 */
public class tweets {

    private String tweet;
    private ArrayList<moodABC> moodLst = new ArrayList<moodABC>();

    public tweets(String text) {
        this.tweet=text;
    }
    public String getTweet(){
        return this.tweet;
    }

    public void setTweet(String text){
        this.tweet=text;
    }
    public void setMood(moodABC mood){
        this.moodLst.add(mood);
    }
    public ArrayList<moodABC> getMoodLst(){
        return this.moodLst;
    }
}
