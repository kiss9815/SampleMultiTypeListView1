package com.example.tacademy.samplemultitypelistview1;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class ReceiveView extends FrameLayout {
    public ReceiveView(Context context) {
        super(context);
        init();
    }

    ImageView image_iconView;
    TextView text_messageView;
    ReceiveData data;

    private void init(){
        inflate(getContext(), R.layout.view_receive,this);
        image_iconView = (ImageView)findViewById(R.id.image_icon);
        text_messageView = (TextView)findViewById(R.id.text_message);
    }

    public void setData(ReceiveData data){
        this.data = data;
        image_iconView.setImageResource(data.iconId);
        text_messageView.setText(data.message);
    }

}
