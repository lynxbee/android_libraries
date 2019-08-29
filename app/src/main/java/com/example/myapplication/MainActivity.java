package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.MyLibrary;

public class MainActivity extends AppCompatActivity {

	private MyLibrary myLib = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	myLib = new MyLibrary();
	//call simple function from library
	myLib.simpleFunctionInLibrary();
    }
}
