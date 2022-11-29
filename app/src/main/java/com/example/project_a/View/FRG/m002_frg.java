package com.example.project_a.View.FRG;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.project_a.ViewModel.CommonVm;
import com.example.project_a.databinding.M001LoginBinding;
import com.example.project_a.databinding.M002MainBinding;

public class m002_frg extends baseFRG<M002MainBinding, CommonVm>
{
    @Override
    protected void initViews() {

    }

    @Override
    protected Class<CommonVm> ClassVM() {
        return CommonVm.class;
    }

    @Override
    protected M002MainBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M002MainBinding.inflate(inflater,container,false);
    }
}
