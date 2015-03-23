package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MechanicMeterView extends LinearLayout {

	public Context context;
	TextView txt_meter;
	TextView txt_distance;
	TextView txt_dayFare;
	TextView txt_nightFare;

	public MechanicMeterView(Context context) {
		super(context);
		this.context = context;
		hookup();
		// TODO Auto-generated constructor stub
	}

	private void hookup() {
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(R.layout.layout_mechanic_view, null);
		txt_meter = (TextView) view.findViewById(R.id.txt_Meter);
		txt_distance = (TextView) view.findViewById(R.id.txt_distance);
		txt_dayFare = (TextView) view.findViewById(R.id.txt_dayFare);
		txt_nightFare = (TextView) view.findViewById(R.id.txt_nightFare);
		this.addView(view);
	}

	public void setData(MechanicMeter mechanicMeter) {
		txt_meter.setText(mechanicMeter.getMeter());
		txt_distance.setText(mechanicMeter.getDistance());
		txt_dayFare.setText(mechanicMeter.getDayFare());
		txt_nightFare.setText(mechanicMeter.getNightFare());
		// txt_OfficeName.setText(officeList.getOfficeName());

	}

}
