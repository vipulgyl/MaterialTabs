package info.androidhive.materialtabs.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import info.androidhive.materialtabs.R;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.materialtabs.fragments.ActionPlanFragment;
import info.androidhive.materialtabs.fragments.CompanyRegistrationFragment;
import info.androidhive.materialtabs.fragments.ConnectFragment;
import info.androidhive.materialtabs.fragments.EventsAndNewsFragment;
import info.androidhive.materialtabs.fragments.HomeFragment;
import info.androidhive.materialtabs.fragments.InformationFragment;
import info.androidhive.materialtabs.fragments.LearningAndDevelopmentFragment;
import info.androidhive.materialtabs.fragments.LearningProgramMobileFragment;
import info.androidhive.materialtabs.fragments.OtherInitiativesFragment;
import info.androidhive.materialtabs.fragments.StartupIndiaServicesFragment;
import info.androidhive.materialtabs.fragments.TwoFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkInternet();
        isStoragePermissionGranted();
        firebase();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        checkInternet();
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkInternet();
    }

    // Checking storage permission
    public void isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                getStarted();
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        } else {
            getStarted();
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
            getStarted();
        }
        else
        {
            Toast.makeText(this, "Permission not granted", Toast.LENGTH_SHORT).show();
            System.exit(0);
        }
    }


    public void getStarted () {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        navigationView = (NavigationView) findViewById(R.id.nvView);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.home:
                        viewPager.setCurrentItem(0);
                        //OneFragment fragment = new OneFragment();
                        //android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        //fragmentTransaction.replace(R.id., fragment);
                        //fragmentTransaction.commit();
                        return true;

                    // For rest of the options we just show a toast on click

                    case R.id.sis:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.cr:
                        viewPager.setCurrentItem(2);
                        return true;
                    case R.id.ap:
                        viewPager.setCurrentItem(3);
                        return true;
                    case R.id.info:
                        viewPager.setCurrentItem(4);
                        return true;
                    case R.id.oi:
                        viewPager.setCurrentItem(5);
                        return true;
                    case R.id.ean:
                        viewPager.setCurrentItem(6);
                        return true;
                    case R.id.lad:
                        viewPager.setCurrentItem(7);
                        return true;
                    case R.id.lpma:
                        viewPager.setCurrentItem(8);
                        return true;
                    case R.id.connect:
                        viewPager.setCurrentItem(9);
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Somethings Wrong", Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    private void setupTabIcons() {
        int[] tabIcons = {
                R.drawable.ic_tab_favourite,
                R.drawable.ic_tab_call,
                R.drawable.ic_tab_contacts,
                R.drawable.ic_assignment_return_white_24dp,
                R.drawable.ic_swap_vert_white_24dp,
                R.drawable.ic_compare_arrows_white_24dp,
                R.drawable.ic_flight_takeoff_white_24dp,
                R.drawable.ic_launch_white_24dp,
                R.drawable.ic_pageview_white_24dp,
                R.drawable.ic_settings_overscan_white_24dp
        };

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);
        tabLayout.getTabAt(6).setIcon(tabIcons[6]);
        tabLayout.getTabAt(7).setIcon(tabIcons[7]);
        tabLayout.getTabAt(8).setIcon(tabIcons[8]);
        tabLayout.getTabAt(9).setIcon(tabIcons[9]);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new HomeFragment(), "");
        adapter.addFrag(new StartupIndiaServicesFragment(), "");
        adapter.addFrag(new CompanyRegistrationFragment(), "");
        adapter.addFrag(new ActionPlanFragment(), "");
        adapter.addFrag(new InformationFragment(), "");
        adapter.addFrag(new OtherInitiativesFragment(), "");
        adapter.addFrag(new EventsAndNewsFragment(), "");
        adapter.addFrag(new LearningAndDevelopmentFragment(), "");
        adapter.addFrag(new LearningProgramMobileFragment(), "");
        adapter.addFrag(new ConnectFragment(), "");

        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {

            // return null to display only the icon
            return null;
        }
    }

    // function to check internet connectivity
    public void checkInternet()
    {
        ConnectivityManager cManager=(ConnectivityManager)getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo=cManager.getActiveNetworkInfo();
        if(nInfo!=null && (nInfo.isConnected()))
        {
        }
        else
        {
            Toast.makeText(this, "Internet Not Available", Toast.LENGTH_LONG).show();
        }
    }
    public void firebase()
    {
        if (getIntent().getExtras() != null) {
            for (String key : getIntent().getExtras().keySet()) {
                Object value = getIntent().getExtras().get(key);
                Log.d("MainActivity", "Key: " + key + " Value: " + value);
            }
        }

    }

}
