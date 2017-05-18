package com.example.android.reportcard;

/**
 * Created by lyman on 2017/5/18.
 */

public class ReportCard {

    //define subject
    String mSubject;

    //define score
    String mScore;

    //define constructor
    public ReportCard(String subject, String score){
        mSubject = subject;
        mScore = score;
    }

    //define getter methods
    public String getSubject(){return mSubject;}
    public String getScore(){return mScore;}

}
