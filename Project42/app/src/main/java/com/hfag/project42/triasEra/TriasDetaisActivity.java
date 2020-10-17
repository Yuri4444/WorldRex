package com.hfag.project42.triasEra;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfag.project42.R;

public class TriasDetaisActivity extends AppCompatActivity {

    public static final String EXTRA_TRIAS_ID = "triasId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trias_detais);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Заполнить TextView и ImageView
        int triasId = (Integer)getIntent().getExtras().get(EXTRA_TRIAS_ID);
        String triasName = TriasEra.triases[triasId].getName();
        TextView textView = findViewById(R.id.trias_title);
        textView.setText(triasName);

        //Добавление деталей
        int triasDetail = (Integer)getIntent().getExtras().get(EXTRA_TRIAS_ID);
        String triasDetail3 = TriasEra.triases[triasDetail].getDetail();
        TextView textView3 = findViewById(R.id.trias_detail);
        textView3.setText(triasDetail3);

        //Добавление деталей

        int triasImage = TriasEra.triases[triasId].getImageResourcesId();
        ImageView imageView = findViewById(R.id.trias_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, triasImage));
        imageView.setContentDescription(triasName);

//        TextView textView1 = findViewById(R.id.description_dinozavra);
//        textView1.setText(triasName);

        //ПОЛЕ ДЛЯ ЕКСПЕРИМЕНТОВ 2
        int triasFirstDesc = (Integer)getIntent().getExtras().get(EXTRA_TRIAS_ID);
        String triasFirstDes = TriasEra.triases[triasFirstDesc].getFirstDescription();
        TextView textView2 = findViewById(R.id.trias_first_description);
        textView2.setText(triasFirstDes);


        //ПОЛЕ ДЛЯ ЕКСПЕРИМЕНТОВ
        int triasDesc = (Integer)getIntent().getExtras().get(EXTRA_TRIAS_ID);
        String triasDes = TriasEra.triases[triasDesc].getDescription();
        TextView textView1 = findViewById(R.id.trias_description);
        textView1.setText(triasDes);
    }
}