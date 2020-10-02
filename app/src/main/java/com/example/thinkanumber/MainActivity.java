package com.example.thinkanumber;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageHp1, imageHp2, imageHp3, imageHp4;
    private TextView textTipeltszam;
    private Button btnNoovel, btnCsokkent, btnTipel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

        btnTippel.setOnClickLisentener(new View.OnClickListener()) {
            @Override


        }
    }

    private void init() {
        imageHp1 = findViewById(R.id.image_hp1);
        imageHp2 = findViewById(R.id.image_hp2);
        imageHp3 = findViewById(R.id.image_hp3);
        textTipeltszam = findViewById(R.id.text_tippel_szam);
        btnNovel = findViewById(R.id.btn_novel);
        btnNovel = findViewById(R.id.btn_csokkent);
        btnTipp = findViewById(R.id.btn_tipp);
        tipplestszam = 1;
        elet = 4;
        imageHp4 = findViewById(R.id.image_hp3);
        gondoltszam = (int)(Math.random())10+1;
    }


}