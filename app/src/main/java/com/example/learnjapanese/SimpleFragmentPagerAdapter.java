package com.example.learnjapanese;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private final String[] tabTitles = new String[] { "Family Member", "Numbers" , "Colors" };

    public SimpleFragmentPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new numbersFragment();
            case 1 :
                return new familyFragment();

            case 2 :
                return new colorsFragment();

            default: return  null;
        }
    }//getItem



    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];

    }



}
