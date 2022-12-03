package com.example.project_a.View.FRG.mainHome;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.project_a.View.FRG.baseFRG;
import com.example.project_a.ViewModel.m011_VM;
import com.example.project_a.databinding.M011ShowpagerBinding;

public class m011_frg extends baseFRG<M011ShowpagerBinding, m011_VM> {
    @Override
    protected void initViews() {

    }

    @Override
    protected Class<m011_VM> ClassVM() {
        return m011_VM.class;
    }

    @Override
    protected M011ShowpagerBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M011ShowpagerBinding.inflate(inflater,container,false);
    }
}
