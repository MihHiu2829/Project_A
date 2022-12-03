package com.example.project_a.View.ACT;

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