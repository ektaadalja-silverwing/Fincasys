package com.example.fincasys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SellPropertActivity extends AppCompatActivity {
    @BindView(R.id.linPost)
    LinearLayout linPost;
    @BindView(R.id.linManage)
    LinearLayout linManage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        ButterKnife.bind(this);
        initComponent();
    }

    private void initComponent() {
        linPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PropertyTypesActivity.class));
            }
        });
    }
}
