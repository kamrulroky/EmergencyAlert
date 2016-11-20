package com.example.kamrulhasan.EmergencyAlert;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

     ImageButton imgButton1,imgButton2,imgButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //imgButton1 =(ImageButton)findViewById(R.id.MedButton);

        Typeface mytypeface = Typeface.createFromAsset(getAssets(),"TT.ttf");
        TextView mytextview = (TextView)findViewById(R.id.choice);
        mytextview.setTypeface(mytypeface);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

       /* FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame,new Mianfragment()).commit();*/

        OnClikButtonListener();
    }

    public void OnClikButtonListener(){
        imgButton1 =(ImageButton)findViewById(R.id.MedButton);
        imgButton2 =(ImageButton)findViewById(R.id.PoliceButton);
        imgButton3 =(ImageButton)findViewById(R.id.FireButton);

        imgButton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent medview = new Intent("com.example.kamrulhasan.ea1.MedicalActivity");
                        startActivity(medview);

                    }
                }
        );
        imgButton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent medview = new Intent("com.example.kamrulhasan.ea1.MedicalActivity");
                        startActivity(medview);

                    }
                }
        );
        imgButton3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent medview = new Intent("com.example.kamrulhasan.ea1.MedicalActivity");
                        startActivity(medview);

                    }
                }
        );


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        //FragmentManager fm = getFragmentManager();

        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            /*FragmentManager fm = getFragmentManager();
            fm.beginTransaction().replace(R.id.content_frame,new Mianfragment()).commit();*/

            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

            //fm.beginTransaction().replace(R.id.content_frame,new Profilefragment()).commit();
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
