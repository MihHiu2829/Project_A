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

        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.Mint01);
        showFragment(m011_frg.class.getName(),null,false);

        binding.layoutBottomFn.btNoti.setOnClickListener(this::gotoFrgNoti);
        binding.layoutBottomFn.btSearch.setOnClickListener(this::gotoFrgSearch);
        binding.layoutBottomFn.btHome.setOnClickListener(this::gotoFrgHome);
        binding.layoutBottomFn.btAboutyou.setOnClickListener(this::gotoFrgAboutYou);
        binding.layoutBottomFn.btGame.setOnClickListener(this::gotoFrgGames);

    }

    private void gotoFrgGames(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btAboutyou.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btGame.setBackgroundResource(R.color.Mint01);
        binding.layoutBottomFn.btSearch.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btNoti.setBackgroundResource(R.color.white);
    }

    private void gotoFrgAboutYou(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btAboutyou.setBackgroundResource(R.color.Mint01);
        binding.layoutBottomFn.btGame.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btSearch.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btNoti.setBackgroundResource(R.color.white);
    }

    private void gotoFrgHome(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.Mint01);
        binding.layoutBottomFn.btAboutyou.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btGame.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btSearch.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btNoti.setBackgroundResource(R.color.white);
        View view = getLayoutInflater().inflate(R.layout.top_bar,null) ;
        binding.lnTopBar.removeAllViews();
        binding.lnTopBar.addView(view,WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        showFragment(m011_frg.class.getName(),null,false);
    }

    private void gotoFrgSearch(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btAboutyou.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btGame.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btSearch.setBackgroundResource(R.color.Mint01);
        binding.layoutBottomFn.btNoti.setBackgroundResource(R.color.white);
        View view = getLayoutInflater().inflate(R.layout.top_searching,null) ;
        binding.lnTopBar.removeAllViews();
        binding.lnTopBar.addView(view,WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        showFragment(m012_frg.class.getName(),null,false);

    }

    private void gotoFrgNoti(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btAboutyou.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btGame.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btSearch.setBackgroundResource(R.color.white);
        View view = getLayoutInflater().inflate(R.layout.top_notification1,null) ;
        ImageView iv = getLayoutInflater().inflate(R.layout.bottom_function,null).findViewById(R.id.bt_noti) ;
        iv.setColorFilter(Color.BLACK);
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