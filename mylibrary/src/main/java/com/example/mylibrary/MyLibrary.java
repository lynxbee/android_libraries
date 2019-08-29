package com.example.mylibrary;

import android.util.Log;

public class MyLibrary {
	public static String TAG = "MyLibrary";

	public MyLibrary () {
	}

	public void simpleFunctionInLibrary() {
		Log.d(TAG, "This call reached to : simpleFunctionInLibrary");
	}
}
