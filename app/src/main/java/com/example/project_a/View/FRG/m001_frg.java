package com.example.project_a.View.FRG;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.example.project_a.API.Res.GetKey;
import com.example.project_a.API.Res.LoginRes;
import com.example.project_a.Storage.App;
import com.example.project_a.ViewModel.BaseViewModel_API;
import com.example.project_a.ViewModel.m001_VM;
import com.example.project_a.databinding.M001LoginBinding;

public class m001_frg extends baseFRG<M001LoginBinding, m001_VM> {
    @Override
    protected void initViews()
    {
        viewModel.get_Key();
                binding.btLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModel.LoginAcc(binding.edtUn.getText().toString(),binding.edtPw.getText().toString());
                    }
                });
        binding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, androidx.appcompat.R.anim.abc_fade_in));
                callBack.showFragment(m003_frg.class.getName(),null,true);
            }
        });
    }

    @Override
    protected Class<m001_VM> ClassVM() {
        return m001_VM.class;
    }

    @Override
    protected M001LoginBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M001LoginBinding.inflate(inflater,container,false);
    }

    @Override
    public void apiSuccess(String key, Object data) {
            if(key.equals(m001_VM.GET_KEY))
            {
                GetKey getKey = (GetKey) data ;
                App.getInstance().getStorage().key = getKey.data.key ;
            }if(key.equals(m001_VM.LOGIN_ACCOUNT))
        {
            LoginRes res = (LoginRes) data ;
            Log.e(m001_frg.class.getName(),res.response.responseCode);
            Log.e(m001_frg.class.getName(),res.response.responseId);
            Log.e(m001_frg.class.getName(),res.response.responseMessage);
            Log.e(m001_frg.class.getName(),res.response.responseCode);
        }
    }
}
