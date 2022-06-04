package com.example.learnjapanese;

public class Word {

    private final String word1;
    private final String word2;
    private int mImageResourceId;



    public Word(String eWord , String mWord , int imageResourceId){
        this.word1 = eWord;
        this.word2 = mWord;
        this. mImageResourceId = imageResourceId;
    }


    public String getWord1(){
        return word1;
    }

    public String getWord2(){
        return word2;
    }


    public int getImageResourceId(){
        return  mImageResourceId ;
    }


}
