package com.example.fincasys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PropertyLocationActivity extends AppCompatActivity {

    @BindView(R.id.tvCurrent)
    TextView tvCurrent;
    @BindView(R.id.imgCurrent)
    ImageView imgCurrent;
    @BindView(R.id.imgLocation)
    ImageView imgLocation;
    @BindView(R.id.tvLocation)
    TextView tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_location);
        ButterKnife.bind(this);
        initComponent();
    }

    private void initComponent() {
        tvLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCurrent.setVisibility(View.VISIBLE);
            }
        });
    }
}
