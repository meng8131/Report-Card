package com.example.android.reportcard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lyman on 2017/5/18.
 */

public class ScoreAdapter extends ArrayAdapter<ReportCard>{
    public ScoreAdapter(Context context, ArrayList<ReportCard> score) {
        super(context,0, score);
    }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            //make sure the recycled view isn't null
            View listView = convertView;
            if (listView == null){
                listView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
            }

            //get current item
            ReportCard currentItem = getItem(position);

            //assign subject value
            TextView subjectView = (TextView) listView.findViewById(R.id.list_subject);
            subjectView.setText(currentItem.getSubject());

            //assign score value
            TextView scoreView = (TextView) listView.findViewById(R.id.list_score);
            scoreView.setText(currentItem.getScore());

            return listView;
        }


    }
