package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> reportCard = new ArrayList<>();
        reportCard.add(new ReportCard("Math","A"));
        reportCard.add(new ReportCard("Literature","B"));
        reportCard.add(new ReportCard("English","B"));
        reportCard.add(new ReportCard("Physical","A"));
        reportCard.add(new ReportCard("Chemical","A"));

        ScoreAdapter scoreAdapter = new ScoreAdapter(this, reportCard);
        ListView scoreList = (ListView) findViewById(R.id.listview_score);
        scoreList.setAdapter(scoreAdapter);
        Log.v("MainActivity", "Score" + reportCard.toString());
    }
}
