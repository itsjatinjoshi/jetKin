package com.example.jetkin;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements firstFragment.OnFragmentInteractionListener,
        secondFragment.OnFragmentInteractionListener

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {


    }
}
