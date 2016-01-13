package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kliang on 1/12/16.
 * THis happy class is for happy emotion
 */
public class Happy extends moodABC{
    public Happy(Date date) {
        super(date);
    }

    public Happy() {}

    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return this.date;
    }
    public String mood(){
        return "HAPPY!!";
    }
}
