package com.example.fincasys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.linBuy)
    LinearLayout linBuy;
    @BindView(R.id.linComm)
    LinearLayout linComm;
    @BindView(R.id.linNewPro)
    LinearLayout linNewPro;
    @BindView(R.id.linRent)
    LinearLayout linRent;
    @BindView(R.id.relSell)
    RelativeLayout relSell;
    @BindView(R.id.rdBuy)
    RadioButton rdBuy;
    @BindView(R.id.rdComm)
    RadioButton rdComm;
    @BindView(R.id.rdNew)
    RadioButton rdNew;
    @BindView(R.id.rdRent)
    RadioButton rdRent;
    @BindView(R.id.rdSell)
    RadioButton rdSell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportActionBar().hide();
        initComponent();
    }

    private void initComponent() {
        linBuy.setOnClickListener(this);
        linComm.setOnClickListener(this);
        linNewPro.setOnClickListener(this);
        linRent.setOnClickListener(this);
        relSell.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linBuy:
                rdBuy.setChecked(true);
                startActivity(new Intent(getApplicationContext(), BuyActivity.class));
                break;
            case R.id.linComm:
                rdComm.setChecked(true);
                startActivity(new Intent(getApplicationContext(), CommercialActivity.class));
                break;
            case R.id.linNewPro:
                rdNew.setChecked(true);
                startActivity(new Intent(getApplicationContext(), NewProjectActivity.class));
                break;
            case R.id.linRent:
                rdRent.setChecked(true);
                startActivity(new Intent(getApplicationContext(), RentActivity.class));
                break;
            case R.id.relSell:
                rdSell.setChecked(true);
                startActivity(new Intent(getApplicationContext(), SellActvity.class));
                break;
        }
    }
}
