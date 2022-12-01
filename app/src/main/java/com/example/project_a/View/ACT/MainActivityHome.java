package com.example.project_a.View.ACT;

import com.example.project_a.ViewModel.CommonVm;
import com.example.project_a.databinding.ActivityMainHomeBinding;

public class MainActivityHome extends baseACT<ActivityMainHomeBinding, CommonVm>
{

    @Override
    protected int getIDmain() {
        return 0;
    }

    @Override
    protected void initViews() {

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