package com.example.learnjapanese;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    ImageView im1;
    TextView t1;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        t1 = findViewById(R.id.splash_textView);
        animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.push_up_animation);
        t1.setAnimation(animation);

        im1 = findViewById(R.id.splash_icon);
        animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.a1);
        im1.setAnimation(animation);


        getSupportActionBar().hide();



        Thread thread = new Thread() {
            public void run() {

             try {sleep(3500); }

             catch (InterruptedException e){e.printStackTrace();}

             finally {
                 Intent i = new Intent(com.example.learnjapanese.splash_screen.this , MainActivity.class);
                 startActivity(i);
                 finish();  }

            }//Run

        };// T


    thread.start();





    }// O C



}//C


/*
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".splash_screen">


    <ImageView
        android:id="@+id/splash_icon"
        android:layout_width="110dp"
        android:layout_height="110dp"
        android:layout_marginTop="172dp"
        android:background="@drawable/image_style1"
        android:contentDescription="@string/splash_screen"
        android:scaleType="centerCrop"
        android:src="@drawable/ic_baseline_sports_basketball_24"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/splash_textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="@string/welcome_androids"

        android:textSize="35sp"
        android:padding="8dp"
        android:textColor="@color/black"
        android:fontFamily="serif"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="@+id/splash_icon"
        app:layout_constraintStart_toStartOf="@+id/splash_icon"
        app:layout_constraintTop_toBottomOf="@+id/splash_icon" />




</androidx.constraintlayout.widget.ConstraintLayout>
 */