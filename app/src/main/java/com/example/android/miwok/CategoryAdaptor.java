package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alanionita on 09/06/2018.
 */

class CategoryAdaptor extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private Context contContext;

    public CategoryAdaptor(Context context, FragmentManager fm) {
        super(fm);
        contContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            default:
                return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return contContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return contContext.getString(R.string.category_family);
        } else if (position == 2) {
            return contContext.getString(R.string.category_colors);
        } else {
            return contContext.getString(R.string.category_phrases);
        }
    }
}
