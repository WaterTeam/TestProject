package com.example.ba.testgithub;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapters.FragmentAdapter;
import PageFragments.AlbumPageFragment;
import PageFragments.ArtistPageFragment;
import PageFragments.SongsPageFragment;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    List<Fragment> fragmentList  = new ArrayList<Fragment>();
    FragmentAdapter fragmentPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }
    /**
     * initView()方法用于初始化主活动界面
     * @author CNT on 2017/12/5.
     * @param
     * @return
     * @exception
     */
    private void initView(){
        viewPager = (ViewPager) this.findViewById(R.id.viewPager_MainActivity);

        //往viewPager的数据列表中添加3个碎片；
        fragmentList.add(new AlbumPageFragment());
        fragmentList.add(new ArtistPageFragment());
        fragmentList.add(new SongsPageFragment());

        fragmentPagerAdapter = new FragmentAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(fragmentPagerAdapter);
    }
}
