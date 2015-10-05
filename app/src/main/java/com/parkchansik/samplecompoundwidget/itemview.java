package com.parkchansik.samplecompoundwidget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

/**
 * Created by Tacademy on 2015-10-05.
 */
public class itemview extends FrameLayout {

    public itemview(Context context){
        super(context);
        init();
    }
    public itemview(Context context ,AttributeSet attrs){
        super(context,attrs);
        init();
    }

    ImageView iconView;
    TextView titleView,descView;
    itemData mData;

    private void init(){

       // LayoutInflater.from(getContext()).inflate(R.layout.view_item,this);
        inflate(getContext(),R.layout.view_item,this);
        iconView=(ImageView)findViewById(R.id.imageView);
        titleView=(TextView)findViewById(R.id.textView);
        descView=(TextView)findViewById(R.id.textView2);

    }

    public void setItemdata(itemData data){
        mData=data;

        if(data.icon!=null) {
            iconView.setImageDrawable(data.icon);
        }
        titleView.setText(data.title);
        descView.setText(data.desc);
    }



}
