package com.wxystatic.materialloadbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wxystatic.loadbutton.MaterialLoadButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.load_btn)
    MaterialLoadButton loadBtn;
    @BindView(R.id.btn_success)
    Button btnSuccess;
    @BindView(R.id.btn_failed)
    Button btnFailed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.load_btn, R.id.btn_success, R.id.btn_failed})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.load_btn:
                loadBtn.startLoading();
                break;
            case R.id.btn_success:
                loadBtn.loadingSuccessful();
                break;
            case R.id.btn_failed:
                loadBtn.loadingFailed();
                break;
        }
    }
}
