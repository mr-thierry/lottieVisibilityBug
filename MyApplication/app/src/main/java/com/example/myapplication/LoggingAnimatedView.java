package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

import androidx.annotation.NonNull;

public class LoggingAnimatedView extends LottieAnimationView {

    public LoggingAnimatedView(Context context) {
        super(context);
    }

    public LoggingAnimatedView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LoggingAnimatedView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("LoggingLottieAnimatedVi", "onAttachedToWindow");
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("LoggingLottieAnimatedVi", "onDetachedFromWindow");
    }

    @Override
    protected void onVisibilityChanged(@NonNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        Log.d("LoggingLottieAnimatedVi", "onVisibilityChanged visibility:"+ visibility);
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        Log.d("LoggingLottieAnimatedVi", "onWindowVisibilityChanged visibility:"+ visibility);
    }

}
