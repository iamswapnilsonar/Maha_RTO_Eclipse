package com.example.punerto.Adapter;

import java.util.ArrayList;

import com.androidexample.gcm.R;
import com.example.punerto.Activity.ActivityPracticeTest;
import co.example.punerto.classes.PracticeTest;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.widget.Toast;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

@SuppressLint("ViewHolder")
public class AdapterPracticeTest extends BaseAdapter {

	Context context;
	ArrayList<PracticeTest> practiceTests;
	LayoutInflater inflater;

	String ans;
	static int mark = 0;
	static int countrer = 0;

	public AdapterPracticeTest(Context context,
			ArrayList<PracticeTest> practiceTests) {
		// TODO Auto-generated constructor stub

		this.context = context;
		this.practiceTests = practiceTests;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}



	@SuppressWarnings("deprecation")
	public int getCount() {
		// TODO Auto-generated method stub
		if (practiceTests.size() == 0) {
			AlertDialog alertDialog = new AlertDialog.Builder(context).create();
			// Setting Dialog Title
			alertDialog.setTitle("Test Score");
			// Setting Dialog Message
			alertDialog.setMessage("Final Score is :-" + mark);
			// Setting OK Button
			alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					// Write your code here to execute after dialog closed
					((ActivityPracticeTest) context).finish();

				}
			});

			// Showing Alert Message
			alertDialog.show();

		}
		if (practiceTests != null)
			return practiceTests.size();
		return 0;
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
		TextView txt_practiceTest;
		ImageView img_identify;
		RadioGroup radioGroup;
		RadioButton radioButton1;
		RadioButton radio_Opt2;
		RadioButton radio_Opt3;
		Button btn_Submit;
	}

	public View getView(final int position, View convertView, ViewGroup arg2) {

		final Holder holder = new Holder();
		View rowView;
		rowView = inflater.inflate(R.layout.layout_practice_test_view, null);
		holder.txt_practiceTest = (TextView) rowView
				.findViewById(R.id.txt_PracticeTestQuestion);

		holder.radioButton1 = (RadioButton) rowView
				.findViewById(R.id.radio_Opt1);
		holder.radio_Opt2 = (RadioButton) rowView.findViewById(R.id.radio_Opt2);
		holder.radio_Opt3 = (RadioButton) rowView.findViewById(R.id.radio_Opt3);
		holder.btn_Submit = (Button) rowView.findViewById(R.id.btn_AnsSubmit);
		holder.img_identify = (ImageView) rowView
				.findViewById(R.id.imageView1232332);

		holder.txt_practiceTest.setText(practiceTests.get(position)
				.getQuestion());
		holder.radio_Opt2.setText(practiceTests.get(position).getOpt2());
		holder.radio_Opt3.setText(practiceTests.get(position).getOpt3());
		holder.radioButton1.setText(practiceTests.get(position).getOpt1());

		if (practiceTests.get(position).getImg_Path() != null) {
			String fnm = practiceTests.get(position).getImg_Path();

			String PACKAGE_NAME = context.getPackageName();
			int imgId = context.getResources().getIdentifier(
					PACKAGE_NAME + ":drawable/" + fnm, null, null);
			System.out.println("IMG ID :: " + imgId);
			System.out.println("PACKAGE_NAME :: " + PACKAGE_NAME);
			Bitmap bitmap = BitmapFactory.decodeResource(
					context.getResources(), imgId);
			holder.img_identify.setImageBitmap(BitmapFactory.decodeResource(
					context.getResources(), imgId));
		} else {
			holder.img_identify.setVisibility(View.INVISIBLE);
		}

		holder.btn_Submit.setOnClickListener(new OnClickListener() {

			@SuppressWarnings("null")
			@Override
			public void onClick(View v) {
				String correctAnsValue = practiceTests.get(position).getAns();

				if (holder.radioButton1.isChecked()) {

					ans = "1";
					if (correctAnsValue.equals(ans)) {

						mark++;
						Toast.makeText(context, "Correct Answer",
								Toast.LENGTH_LONG).show();
						practiceTests.remove(position);
						notifyDataSetChanged();

					} else {

						practiceTests.remove(position);
						notifyDataSetChanged();
						Toast.makeText(context, "Wrong Answer",
								Toast.LENGTH_SHORT).show();
						Toast.makeText(context,
								"Correct Answer" + correctAnsValue,
								Toast.LENGTH_LONG).show();
					}
				}

				if (holder.radio_Opt2.isChecked()) {

					ans = "2";
					if (correctAnsValue.equals(ans)) {

						Toast.makeText(context, "Correct Answer",
								Toast.LENGTH_SHORT).show();
						mark++;
						practiceTests.remove(position);
						notifyDataSetChanged();

					} else {

						practiceTests.remove(position);
						notifyDataSetChanged();
						Toast.makeText(context, "Wrong Answer",
								Toast.LENGTH_SHORT).show();
						Toast.makeText(context,
								"Correct Answer" + correctAnsValue,
								Toast.LENGTH_LONG).show();
					}
				}

				if (holder.radio_Opt3.isChecked()) {

					ans = "3";
					if (correctAnsValue.equals(ans)) {

						Toast.makeText(context, "Correct Answer",
								Toast.LENGTH_LONG).show();

						mark++;
						practiceTests.remove(position);
						notifyDataSetChanged();

					} else {

						practiceTests.remove(position);
						notifyDataSetChanged();
						Toast.makeText(context, "Wrong Answer",
								Toast.LENGTH_SHORT).show();
						Toast.makeText(context,
								"Correct Answer" + correctAnsValue,
								Toast.LENGTH_LONG).show();
					}
				}

			}
		});

		return rowView;

	}
}
