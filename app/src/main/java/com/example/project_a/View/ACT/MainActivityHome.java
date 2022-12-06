package com.example.project_a.View.ACT;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.project_a.R;
import com.example.project_a.View.FRG.m011_frg;
import com.example.project_a.View.FRG.m012_frg;
import com.example.project_a.View.FRG.m013_frg;
import com.example.project_a.ViewModel.CommonVm;
import com.example.project_a.ViewModel.mainHomeVM;
import com.example.project_a.databinding.ActivityMainHomeBinding;

public class MainActivityHome extends baseACT<ActivityMainHomeBinding, mainHomeVM>
{

    @Override
    protected int getIDmain() {
        return R.id.layout_LnShowIn4 ;
    }

    @Override
    protected void initViews()
    {

       ImageView ivHome = binding.layoutBottomFn.btHome.findViewById(R.id.bt_home) ;
       ivHome.setColorFilter(getResources().getColor(R.color.Mint07));
        showFragment(m011_frg.class.getName(),null,false);
        binding.layoutBottomFn.btNoti.setOnClickListener(this::gotoFrgNoti);
        binding.layoutBottomFn.btSearch.setOnClickListener(this::gotoFrgSearch);
        binding.layoutBottomFn.btHome.setOnClickListener(this::gotoFrgHome);
        binding.layoutBottomFn.btAboutyou.setOnClickListener(this::gotoFrgAboutYou);
        binding.layoutBottomFn.btGame.setOnClickListener(this::gotoFrgGames);

    }

    private void gotoFrgGames(View v) {
        returnOriginalColorBotton();
        binding.layoutBottomFn.btGame.setColorFilter(getResources().getColor(R.color.Mint07));

    }

    private void gotoFrgAboutYou(View v) {
        returnOriginalColorBotton();
        binding.layoutBottomFn.btAboutyou.setColorFilter(getResources().getColor(R.color.Mint07));

    }

    private void gotoFrgHome(View v) {
        returnOriginalColorBotton();
        binding.layoutBottomFn.btHome.setColorFilter(getResources().getColor(R.color.Mint07));
        View view = getLayoutInflater().inflate(R.layout.top_bar,null) ;
        binding.lnTopBar.removeAllViews();
        binding.lnTopBar.addView(view,WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        showFragment(m011_frg.class.getName(),null,false);
    }

    private void returnOriginalColorBotton()
    {
        binding.layoutBottomFn.btNoti.setColorFilter(getResources().getColor(R.color.Mint05));
        binding.layoutBottomFn.btHome.setColorFilter(getResources().getColor(R.color.Mint05));
        binding.layoutBottomFn.btGame.setColorFilter(getResources().getColor(R.color.Mint05));
        binding.layoutBottomFn.btAboutyou.setColorFilter(getResources().getColor(R.color.Mint05));
        binding.layoutBottomFn.btSearch.setColorFilter(getResources().getColor(R.color.Mint05));
    }
    private void gotoFrgSearch(View v) {

        returnOriginalColorBotton();
        binding.layoutBottomFn.btSearch.setColorFilter(getResources().getColor(R.color.Mint07));


        View view = getLayoutInflater().inflate(R.layout.top_searching,null) ;
        binding.lnTopBar.removeAllViews();
        binding.lnTopBar.addView(view,WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        showFragment(m012_frg.class.getName(),null,false);

    }

    private void gotoFrgNoti(View v) {
        returnOriginalColorBotton();
        binding.layoutBottomFn.btNoti.setColorFilter(getResources().getColor(R.color.Mint07));
        View view = getLayoutInflater().inflate(R.layout.top_notification1,null) ;
        ImageView iv = getLayoutInflater().inflate(R.layout.bottom_function,null).findViewById(R.id.bt_noti) ;
        iv.setColorFilter(getColor(R.color.black));
        binding.lnTopBar.removeAllViews();
        binding.lnTopBar.addView(view, WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        showFragment(m013_frg.class.getName(),null,false);
    }

    @Override
    protected Class<mainHomeVM> ClassViewModel() {
        return mainHomeVM.class;
    }

    @Override
    protected ActivityMainHomeBinding initViewBinding() {
        return ActivityMainHomeBinding.inflate(getLayoutInflater());
    }
}