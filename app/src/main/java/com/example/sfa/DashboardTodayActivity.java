package com.example.sfa;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class DashboardTodayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_today);


        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbartoday);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = findViewById(R.id.tab_layouttoday);

        tabLayout.addTab(tabLayout.newTab().setText("Pencapaian Hari Ini"));
        tabLayout.addTab(tabLayout.newTab().setText("KUnjungan"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.pagertoday);
        final DashboardTodayPagerAdapter adapter = new DashboardTodayPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
