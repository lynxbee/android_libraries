package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.MyLibrary;
import com.example.apptolibrary.AppToLibrary;

public class MainActivity extends AppCompatActivity {

	private MyLibrary myLib = null;
	private AppToLibrary appToLibrary = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	myLib = new MyLibrary();
	//call simple function from library
	myLib.simpleFunctionInLibrary();

	appToLibrary = new AppToLibrary();
	appToLibrary.HelloFromAppToLibraryClass();

    }
}
