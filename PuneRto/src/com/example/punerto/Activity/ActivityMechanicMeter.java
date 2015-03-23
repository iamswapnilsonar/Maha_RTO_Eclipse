package com.example.punerto.Activity;

import java.util.ArrayList;

import com.androidexample.gcm.R;
import com.example.punerto.View.AdapterMechanicMeter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ListView;

public class ActivityMechanicMeter extends ActionBarActivity {

	ListView lst_MechanicMeter;
	ArrayList<MechanicMeter> arrayMechanicMeters = new ArrayList<MechanicMeter>();
	AdapterMechanicMeter adapterMechanicMeter;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mechanic_meter);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle("Mechanic Meter Auto");
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#009688")));
		actionBar.show();
		lst_MechanicMeter = (ListView) findViewById(R.id.lst_MechanicMeter);

		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));

		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		arrayMechanicMeters.add(new MechanicMeter("1", "10 km", "50 Rs",
				"80 Rs"));
		adapterMechanicMeter = new AdapterMechanicMeter(
				ActivityMechanicMeter.this, arrayMechanicMeters);
		lst_MechanicMeter.setAdapter(adapterMechanicMeter);

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
