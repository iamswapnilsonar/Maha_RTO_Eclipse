package com.example.punerto.Adapter;

import com.androidexample.gcm.R;
import com.androidexample.gcm.RegisterActivity;

import com.example.punerto.Activity.ActivityCitizenCharter;
import com.example.punerto.Activity.ActivityCredits;
import com.example.punerto.Activity.ActivityExpandableFaq;
import com.example.punerto.Activity.ActivityOtherComplaint;
import com.example.punerto.Activity.ActivityMotorVehicleDepartment;
import com.example.punerto.Activity.ActivityNewProject;
import com.example.punerto.Activity.ActivityRTOHelpDesk;
import com.example.punerto.Activity.ActivityRtoOfficeList;
import com.example.punerto.Activity.ActivityPracticeTest;
import com.example.punerto.Activity.ActivityRoadSafety;
import com.example.punerto.Activity.ActivitySchoolBus;
import com.example.punerto.Activity.ActivityAutoTaxiComplaint;
import com.example.punerto.Activity.ActivityUserManual;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("ViewHolder")
public class AdapterRtoContent extends BaseAdapter {

	String[] rtoContentNameList;
	int[] rtoContenImages;
	Context mContext;
	LayoutInflater inflater;

	public AdapterRtoContent(Context mContext, String[] rtoContentNameList,
			int[] rtoContenImages) {

		this.mContext = mContext;
		this.rtoContentNameList = rtoContentNameList;
		this.rtoContenImages = rtoContenImages;
		inflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return rtoContentNameList.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public class Holder {
		TextView txt_rtoContentName;
		ImageView img_rtoContentImage;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		Holder holder = new Holder();
		View rowView;
		rowView = inflater.inflate(R.layout.layout_rtocontent, null);
		holder.txt_rtoContentName = (TextView) rowView
				.findViewById(R.id.txt_RtoContentName);
		holder.img_rtoContentImage = (ImageView) rowView
				.findViewById(R.id.img_RtoContent);
		holder.txt_rtoContentName.setText(rtoContentNameList[position]);
		holder.img_rtoContentImage.setImageResource(rtoContenImages[position]);

		rowView.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				switch (position) {
				case 0:

					Intent intent = new Intent(mContext,
							ActivityMotorVehicleDepartment.class);
					mContext.startActivity(intent);
					break;

				case 1:

					Intent intentActOffice = new Intent(mContext,
							ActivityRtoOfficeList.class);
					mContext.startActivity(intentActOffice);

					break;

				case 2:

					Intent intentCitizenCharter = new Intent(mContext,
							ActivityCitizenCharter.class);
					mContext.startActivity(intentCitizenCharter);
					break;

				case 3:

					Intent taxiIntent = new Intent(mContext,
							ActivityAutoTaxiComplaint.class);
					mContext.startActivity(taxiIntent);

					break;
				case 4:

					Intent intentOtherComplaint = new Intent(mContext,
							ActivityOtherComplaint.class);
					mContext.startActivity(intentOtherComplaint);

					break;

				case 5:
					Intent intentRoadSafety = new Intent(mContext,
							ActivityRoadSafety.class);
					mContext.startActivity(intentRoadSafety);
					break;
				case 6:

					Intent intentPracticeTest = new Intent(mContext,
							ActivityPracticeTest.class);
					mContext.startActivity(intentPracticeTest);
					break;

				case 7:

					Intent rtoImportantMessage = new Intent(mContext,
							RegisterActivity.class);
					mContext.startActivity(rtoImportantMessage);

					break;
				case 8:

					Intent intentRtoHelpDisk = new Intent(mContext,
							ActivityRTOHelpDesk.class);
					mContext.startActivity(intentRtoHelpDisk);
					// Toast.makeText(mContext, "Case 8 " + position,
					// Toast.LENGTH_LONG).show();
					break;

				case 9:

					Intent intentNewProject = new Intent(mContext,
							ActivityNewProject.class);
					mContext.startActivity(intentNewProject);
					// Intent rtoImportantMessage = new Intent(mContext,
					// RegisterActivity.class);
					// mContext.startActivity(rtoImportantMessage);
					break;

				case 10:

					Intent intentFaq = new Intent(mContext,
							ActivityExpandableFaq.class);
					mContext.startActivity(intentFaq);
					// Toast.makeText(mContext, "Case 10 " + position,
					// Toast.LENGTH_LONG).show();
					break;

				case 11:

					Intent intentSchoolBus = new Intent(mContext,
							ActivitySchoolBus.class);
					mContext.startActivity(intentSchoolBus);
					// Intent intentRtoHelpDisk = new Intent(mContext,
					// ActivityRTOHelpDesk.class);
					// mContext.startActivity(intentRtoHelpDisk);
					// Toast.makeText(mContext, "Case 11 " + position,
					// Toast.LENGTH_LONG).show();

					break;

				case 12:

					Intent intentUserManual = new Intent(mContext,
							ActivityUserManual.class);
					mContext.startActivity(intentUserManual);
					// Toast.makeText(mContext, "Case 12 " + position,
					// Toast.LENGTH_LONG).show();
					// Intent intentFaq = new Intent(mContext,
					// ActivityFaq.class);
					// mContext.startActivity(intentFaq);

					// Intent intentFaq = new Intent(mContext,
					// ActivityExpandableFaq.class);
					// mContext.startActivity(intentFaq);

					break;

				case 13:

					Intent intentCredits = new Intent(mContext,
							ActivityCredits.class);
					mContext.startActivity(intentCredits);
					// Intent intenttax = new Intent(mContext,
					// MainActivity1.class);
					// mContext.startActivity(intenttax);

					// Intent intenttax = new Intent(mContext,
					// ActivityTax.class);
					// mContext.startActivity(intenttax);
					break;
				case 14:

					// Intent intentNewProject = new Intent(mContext,
					// ActivityNewProject.class);
					// mContext.startActivity(intentNewProject);

					break;

				case 15:

					// Intent intentSchoolBus = new Intent(mContext,
					// ActivitySchoolBus.class);
					// mContext.startActivity(intentSchoolBus);
					break;
				case 16:

					// Intent intentVideoAnimation = new Intent(mContext,
					// ActivityAnimationVideo.class);
					// mContext.startActivity(intentVideoAnimation);
					break;

				case 17:

					// Intent intentCredits = new Intent(mContext,
					// ActivityCredits.class);
					// mContext.startActivity(intentCredits);
					break;
				case 18:

					// Intent intentTaxiFare = new Intent(mContext,
					// ActivityFare.class);
					// mContext.startActivity(intentTaxiFare);
					break;
				default:
					break;
				}

			}
		});
		return rowView;
	}

}
