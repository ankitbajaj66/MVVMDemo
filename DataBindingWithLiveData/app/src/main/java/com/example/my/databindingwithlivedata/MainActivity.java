package com.example.my.databindingwithlivedata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNormalBinding;
    private Button btnBaseObservableBinding;
    private Button btnObservableField;
    private Button btnLiveData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNormalBinding = findViewById(R.id.btnNormalBinding);
        btnBaseObservableBinding = findViewById(R.id.btnBaseobservable);
        btnObservableField = findViewById(R.id.btnObservableField);
        btnLiveData = findViewById(R.id.btnLiveData);

        btnNormalBinding.setOnClickListener(this);
        btnBaseObservableBinding.setOnClickListener(this);
        btnObservableField.setOnClickListener(this);
        btnLiveData.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNormalBinding:
                Toast.makeText(this, "btnNormalBinding", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnBaseobservable:
                Toast.makeText(this, "btnBaseobservable", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnObservableField:
                Toast.makeText(this, "btnObservableField", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnLiveData:
                Toast.makeText(this, "btnLiveData", Toast.LENGTH_LONG).show();
                break;

        }
    }
}
