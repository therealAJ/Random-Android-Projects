package me.alexjordache.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void dropIn(View view) {

        ImageView counter = (ImageView) view;
        counter.setTranslationY(-1000f);
        counter.setImageResource(R.drawable.yellow);
        counter.animate().translationY(1000f).setDuration(300);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
