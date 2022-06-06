package org.android.textclockwidget;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class About_Widget_MainActivity extends AppCompatActivity {
    ViewFlipper vff;
    ImageView imgv, preiv, nexiv, abiv;
    Button vffbut01, vffbut02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_widget_main);

        ViewFlipper vff = (ViewFlipper)findViewById(R.id.view_flipper_layout);
        ImageView imgv = (ImageView)findViewById(R.id.about_img_vf);
        ImageView preiv = (ImageView)findViewById(R.id.previous_iv_id);
        ImageView nexiv = (ImageView)findViewById(R.id.next_iv_id);
        ImageView abiv = (ImageView)findViewById(R.id.about_logo_iv);
        Button vffbut01 = (Button)findViewById(R.id.previous_btn_id);
        Button vffbut02 = (Button)findViewById(R.id.next_btn_id);

        //vff.setFlipInterval(3000);
        //vff.startFlipping();

        vffbut01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animleft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_left);
                Animation butbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                vff.startAnimation(animleft);
                vff.showPrevious();
                vffbut01.startAnimation(butbounce);
            }
        });
        vffbut02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animright = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_right);
                Animation butbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                vff.startAnimation(animright);
                vff.showNext();
                vffbut02.startAnimation(butbounce);
            }
        });
        preiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animleft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_left);
                Animation butbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                vff.startAnimation(animleft);
                vff.showPrevious();
                preiv.startAnimation(butbounce);
            }
        });
        nexiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animright = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_right);
                Animation butbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                vff.startAnimation(animright);
                vff.showNext();
                nexiv.startAnimation(butbounce);
            }
        });

        //About Activity
        abiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), About_Me_MainActivity.class);
                startActivity(i);
                Animation butbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                abiv.startAnimation(butbounce);
            }
        });
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), About_Me_MainActivity.class);
                startActivity(i);
            }
        });
    }
}