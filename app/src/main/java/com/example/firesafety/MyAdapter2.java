package com.example.firesafety;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentManager;

public class MyAdapter2 extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter2(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Class1 class1 = new Class1();
                return class1;
            case 1:
                Class2 class2 = new Class2();
                return class2;
            case 2:
                Class3 class3 = new Class3();
                return class3;
            case 3:
                Class4 class4 = new Class4();
                return class4;
            case 4:
                Class5 class5 = new Class5();
                return class5;
            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}