package com.example.paresh.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bNavView = (Button)findViewById(R.id.b_nav_view);
        Button bTabbedView = (Button)findViewById(R.id.b_tabbed_view);
        Button bLoginView = (Button)findViewById(R.id.b_login_view);
        Button bMapView = (Button)findViewById(R.id.b_map_view);
        Button bScrollView = (Button)findViewById(R.id.b_scroll_view);
        Button bBottomTabView = (Button)findViewById(R.id.b_bottom_tab_view);
        Button bUserView = (Button)findViewById(R.id.b_user_detail_view);

        bNavView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NavigationDrawer.class));
            }
        });

        bTabbedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Tabbed.class));
            }
        });

        bLoginView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Login.class));
            }
        });

        bMapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MapsActivity.class));
            }
        });

        bScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ScrollingActivity.class));
            }
        });

        bBottomTabView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BottomTabbed.class));
            }
        });

        bUserView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ItemListActivity.class));
            }
        });
    }
}
