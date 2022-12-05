package com.example.project_a.View.ACT;

import android.view.View;
import android.view.animation.AnimationUtils;

import com.example.project_a.R;
import com.example.project_a.View.FRG.m011_frg;
import com.example.project_a.ViewModel.CommonVm;
import com.example.project_a.databinding.ActivityMainHomeBinding;

public class MainActivityHome extends baseACT<ActivityMainHomeBinding, CommonVm>
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
    }

    private void gotoFrgSearch(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btAboutyou.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btGame.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btSearch.setBackgroundResource(R.color.Mint01);
        binding.layoutBottomFn.btNoti.setBackgroundResource(R.color.white);
    }

    private void gotoFrgNoti(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        binding.layoutBottomFn.btHome.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btAboutyou.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btGame.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btSearch.setBackgroundResource(R.color.white);
        binding.layoutBottomFn.btNoti.setBackgroundResource(R.color.Mint01);
    }

    @Override
    protected Class<CommonVm> ClassViewModel() {
        return CommonVm.class;
    }

    @Override
    protected ActivityMainHomeBinding initViewBinding() {
        return ActivityMainHomeBinding.inflate(getLayoutInflater());
    }
}