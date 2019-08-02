package com.example.fincasys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostNewPropertyActivity extends AppCompatActivity {
    @BindView(R.id.linRent)
    LinearLayout linRent;
    @BindView(R.id.linearSell)
    LinearLayout linSell;
    @BindView(R.id.linPg)
    LinearLayout linPg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
        initComponent();
    }

    private void initComponent() {
        linSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PropertyTypesActivity.class));
            }
        });
    }
}
