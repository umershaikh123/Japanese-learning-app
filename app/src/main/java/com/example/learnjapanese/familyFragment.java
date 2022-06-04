package com.example.learnjapanese;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class familyFragment extends Fragment {
    final ArrayList<Word> word_arrayList = new ArrayList<Word>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_family, container, false);

        setList();

        numbersAdapter adapter = new numbersAdapter(getActivity() , word_arrayList);


        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);



        return rootView;
    }//On create view



    public void setList(){

        word_arrayList.add(new Word("Grand Father", "Sofu", R.drawable.family_grandfather));
        word_arrayList.add(new Word("Grand Mother", "Sobo", R.drawable.family_grandmother));
        word_arrayList.add(new Word("Father", "Otosan" , R.drawable.family_father) );
        word_arrayList.add(new Word("Mother", "Okasan", R.drawable.family_mother));
        word_arrayList.add(new Word("Daughter", "Musume", R.drawable.family_daughter) );
        word_arrayList.add(new Word("Son", "Musuko", R.drawable.family_son));
        word_arrayList.add(new Word("Older Brother", "Nīsan", R.drawable.family_older_brother));
        word_arrayList.add(new Word("Older Sister", "Onēsan", R.drawable.family_older_sister));
        word_arrayList.add(new Word("Younger Brother", "Otōto", R.drawable.family_younger_brother));
        word_arrayList.add(new Word("Younger Sister", "Imōto", R.drawable.family_younger_sister));


    }



}