package com.example.punerto.Activity;

import java.util.ArrayList;

import com.androidexample.gcm.R;
import com.example.punerto.View.AdapterElectricMeter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ListView;

public class AcitivityElectricMeter extends ActionBarActivity {

	ArrayList<ElectricMeter> arrayElectricMeters = new ArrayList<ElectricMeter>();

	ListView lst_ElectricMeter;
	AdapterElectricMeter adapterElectricMeter;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_electric_meter);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle("Electric Fare");
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#009688")));
		actionBar.show();
		lst_ElectricMeter = (ListView) findViewById(R.id.lst_ElectricMeter);

		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		arrayElectricMeters.add(new ElectricMeter("10 km", "100 Rs", "100 Rs",
				"100 Rs", "140 Rs"));
		adapterElectricMeter = new AdapterElectricMeter(
				AcitivityElectricMeter.this, arrayElectricMeters);

		lst_ElectricMeter.setAdapter(adapterElectricMeter);

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
