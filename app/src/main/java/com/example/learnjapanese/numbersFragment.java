package com.example.learnjapanese;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class numbersFragment extends Fragment {
    final ArrayList<Word> word_arrayList = new ArrayList<Word>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);

        setList();

        numbersAdapter adapter = new numbersAdapter(getActivity() , word_arrayList);

        //fragment list
        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);



        return rootView;
    }//On create view



    public void setList(){

        word_arrayList.add(new Word("One", "Eech" , R.drawable.number_one )  );
        word_arrayList.add(new  Word("Two", "Ni", R.drawable.number_two   ) );
        word_arrayList.add(new  Word("Three", "San", R.drawable.number_three    ));
        word_arrayList.add(new  Word("Four", "Shi", R.drawable.number_four  ));
        word_arrayList.add(new  Word("Five", "Go", R.drawable.number_five   ));
        word_arrayList.add(new  Word("Six", "Roku", R.drawable.number_six   ));
        word_arrayList.add(new  Word("Seven", "Nana", R.drawable.number_seven  ) );
        word_arrayList.add(new  Word("Eight", "Hachi", R.drawable.number_eight  ));
        word_arrayList.add(new  Word("Nine", "Kyuu", R.drawable.number_nine  ));
        word_arrayList.add(new  Word("Ten", "Juu", R.drawable.number_ten  ));

    }



}