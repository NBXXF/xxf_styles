package com.xxf.styles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_colors).setOnClickListener(this);
        findViewById(R.id.btn_buttons).setOnClickListener(this);
        findViewById(R.id.btn_edits).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_colors:
                startActivity(new Intent(this, ColorActivity.class));
                break;
            case R.id.btn_buttons:
                startActivity(new Intent(this, ButtonActivity.class));
                break;
            case R.id.btn_edits:
                startActivity(new Intent(this, EditTextActivity.class));
                break;
        }
    }
}