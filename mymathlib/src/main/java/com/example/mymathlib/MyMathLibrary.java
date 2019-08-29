package com.example.mymathlib;

import android.util.Log;

public class MyMathLibrary {
	public static String TAG = "MyLibrary:Math";

	public MyMathLibrary () {
	}

	public int simpleAddition(int a, int b) {
		int sum = a+b;
		Log.d(TAG, "This call reached to : MyMathLibrary:simpleAddition:: " + sum);
		return sum;
	}
}
