package com.example.tacademy.samplemultitypelistview1;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class SendView extends FrameLayout {
    public SendView(Context context) {
        super(context);
        init();
    }

    ImageView image_iconView;
    TextView text_messageView;
    SendData data;

    private void init(){
        inflate(getContext(), R.layout.view_send,this);
        image_iconView = (ImageView)findViewById(R.id.image_icon);
        text_messageView = (TextView)findViewById(R.id.text_message);
    }

    public void setData(SendData data){
        this.data = data;
        image_iconView.setImageResource(data.iconId);
        text_messageView.setText(data.message);
    }

}
