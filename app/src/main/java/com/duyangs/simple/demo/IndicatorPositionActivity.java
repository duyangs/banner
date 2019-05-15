package com.duyangs.simple.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.duyangs.simple.App;
import com.duyangs.simple.R;
import com.duyangs.simple.loader.GlideImageLoader;
import com.duyangs.banner.Banner;
import com.duyangs.banner.BannerConfig;

public class IndicatorPositionActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Banner banner;
    Spinner spinnerPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator_position);
        banner =  findViewById(R.id.banner);
        spinnerPosition=  findViewById(R.id.spinnerPosition);
        spinnerPosition.setOnItemSelectedListener(this);

        banner.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                banner.setIndicatorGravity(BannerConfig.LEFT);
                break;
            case 1:
                banner.setIndicatorGravity(BannerConfig.CENTER);
                break;
            case 2:
                banner.setIndicatorGravity(BannerConfig.RIGHT);
                break;
        }
        banner.start();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
