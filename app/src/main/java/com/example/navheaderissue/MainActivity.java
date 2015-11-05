package com.example.navheaderissue;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TextView navHeaderTextView1;
    private TextView navHeaderTextView2;

    private TextView bodyTextView1;
    private TextView bodyTextView2;
    private TextView bodyTextView3;

    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navHeaderTextView1 = (TextView) findViewById(R.id.tv_nhead_text1);
        navHeaderTextView2 = (TextView) findViewById(R.id.tv_nhead_text2);

        bodyTextView1 = (TextView) findViewById(R.id.tv_body1);
        bodyTextView2 = (TextView) findViewById(R.id.tv_body2);
        bodyTextView3 = (TextView) findViewById(R.id.tv_body3);

        if(navHeaderTextView1 == null || navHeaderTextView2 == null)
            bodyTextView1.setText("Header text views null in onCreate");
        else
            bodyTextView1.setText("Header text views not null in onCreate");
    }

    @Override
    public void onResume() {
        super.onResume();
        navHeaderTextView1 = (TextView) findViewById(R.id.tv_nhead_text1);
        navHeaderTextView2 = (TextView) findViewById(R.id.tv_nhead_text2);
        if(navHeaderTextView1 == null || navHeaderTextView2 == null)
            bodyTextView2.setText("Header text views null in onResume");
        else
            bodyTextView2.setText("Header text views not null in onResume");
    }

    public void checkNavViews() {
        navHeaderTextView1 = (TextView) findViewById(R.id.tv_nhead_text1);
        navHeaderTextView2 = (TextView) findViewById(R.id.tv_nhead_text2);
        if(navHeaderTextView1 == null || navHeaderTextView2 == null)
            bodyTextView3.setText("Header text views still nulll");
        else
            bodyTextView3.setText("Header text views not null any more");
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
        if (id == R.id.action_check_views) {
            checkNavViews();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camara) {
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
