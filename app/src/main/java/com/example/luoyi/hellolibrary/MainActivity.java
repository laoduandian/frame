package com.example.luoyi.hellolibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.library.CustomUtil;
import com.example.library2.Soms;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomUtil.getMyHero();
        Soms s = new Soms();
    }
}
