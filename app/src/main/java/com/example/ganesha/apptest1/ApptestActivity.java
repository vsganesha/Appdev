package com.example.ganesha.apptest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ApptestActivity extends AppCompatActivity {
 int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apptest);

    }


    public void OnBclick(View V) {

        TextView a = (TextView) findViewById(R.id.textView);
        int i = num+1;
        num=i;
        a.setText(Integer.toString(i));


    }
    public void OnB2click(View V) {

        TextView b = (TextView) findViewById(R.id.textView);
        int i = num-1;
        num=i;
        b.setText(Integer.toString(i));


    }
    public void OnB3click(View V) {

        TextView c = (TextView) findViewById(R.id.textView);
        int i=0;
        num=i;
        c.setText(Integer.toString(i));


    }

}