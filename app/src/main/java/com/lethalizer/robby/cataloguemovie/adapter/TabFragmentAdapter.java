package com.lethalizer.robby.cataloguemovie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lethalizer.robby.cataloguemovie.fragment.NowPlayingFragment;
import com.lethalizer.robby.cataloguemovie.fragment.SearchFragment;
import com.lethalizer.robby.cataloguemovie.fragment.UpcomingFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robby on 4/26/18.
 */

public class TabFragmentAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> titleList = new ArrayList<>();

    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void addFragment(Fragment fragment, String string) {
        fragmentList.add(fragment);
        titleList.add(string);
    }
}