package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kliang on 1/12/16.
 * This angry class is for angry
 */
public class Angry extends moodABC {

    public Angry(Date date) {
        super(date);
    }

    public Angry() {
    }

    @Override
    public void setDate(Date date) {
        this.date=date;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    public String mood(){
        return "ANGREY!!!";
    }

}
