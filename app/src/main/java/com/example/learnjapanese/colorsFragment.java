package com.example.learnjapanese;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class colorsFragment extends Fragment {
    final ArrayList<Word> word_arrayList = new ArrayList<Word>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_colors, container, false);

        setList();

        numbersAdapter adapter = new numbersAdapter(getActivity() , word_arrayList);


        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);



        return rootView;
    }//On create view



    public void setList(){

        word_arrayList.add(new Word("Black", "Burakku" , R.drawable.color_black) );
        word_arrayList.add(new Word("Brown", "Kasshoku", R.drawable.color_brown) );
        word_arrayList.add(new Word("Dusty Yellow", "Dasutiierō", R.drawable.color_dusty_yellow));
        word_arrayList.add(new Word("Gray", "Gurē", R.drawable.color_gray));
        word_arrayList.add(new Word("Green", "Midori", R.drawable.color_green));
        word_arrayList.add(new Word("Mustard Yellow", "Masutādoierō", R.drawable.color_mustard_yellow));
        word_arrayList.add(new Word("Red", "Akaa", R.drawable.color_red));
        word_arrayList.add(new Word("White", "Shiroi", R.drawable.color_white));


    }



}