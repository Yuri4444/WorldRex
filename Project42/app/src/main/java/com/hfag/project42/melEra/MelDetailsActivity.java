package com.hfag.project42.melEra;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.hfag.project42.R;

public class MelDetailsActivity extends AppCompatActivity {
    public static final String EXTRA_MEL_ID = "melId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mel_details);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int melId = (Integer)getIntent().getExtras().get(EXTRA_MEL_ID);
        String melName = MelEra.melas[melId].getName();
        TextView textView = findViewById(R.id.mel_title);
        textView.setText(melName);

//        Детали
        int melDetail = (Integer)getIntent().getExtras().get(EXTRA_MEL_ID);
        String melDetail1 = MelEra.melas[melDetail].getDetail();
        TextView textView3 = findViewById(R.id.mel_detail);
        textView3.setText(melDetail1);
//        Детали

        int imageMel = MelEra.melas[melId].getImageResourcesId();
        ImageView imageView = findViewById(R.id.mel_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, imageMel));
        imageView.setContentDescription(melName);

        int firsDes = (Integer)getIntent().getExtras().get(EXTRA_MEL_ID);
        String firstDesc = MelEra.melas[firsDes].getFirstDescription();
        TextView textView1 = findViewById(R.id.mel_first_description);
        textView1.setText(firstDesc);

        int des = (Integer)getIntent().getExtras().get(EXTRA_MEL_ID);
        String desc = MelEra.melas[des].getDescription();
        TextView textView2 = findViewById(R.id.mel_description);
        textView2.setText(desc);

    }
}