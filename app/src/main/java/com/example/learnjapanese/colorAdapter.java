package com.example.learnjapanese;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class colorAdapter extends ArrayAdapter<Word> {

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if ( listItemView == null) {                                         //list_Custom.xml
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.color_list, parent, false);
        }

        // Words is a Custom Object Class
         Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name



        TextView EngTextView = (TextView)  listItemView.findViewById(R.id.customText1);
        EngTextView.setText(currentWord.getWord1());


        TextView JapTextView = (TextView)  listItemView.findViewById(R.id.customText2);


        JapTextView.setText(currentWord.getWord2());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource( currentWord.getImageResourceId() );

        //Setting number audio file
        //  ImageButton playButton = (ImageButton) listItemView.findViewById(R.id.playButton);

      //  ImageButton playbutton = (ImageButton) listItemView.findViewById(R.id.playButton);
     //   playbutton.setFocusable(false);





        // Find the TextView in the list_item.xml layout with the ID version_number
        return  listItemView;

    }





    public colorAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0,  words);

    }//Constructor




}//Class



