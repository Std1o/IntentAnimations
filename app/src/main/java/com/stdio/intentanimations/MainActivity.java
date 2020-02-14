package com.stdio.intentanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        startActivity(new Intent(this, TestActivity.class));
        switch (view.getId()) {
            case R.id.button:
                Animatoo.animateZoom(this);
                break;
            case R.id.button2:
                Animatoo.animateFade(this);
                break;
            case R.id.button3:
                Animatoo.animateWindmill(this);
                break;
            case R.id.button4:
                Animatoo.animateSpin(this);
                break;
            case R.id.button5:
                Animatoo.animateDiagonal(this);
                break;
            case R.id.button6:
                Animatoo.animateSplit(this);
                break;
            case R.id.button7:
                Animatoo.animateShrink(this);
                break;
            case R.id.button8:
                Animatoo.animateCard(this);
                break;
            case R.id.button9:
                Animatoo.animateInAndOut(this);
                break;
            case R.id.button10:
                Animatoo.animateSwipeLeft(this);
                break;
            case R.id.button11:
                Animatoo.animateSwipeRight(this);
                break;
            case R.id.button12:
                Animatoo.animateSlideLeft(this);
                break;
            case R.id.button13:
                Animatoo.animateSlideRight(this);
                break;
            case R.id.button14:
                Animatoo.animateSlideDown(this);
                break;
            case R.id.button15:
                Animatoo.animateSlideUp(this);
                break;
        }
    }
}
