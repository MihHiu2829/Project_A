package com.example.project_a.View.FRG;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project_a.API.Res.RegisterRes;
import com.example.project_a.Storage.App;
import com.example.project_a.ViewModel.m003_VM;
import com.example.project_a.databinding.M003ResigerBinding;

public class m003_frg extends baseFRG<M003ResigerBinding, m003_VM> {
    @Override
    protected void initViews() {
            binding.btCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callBack.showFragment(m001_frg.class.getName(),null,true);
                }
            });
            binding.btResiger.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    progressResiger();
                }
            });
    }

    private void progressResiger() {
        viewModel.phone  = binding.edtPhone.getText().toString() ;
        viewModel.email  = binding.edtEmail.getText().toString() ;
        viewModel.fullName  = binding.edtFullname.getText().toString() ;
        viewModel.identity  = binding.edtIdentity.getText().toString() ;

        if(binding.edtUn.getText().toString() .isEmpty() || binding.edtPw.getText().toString().isEmpty()
                || viewModel.phone.isEmpty() || viewModel.email.isEmpty()
                || viewModel.fullName.isEmpty() || viewModel.identity.isEmpty())
        {
            Toast.makeText(context, "Please, input full component!", Toast.LENGTH_SHORT).show();
            return ;
        }
        App.getInstance().getStorage().username = binding.edtUn.getText().toString() ;
        App.getInstance().getStorage().passsword = binding.edtPw.getText().toString() ;
        viewModel.getResiger();

    }

    @Override
    public void apiSuccess(String key, Object data) {
            if(key.equals(m003_VM.REGISTER_KEY))
            {
//                Toast.makeText(context, "Successful Register!", Toast.LENGTH_SHORT).show();

                RegisterRes res = (RegisterRes)data ;
                if(res.response.responseCode.equals("11"))
                    Toast.makeText(context, res.response.responseMessage, Toast.LENGTH_SHORT).show();
//                else if(res.response.responseMessage.equals(""))

            }
    }

    @Override
    protected Class<m003_VM> ClassVM() {
        return m003_VM.class;
    }

    @Override
    protected M003ResigerBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M003ResigerBinding.inflate(inflater,container,false);
    }
}
