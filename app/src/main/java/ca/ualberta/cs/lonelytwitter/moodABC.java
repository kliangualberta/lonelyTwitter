package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kliang on 1/12/16.
 * This class is  the abstract class of all moods. It specifies what all its children needs
 * Specifically it needs way to set/get date and also get the mood as a string
 * This has 2 constructor. A defualt one that makes the date to 9999-99-99 or one can
 * provide the date as year,month,day
 */
public abstract class moodABC {
    protected Date date;
    public abstract void setDate(Date date);
    public abstract Date getDate();
    public abstract String mood();

    public moodABC(Date date) {
        this.date = date;
    }
    public moodABC(){
        this.date=(new Date(9999,99,99));
    }
}
