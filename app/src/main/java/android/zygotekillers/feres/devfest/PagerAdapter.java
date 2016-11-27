package android.zygotekillers.feres.devfest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feres on 27/11/2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> myFragments = new ArrayList<>();
    private final List<String> myFragmentTitles = new ArrayList<>();
    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    public void addFragment(Fragment fragment, String title) {
        myFragments.add(fragment);
        myFragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return myFragments.get(position);
    }

    @Override
    public int getCount() {
        return myFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return myFragmentTitles.get(position);
    }

}
