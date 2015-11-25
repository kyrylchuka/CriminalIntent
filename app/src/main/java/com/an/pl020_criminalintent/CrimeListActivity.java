package com.an.pl020_criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by andrew on 23.11.15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
