package org.android.textclockwidget;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class About_Me_MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button exitbtn, backbtn;
    ImageButton instagrambut, facebookbut,snapchatbut, telegrambut, whatsappbut, outlookbut, gmailbut, githubbut;
    ImageView iconeimgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me_main);
        ImageButton instagrambut = (ImageButton)findViewById(R.id.about_instagram_btn);
        ImageButton facebookbut = (ImageButton)findViewById(R.id.about_facebook_btn);
        ImageButton snapchatbut = (ImageButton)findViewById(R.id.about_snapchat_btn);
        ImageButton telegrambut = (ImageButton)findViewById(R.id.about_telegram_btn);
        ImageButton whatsappbut = (ImageButton)findViewById(R.id.about_whatsapp_btn);
        ImageButton outlookbut = (ImageButton)findViewById(R.id.about_outlook_btn);
        ImageButton gmailbut = (ImageButton)findViewById(R.id.about_gmail_btn);
        ImageButton githubbut = (ImageButton)findViewById(R.id.about_github_btn);

        Button exitbtn = (Button)findViewById(R.id.about_exit_app);
        Button backbtn = (Button)findViewById(R.id.about_back_app);

        ImageView iconeimgv = (ImageView)findViewById(R.id.about_me_logo_icone);


        instagrambut.setOnClickListener(this);
        facebookbut.setOnClickListener(this);
        snapchatbut.setOnClickListener(this);
        telegrambut.setOnClickListener(this);
        whatsappbut.setOnClickListener(this);
        outlookbut.setOnClickListener(this);
        gmailbut.setOnClickListener(this);
        githubbut.setOnClickListener(this);

        // 2 BUTTON UP Words.
        Animation up_1_move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_upwords);
        exitbtn.startAnimation(up_1_move);
        Animation up_2_move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_slide_upwords);
        backbtn.startAnimation(up_2_move);
        // Icone Fade In Anim
        Animation icone_fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_in);
        iconeimgv.startAnimation(icone_fade);

        //EXIT Button
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation butbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                exitbtn.startAnimation(butbounce);
                finish();
                System.exit(0);
            }
        });
        //BACK Button
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation butbounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                backbtn.startAnimation(butbounce);
                Intent i = new Intent(getApplicationContext(), About_Widget_MainActivity.class);
                startActivity(i);
                finish();
                onBackPressed();
            }
        });
        //ICONE ImageView
        iconeimgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thx 4 installing my App.", Toast.LENGTH_SHORT).show();
                Animation bouncemove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_bounce_about_icon);
                iconeimgv.startAnimation(bouncemove);
            }
        });
        // LOGO OF ME ANIMATIN START
        Animation me_logo = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_in);
        iconeimgv.startAnimation(me_logo);

        // 8 BUTTONS ANIMATIONS LEFT & RIGHT
        // RIGHT TO LEFT
        Animation right2left_01 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_right);
        Animation right2left_03 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_right);
        Animation right2left_05 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_right);
        Animation right2left_07 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_right);

        instagrambut.startAnimation(right2left_01);
        snapchatbut.startAnimation(right2left_03);
        whatsappbut.startAnimation(right2left_05);
        gmailbut.startAnimation(right2left_07);

        right2left_01.setStartOffset(200);
        right2left_03.setStartOffset(400);
        right2left_05.setStartOffset(600);
        right2left_07.setStartOffset(800);

        // LEFT TO RIGHT
        Animation left2right_02 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_left);
        Animation left2right_04 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_left);
        Animation left2right_06 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_left);
        Animation left2right_08 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_me_slide_left);

        facebookbut.startAnimation(left2right_02);
        telegrambut.startAnimation(left2right_04);
        outlookbut.startAnimation(left2right_06);
        githubbut.startAnimation(left2right_08);

        left2right_02.setStartOffset(200);
        left2right_04.setStartOffset(400);
        left2right_06.setStartOffset(600);
        left2right_08.setStartOffset(800);
    }

    //COMPLITE Social Media Buttons.
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.about_instagram_btn:

                Uri uriinstalink = Uri.parse("https://www.instagram.com/raj_panakaj_prajapati/");
                Intent Instalink = new Intent(Intent.ACTION_VIEW);
                Instalink.setPackage("com.instagram.android");
                try {
                    startActivity(Instalink);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/raj_panakaj_prajapati/")));
                }

                Animation click_bounce_btn_01 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                instagrambut.startAnimation(click_bounce_btn_01);
                break;
            case R.id.about_facebook_btn:

                Uri urifacelink = Uri.parse("https://www.facebook.com/profile.php?id=100014015561952");
                Intent Facelink = new Intent(Intent.ACTION_VIEW);
                Facelink.setPackage("com.facebook.android");
                try {
                    startActivity(Facelink);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100014015561952")));
                }

                Animation click_bounce_btn_02 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                facebookbut.startAnimation(click_bounce_btn_02);
                break;
            case R.id.about_snapchat_btn:

                Uri urisnaplink = Uri.parse("https://www.snapchat.com/add/raj_prajapati13?share_id=B2383ViEBCc&local=en-US");
                Intent Snaplink = new Intent(Intent.ACTION_VIEW);
                Snaplink.setPackage("com.snapchat.android");
                try {
                    startActivity(Snaplink);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.snapchat.com/add/raj_prajapati13?share_id=B2383ViEBCc&local=en-US")));
                }

                Animation click_bounce_btn_03 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                snapchatbut.startAnimation(click_bounce_btn_03);
                break;
            case R.id.about_telegram_btn:
                Uri uritelelink = Uri.parse("https://t.me/raj_prajapati14022001");
                Intent Telelink = new Intent(Intent.ACTION_VIEW);
                Telelink.setPackage("org.telegeram.messenger");
                try {
                    startActivity(Telelink);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/raj_prajapati14022001")));
                }

                Animation click_bounce_btn_04 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                telegrambut.startAnimation(click_bounce_btn_04);
                break;
            case R.id.about_whatsapp_btn:

                Uri uriwhatslink = Uri.parse("https://wa.me/qr/JYZUK45DL5VDD1");
                Intent Whatslink = new Intent(Intent.ACTION_VIEW);
                Whatslink.setPackage("com.whatsapp");
                try {
                    startActivity(Whatslink);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/qr/JYZUK45DL5VDD1")));
                }

                Animation click_bounce_btn_05 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                whatsappbut.startAnimation(click_bounce_btn_05);
                break;
            case R.id.about_outlook_btn:
                Intent OutlookLink = new Intent(Intent.ACTION_VIEW);
                OutlookLink.setData(Uri.parse("https://raj_prajapati142@outlook.com"));
                startActivity(OutlookLink);
                Toast.makeText(getApplicationContext(), "Vist :- raj_prajapati142@outlook.com", Toast.LENGTH_LONG).show();

                Animation click_bounce_btn_06 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                outlookbut.startAnimation(click_bounce_btn_06);
                break;
            case R.id.about_gmail_btn:
                Intent GmailLink = new Intent(Intent.ACTION_VIEW);
                GmailLink.setData(Uri.parse("https://rp5876907@gmail.com"));
                startActivity(GmailLink);
                Toast.makeText(getApplicationContext(), "Vist :- rp5876907@gmail.com", Toast.LENGTH_LONG).show();

                Animation click_bounce_btn_07 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                gmailbut.startAnimation(click_bounce_btn_07);
                break;
            case R.id.about_github_btn:

                Uri urigithublink = Uri.parse("https://github.com/rajprajapati2001");
                Intent Githublink = new Intent(Intent.ACTION_VIEW);
                Githublink.setPackage("com.github.android");
                try {
                    startActivity(Githublink);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rajprajapati2001")));
                }

                Animation click_bounce_btn_08 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_onclick_bounce_buttons);
                githubbut.startAnimation(click_bounce_btn_08);
                break;
        }
    }
}
