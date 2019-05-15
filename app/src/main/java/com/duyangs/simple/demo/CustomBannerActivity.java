package com.duyangs.simple.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import com.duyangs.simple.App;
import com.duyangs.simple.R;
import com.duyangs.simple.loader.GlideImageLoader;
import com.duyangs.banner.Banner;
import com.duyangs.banner.BannerConfig;

public class CustomBannerActivity extends AppCompatActivity {
    Banner banner1,banner2,banner3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_banner);
        banner1 = (Banner) findViewById(R.id.banner1);
        banner2 = (Banner) findViewById(R.id.banner2);
        banner3 = (Banner) findViewById(R.id.banner3);

        banner1.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner2.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner3.setImages(App.images)
                .setBannerTitles(App.titles)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE)
//                .setIndicatorGravity(Gravity.CENTER)
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
