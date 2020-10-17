package com.hfag.project42.ursEra;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfag.project42.R;

public class UrsDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_URS_ID = "ursId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urs_details);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int ursId = (Integer)getIntent().getExtras().get(EXTRA_URS_ID);
        String ursName = UrsEra.urses[ursId].getName();
        TextView textView = findViewById(R.id.urs_title);
        textView.setText(ursName);

//        Детали
        int ursDetail = (Integer)getIntent().getExtras().get(EXTRA_URS_ID);
        String ursDetail1 = UrsEra.urses[ursDetail].getDetail();
        TextView textView3 = findViewById(R.id.urs_detail);
        textView3.setText(ursDetail1);
//        Детали

        int ursImage = UrsEra.urses[ursId].getImageResourcesId();
        ImageView imageView = findViewById(R.id.urs_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,ursImage));
        imageView.setContentDescription(ursName);

        int ursFirstDes = (Integer)getIntent().getExtras().get(EXTRA_URS_ID);
        String ursFirstDesc = UrsEra.urses[ursFirstDes].getFirstDescription();
        TextView textView1 = findViewById(R.id.urs_first_description);
        textView1.setText(ursFirstDesc);

        int ursDes = (Integer)getIntent().getExtras().get(EXTRA_URS_ID);
        String ursDesName = UrsEra.urses[ursDes].getDescription();
        TextView textView2 = findViewById(R.id.urs_description);
        textView2.setText(ursDesName);










//        int ursId = (Integer)getIntent().getExtras().get(EXTRA_URS_ID);
//        String ursName = UrsEra.urses[ursId].getName();
//        TextView textView = findViewById(R.id.urs_title);
//        textView.setText(ursName);
    }
}