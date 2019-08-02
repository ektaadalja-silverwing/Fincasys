package com.example.fincasys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PropertyTypesActivity extends AppCompatActivity {
    @BindView(R.id.btnCommercial)
    Button btnCommercial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_types);
        ButterKnife.bind(this);
        initComponent();
    }

    private void initComponent() {
        btnCommercial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PropertyLocationActivity.class));
            }
        });
    }
}
