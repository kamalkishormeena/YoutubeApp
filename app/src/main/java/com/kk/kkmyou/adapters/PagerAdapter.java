package com.kk.kkmyou.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.kk.kkmyou.fragments.ChannelFragment;
import com.kk.kkmyou.fragments.LiveFragment;
import com.kk.kkmyou.fragments.PlayListFragment;

/**
 * Created by mdmunirhossain on 12/18/17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ChannelFragment tab1 = new ChannelFragment();
                return tab1;
            case 1:
                PlayListFragment tab2 = new PlayListFragment();
                return tab2;
            case 2:
                LiveFragment tab3 = new LiveFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
