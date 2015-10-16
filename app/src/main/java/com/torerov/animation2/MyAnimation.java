package com.torerov.animation2;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Tacademy on 2015-10-16.
 */
public class MyAnimation extends Animation {

    int width, height;

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        this.width = parentWidth - width;
        this.height = parentHeight - height;
    }

    //변환율이 얼마일때 어떻게 변하게 할것 인지
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        float x = interpolatedTime * width;
        float y = interpolatedTime * interpolatedTime * height;
        t.getMatrix().setTranslate(x, y);
    }
}
