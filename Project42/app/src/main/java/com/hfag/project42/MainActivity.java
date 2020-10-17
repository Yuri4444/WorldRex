package com.hfag.project42;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.hfag.project42.nav_panel.ArchiologActivity;
import com.hfag.project42.nav_panel.EarthActivity;
import com.hfag.project42.nav_panel.PlantActivity;
import com.hfag.project42.nav_panel.RecordsActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{

    //Музыка-Переменная
    public MediaPlayer musicOfPark;
    //Музыка-Переменная

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ПАНЕЛЬ ИНСТРУМЕНТОВ
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Связывание SectionsPagerAdapter с ViewPager
        SelectionsPagerAdapter adapterPager = new SelectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapterPager);


        //Связывание ViewPager с TabLayout
        TabLayout tabLayout =(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

        //Експеримент
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);

        //Это из книгиб слушатель нажатий
        navigationView.setNavigationItemSelectedListener(this);

        //Експеримент


//        Кнопка бургер
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



        //Музло!!!
        musicOfPark = MediaPlayer.create(this, R.raw.par);
        musicOfPark.start();

        //Музло!!!

    }

    //МЕНЮ Toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_mein, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_toolbar:
                Intent intent = new Intent(this, LibraryActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_sweem:
                Intent intent1 = new Intent(this, SweemActivity.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //МЕНЮ Toolbar



    //Слушатель - метод для NavigationView
    @Override
    public boolean onNavigationItemSelected( MenuItem menuItem) {
        int id = menuItem.getItemId();


        switch(id) {
            case R.id.plant:
               Intent intent = new Intent(this, PlantActivity.class);
               startActivity(intent);
               break;
            case R.id.earth:
                Intent intent1 = new Intent(this, EarthActivity.class);
                startActivity(intent1);
                break;
            case R.id.records:
                Intent intent2 = new Intent(this, RecordsActivity.class);
                startActivity(intent2);
                break;
            case R.id.finds:
                Intent intent3 = new Intent(this, ArchiologActivity.class);
                startActivity(intent3);
                break;
        }
//
//        //Для закрытия панели
//        //Панель закрывается когда пользователь щелкает по NavigationView
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    //Метод для закрытия
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //ДЛЯ СВАПОВ СТРАНИЦ ФРАГМЕНТОВ
    private class SelectionsPagerAdapter extends FragmentPagerAdapter {

        public SelectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public int getCount() {
            return 4;
        }
        @Override
        public Fragment getItem(int i) {
            switch(i) {
                case 0:
                    return new FirstFragment();
                case 1:
                    return new TriasFragment();
                case 2:
                    return new UrsFragment();
                case 3:
                    return new MelFragment();
            }
            return null;
        }

        //    ДОБАВИТЬ В CLASS ->  SelectionsPagerAdapter
        //    ДАБАВЛЯЕТ ТЕКСТ НА ВКЛАДКИ
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getText(R.string.first_tabs);
                case 1:
                    return getResources().getText(R.string.trias_tabs);
                case 2:
                    return getResources().getText(R.string.urs_tabs);
                case 3:
                    return getResources().getText(R.string.mel_tabs);
            }
            return null;
        }
    }

}