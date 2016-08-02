package com.dxc.loadingstateview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dxc.loadingstateview.widget.LoadingStateView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    LoadingStateView mLoadingView;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loading_btn:
                mLoadingView.setViewState(LoadingStateView.STATE_LOADING);
                break;
            case R.id.success_btn:
                mLoadingView.setViewState(LoadingStateView.STATE_SUCCESS);
                break;
            case R.id.failed_btn:
                mLoadingView.setViewState(LoadingStateView.STATE_FAILED);
                break;
            case R.id.empty_btn:
                mLoadingView.setViewState(LoadingStateView.STATE_EMPTY_RESULT);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoadingView = (LoadingStateView) findViewById(R.id.loading_view);

        Button successBtn = (Button)findViewById(R.id.success_btn);
        Button failedBtn = (Button)findViewById(R.id.failed_btn);
        Button emptyResultBtn = (Button)findViewById(R.id.empty_btn);
        Button loadingBtn = (Button)findViewById(R.id.loading_btn);
        loadingBtn.setOnClickListener(this);
        emptyResultBtn.setOnClickListener(this);
        failedBtn.setOnClickListener(this);
        successBtn.setOnClickListener(this);

    }
}
