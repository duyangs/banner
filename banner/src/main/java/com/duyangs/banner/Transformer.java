package com.duyangs.banner;

import android.support.v4.view.ViewPager.PageTransformer;

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

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
