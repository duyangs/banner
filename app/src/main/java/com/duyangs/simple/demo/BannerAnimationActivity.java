package com.duyangs.simple.demo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.duyangs.simple.App;
import com.duyangs.simple.R;
import com.duyangs.simple.SampleAdapter;
import com.duyangs.simple.loader.GlideImageLoader;
import com.duyangs.banner.Banner;
import com.duyangs.banner.listener.OnBannerListener;
import com.duyangs.banner.transformer.AccordionTransformer;
import com.duyangs.banner.transformer.BackgroundToForegroundTransformer;
import com.duyangs.banner.transformer.CubeInTransformer;
import com.duyangs.banner.transformer.CubeOutTransformer;
import com.duyangs.banner.transformer.DefaultTransformer;
import com.duyangs.banner.transformer.DepthPageTransformer;
import com.duyangs.banner.transformer.FlipHorizontalTransformer;
import com.duyangs.banner.transformer.FlipVerticalTransformer;
import com.duyangs.banner.transformer.ForegroundToBackgroundTransformer;
import com.duyangs.banner.transformer.RotateDownTransformer;
import com.duyangs.banner.transformer.RotateUpTransformer;
import com.duyangs.banner.transformer.ScaleInOutTransformer;
import com.duyangs.banner.transformer.StackTransformer;
import com.duyangs.banner.transformer.TabletTransformer;
import com.duyangs.banner.transformer.ZoomInTransformer;
import com.duyangs.banner.transformer.ZoomOutSlideTransformer;
import com.duyangs.banner.transformer.ZoomOutTranformer;

import java.util.ArrayList;
import java.util.List;

public class BannerAnimationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, OnBannerListener {
    Banner banner;
    List<Class<? extends ViewPager.PageTransformer>> transformers=new ArrayList<>();
    public void initData(){
        transformers.add(DefaultTransformer.class);
        transformers.add(AccordionTransformer.class);
        transformers.add(BackgroundToForegroundTransformer.class);
        transformers.add(ForegroundToBackgroundTransformer.class);
        transformers.add(CubeInTransformer.class);//兼容问题，慎用
        transformers.add(CubeOutTransformer.class);
        transformers.add(DepthPageTransformer.class);
        transformers.add(FlipHorizontalTransformer.class);
        transformers.add(FlipVerticalTransformer.class);
        transformers.add(RotateDownTransformer.class);
        transformers.add(RotateUpTransformer.class);
        transformers.add(ScaleInOutTransformer.class);
        transformers.add(StackTransformer.class);
        transformers.add(TabletTransformer.class);
        transformers.add(ZoomInTransformer.class);
        transformers.add(ZoomOutTranformer.class);
        transformers.add(ZoomOutSlideTransformer.class);
    }
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_animation);
        initData();
        banner = findViewById(R.id.banner);
        ListView listView =  findViewById(R.id.list);
        String[] data = getResources().getStringArray(R.array.anim);
        listView.setAdapter(new SampleAdapter(this, data));
        listView.setOnItemClickListener(this);

        banner.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        banner.setBannerAnimation(transformers.get(position));
    }

    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getApplicationContext(),"你点击了："+position,Toast.LENGTH_SHORT).show();
    }
}
