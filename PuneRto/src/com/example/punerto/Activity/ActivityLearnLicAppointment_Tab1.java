package com.example.punerto.Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import co.example.punerto.classes.RtoDialog;

import com.androidexample.gcm.R;


import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;

public class ActivityLearnLicAppointment_Tab1 extends Activity 
{
	
	private RadioGroup radioSexGroup;
	EditText ll_first_name,ll_middle_name, ll_last_name;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

		if (ActivityLanguage.lang.equals("English")) 
			setContentView(R.layout.activity_learn_lic_app_tab1);
		else
			setContentView(R.layout.activity_learn_lic_app_tab1);
		
		radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
		
		//RtoDialog.showNeutralDialog(ActivityLearnLicAppointment_Tab1.this,"Form Restrictions","Special Character (″ , & , < , > , ′ ) are not allowed");
		
		
	}
	
	
}