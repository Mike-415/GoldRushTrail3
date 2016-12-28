package com.michaelgonzalez.goldrushtrail3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
//TODO: Find out how to implement the Map in "this" class with an interface.
//TODO: ANSWER: CHECK OUT "https://www.youtube.com/watch?v=7CjBlxQRf7s" to implement the map fragment.
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Find out what the coordinator layout in app_bar_main.xml does.
        /*
        Bottom Navigation View Tutorial:
            https://www.youtube.com/watch?v=aTPwcWQIckw
         */
        //MapFragment mapFragment = (MapFragment)getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.action_list:
                        break;
                    case R.id.action_map:
                        break;
                    case R.id.action_tours:
                        break;
                }
                return false;
            }
        });//onNavigationItemSelected()

        //The toolbar is the top portion of the activities.
        //Located in app_bar_main.xml
        /*The Difference between Action Bar and Toolbar
        In this release, Android introduces a new Toolbar widget.
        This is a generalization of the Action Bar pattern
        that gives you much more control and flexibility.
        Toolbar is a view in your hierarchy just like any other,
        making it easier to interleave with the rest of your
        views, animate it, and react to scroll events.
         */
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Located in activity_main.xml
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //Located in activity_main.xml
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }//onCreate()


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //If the nav_drawer is open and the back button is pressed, close the nav_drawer
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    //Located in the "res" directory, under menu.
    //This is where the Nav_drawer's content is located.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

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

/*
TODO: Use the Tab Layout instead, but without ViewPagers so that the user has to click on the tab instead of sliding
TODO: Make sure that you can hide the tabs when the user is interacting with the activity(scrolling, panning, etc...)
Tab Layout URL:
    http://www.theappguruz.com/blog/easy-way-to-create-tab-layout-in-android-without-viewpager
    https://developer.android.com/reference/android/support/design/widget/TabLayout.html
    http://www.devexchanges.info/2016/06/android-tip-tab-bar-without-viewpager.html
    https://www.youtube.com/watch?v=00LLd7qr9sA
    Alvarez: Bottom Navigation
    https://www.youtube.com/watch?v=aTPwcWQIckw
    How to add a map fragment
    https://www.youtube.com/watch?v=0dToEEuPL9Y

 */
