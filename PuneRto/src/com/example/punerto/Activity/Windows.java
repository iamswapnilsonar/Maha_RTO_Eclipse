package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Windows extends Fragment {
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
		    View windows = inflater.inflate(R.layout.windows_frag, container, false);
	        ((TextView)windows.findViewById(R.id.textView)).setText("Windows");
	        return windows;
}}
