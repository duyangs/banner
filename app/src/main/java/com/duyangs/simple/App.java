package com.duyangs.simple;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App extends Application {
    public static List<Drawable> images=new ArrayList<>();
    public static List<String> titles=new ArrayList<>();
    public static int H,W;
    public static App app;
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        getScreen(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            images .add(getDrawable(R.mipmap.timg0));
            images .add(getDrawable(R.mipmap.timg1));
            images .add(getDrawable(R.mipmap.timg2));
            images .add(getDrawable(R.mipmap.timg3));
        }else {
            images .add(getResources().getDrawable(R.mipmap.timg0));
            images .add(getResources().getDrawable(R.mipmap.timg1));
            images .add(getResources().getDrawable(R.mipmap.timg2));
            images .add(getResources().getDrawable(R.mipmap.timg3));
        }
        titles.add("图一");
        titles.add("图2");
        titles.add("图3");
        titles.add("图4");
    }
    public void getScreen(Context aty) {
        DisplayMetrics dm = aty.getResources().getDisplayMetrics();
        H=dm.heightPixels;
        W=dm.widthPixels;
    }
}
