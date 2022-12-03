package com.example.project_a.View.ACT;

import com.example.project_a.Storage.App;
import com.example.project_a.View.FRG.mainHome.m011_frg;
import com.example.project_a.ViewModel.CommonVm;
import com.example.project_a.databinding.ActivityMainHomeBinding;

public class MainActivityHome extends baseACT<ActivityMainHomeBinding, CommonVm>
{

    @Override
    protected int getIDmain() {
        return 0;
    }

    @Override
    protected void initViews()
    {
        showFragment(m011_frg.class.getName(),null,false);
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