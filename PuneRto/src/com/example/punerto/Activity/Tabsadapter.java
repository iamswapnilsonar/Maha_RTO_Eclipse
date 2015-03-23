package com.example.punerto.Activity;

import com.example.punerto.View.Ios;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Tabsadapter extends FragmentStatePagerAdapter {

	private int TOTAL_TABS = 2;

	public Tabsadapter(FragmentManager fm) {
		super(fm);

	}

	@Override
	public Fragment getItem(int index) {
		// TODO Auto-generated method stub
		switch (index) {
		case 0:
			return new Android();

		case 1:
			return new Ios();

		case 2:
			return new Android();
		}

		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return TOTAL_TABS;
	}
}
