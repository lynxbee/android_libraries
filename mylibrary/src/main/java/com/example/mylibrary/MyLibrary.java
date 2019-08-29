package com.example.mylibrary;

import android.util.Log;
import com.example.mymathlib.MyMathLibrary;

public class MyLibrary {
	public static String TAG = "MyLibrary";

	private MyMathLibrary myMathLib = null;

	public MyLibrary () {
	}

	public void simpleFunctionInLibrary() {
		int sumReturned = 0;
		Log.d(TAG, "This call reached to : simpleFunctionInLibrary");
		Log.d(TAG, "Calling Addition Function from Another Math Library");
		myMathLib = new MyMathLibrary();
		sumReturned = myMathLib.simpleAddition(10, 23);
		Log.d(TAG, "sumReturned from Math Library: " + sumReturned);
	}
}
