package com.example.punerto.Activity;

import java.math.BigDecimal;
import java.util.ArrayList;



import com.androidexample.gcm.R;
import com.example.punerto.View.AdapterTaxiMeter;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;


public class ActivityTaxiFare extends ActionBarActivity 
{
	// Auto array
	
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
/*	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	

	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	

	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	

	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	

	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();
	ArrayList<TaxiFare> arr_nagpur_auto = new ArrayList<TaxiFare>();*/
	
	
	
	
	
	ListView lst_fare;
	int selected_region; 
	ArrayList<TaxiFare> selected_array= new ArrayList<TaxiFare>();
	
	AdapterTaxiMeter adpt_fare;
	Spinner spinner_dist,spinner_ride_type;
	private RadioButton radioBtn_Auto, radioBtn_Taxi;

	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_taxi_fare);
		
		

		
		
		
		float meter=(float) 1.0;
		float meterincrement = (float) 0.10;
		float dayfare=(float) 10.0;
		float dayfareincrement=(float) 0.50;
		float nightfare=(float) 0.0;
		float nightfareincrement=(float) 0.50;
		
		for (int i=0; i<=10;i++)
		{
			meter =round(meter,2);
			
			arr_nagpur_auto.add(new TaxiFare(""+meter,""+dayfare,""+nightfare));
			meter=meter+meterincrement;
			dayfare=dayfare+dayfareincrement;	
			
		}
		
		
		final String[] dist =getResources().getStringArray(R.array.spinner_item);
		
		spinner_dist = (Spinner) findViewById(R.id.spinner_dist);
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(
			        this, android.R.layout.simple_spinner_item, dist);
		 spinner_dist.setAdapter(adapter);
		 spinner_dist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
		 {
			 @Override
             public void onItemSelected(AdapterView<?> arg0, View arg1,
                     int arg2, long arg3) 
             {
               int position = spinner_dist.getSelectedItemPosition();
               Toast.makeText(getApplicationContext(),"You have selected "+position,Toast.LENGTH_LONG).show();
                 // TODO Auto-generated method stub
               selected_region=position;
               listManager();
             }
             @Override
             public void onNothingSelected(AdapterView<?> arg0) {
                 // TODO Auto-generated method stub
             }
			
         } );
		 
		radioBtn_Auto = (RadioButton) findViewById(R.id.radio01);
		radioBtn_Taxi = (RadioButton) findViewById(R.id.radio11);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle("Fare information");
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#009688")));
		actionBar.show();
		lst_fare = (ListView) findViewById(R.id.lst_taxiFare);

	}
	
	public void itemAuto(View v) 
	{
		// code to check if this checkbox is checked!
		if (radioBtn_Taxi.isChecked() == true) 
		{
			radioBtn_Auto.setChecked(false);
		}
		listManager();
			
	}
	

	public void itemAuto1(View v) 
	{
		// code to check if this checkbox is checked!
		if (radioBtn_Auto.isChecked() == true) 
		{
			radioBtn_Taxi.setChecked(false);
		}
		listManager();
	}
	
	 public static float round(float d, int decimalPlace) {
	        BigDecimal bd = new BigDecimal(Float.toString(d));
	        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
	        return bd.floatValue();
	    }
	
	
	public void listManager()
	{
		//Toast.makeText(getBaseContext(), "region "+arr_nagpur_taxi, Toast.LENGTH_SHORT).show();
		//Note the array starts from ZERO so for MH number should be reduced by 1
		// so case 0 will be MH01
		selected_array.clear();
		lst_fare.setAdapter(null);
		
		switch (selected_region)
		{
		
		case 0: 
				if(radioBtn_Taxi.isChecked() == true)
					selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
				else if(radioBtn_Auto.isChecked() == true)
					selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
				break;	
			
		
		case 1: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 2: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 3: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 4: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 5: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 6: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 7: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
									
					
		case 8: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 9: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;					
					
					
		case 10: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 11: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 12: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 13: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 14: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;
										
					
		case 15: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>)arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 16: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 17: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 18: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 19: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 20: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 21: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 22: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 23: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
									
					
		case 24: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 25: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 26: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 27: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 28: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 29: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 30: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;
	
									
					
		case 31: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
									
					
		case 32: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 33: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 34: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 35: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;					
					
					
		case 36: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;					
					
					
		case 37: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
					
				
					
		case 38: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 39: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 40: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 41: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 42: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;						
					
					
		case 43: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 44: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 45: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 46: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 47: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 48: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 49: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
										
					
		case 50: 
					if(radioBtn_Taxi.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					else if(radioBtn_Auto.isChecked() == true)
						selected_array =(ArrayList<TaxiFare>) arr_nagpur_auto.clone();
					break;	
					

		
		}
		
		adpt_fare = new AdapterTaxiMeter(ActivityTaxiFare.this,selected_array);
		lst_fare.setAdapter(adpt_fare);
		
	}
	
	

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
