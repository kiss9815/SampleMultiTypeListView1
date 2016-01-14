package com.example.tacademy.samplemultitypelistview1;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class DateView extends FrameLayout {
    public DateView(Context context) {
        super(context);
        init();
    }


    TextView text_messageView;
    DateData data;

    private void init(){
        inflate(getContext(), R.layout.view_date,this);

        text_messageView = (TextView)findViewById(R.id.text_message);
    }

    public void setData(DateData data){
        this.data = data;
        text_messageView.setText(data.message);
    }

}
