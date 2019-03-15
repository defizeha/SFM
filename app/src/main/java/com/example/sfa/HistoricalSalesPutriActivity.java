package com.example.sfa;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoricalSalesPutriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_sales_putri);
        TabLayout tabLayout = findViewById(R.id.tab_layouthistoricalsalesputri);

        tabLayout.addTab(tabLayout.newTab().setText("HISTORICAL SALES"));
        tabLayout.addTab(tabLayout.newTab().setText("TAKING ORDER"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

//        final ViewPager viewPager = findViewById(R.id.pagerhistoricalsalesputri);
        final HistoricalSalesPutriPagerAdapter adapter = new HistoricalSalesPutriPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

//        viewPager.setAdapter(adapter);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
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
