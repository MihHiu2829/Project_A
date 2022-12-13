package com.example.project_a.otherClass;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.example.project_a.R;
import com.example.project_a.databinding.LayoutResetpwBinding;

public class resetPassword extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_resetpw);

        initView() ;
    }

    private void initView() {
        EditText edt_US = findViewById(R.id.edt_userName) ;
        EditText edt_oldPW = findViewById(R.id.edt_oldPW) ;
        EditText edt_newPW = findViewById(R.id.edt_newPW) ;
    }


}
