package com.bignerdranch.android.criminallntent;

import android.support.v4.app.Fragment;
import android.widget.TextView;

/**
 * Created by Leo on 2017/7/13.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    TextView blank;
    private static final String TAG = "CrimeListActivity";
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }
}
