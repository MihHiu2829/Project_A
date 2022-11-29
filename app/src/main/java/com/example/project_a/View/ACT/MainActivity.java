package com.example.project_a.View.ACT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project_a.R;
import com.example.project_a.View.FRG.m001_frg;
import com.example.project_a.ViewModel.BaseViewModel_API;
import com.example.project_a.ViewModel.mainVM;
import com.example.project_a.databinding.ActivityMainBinding;

public class MainActivity extends baseACT<ActivityMainBinding, mainVM> {

    @Override
    protected int getIDmain() {
        return R.id.ln_main01;
    }


    @Override
    protected void initViews() {
        showFragment(m001_frg.class.getName(),null,false);
    }

    @Override
    protected Class<mainVM> ClassViewModel() {
        return mainVM.class;
    }

    @Override
    protected ActivityMainBinding initViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}