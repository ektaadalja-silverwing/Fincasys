package com.example.fincasys.activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.fincasys.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StatusPropertyActivity extends AppCompatActivity {

    @BindView(R.id.progress_determinate)
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_property);
        ButterKnife.bind(this);
        runProgressDeterminate();
    }
    private void runProgressDeterminate() {
        final Handler mHandler = new Handler();
        Runnable runnable = new Runnable() {
            public void run() {
                int progress = progressBar.getProgress() + 10;
                progressBar.setProgress(progress);
                if (progress > 100) {
                    progressBar.setProgress(0);
                }
                mHandler.postDelayed(this, 1000);
            }
        };
        mHandler.post(runnable);
    }
}
