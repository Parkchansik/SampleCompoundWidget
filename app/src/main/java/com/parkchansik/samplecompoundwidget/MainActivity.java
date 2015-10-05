package com.parkchansik.samplecompoundwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    itemview myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView=(itemview)findViewById(R.id.my_view);
        itemData data=new itemData();

        data.icon=getResources().getDrawable(R.drawable.a123);
        data.title="title";
        data.desc="desc";
        myView.setItemdata(data);

    }


}
