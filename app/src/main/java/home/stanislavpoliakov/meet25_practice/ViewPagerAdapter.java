package home.stanislavpoliakov.meet25_practice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "meet25_logs";

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return SlideFragment.newInstance(++i);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
