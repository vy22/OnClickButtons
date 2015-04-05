package com.example.vy.onclickbuttons;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView Text1;
    private TextView Text2;
    private Button button_01;
    private Button button_02;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text1 = (TextView)findViewById(R.id.text);
        Text2 = (TextView)findViewById(R.id.text2);
        button_01 = (Button)findViewById(R.id.button1);
        button_02 = (Button)findViewById(R.id.button2);

        //final Button button1 = (Button) findViewById(R.id.button1);
        button_01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Text1.setText("Click on First Button");
            }
        });

        //final Button button2 = (Button) findViewById(R.id.button2);
        button_02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Text1.setText("Click on Second Button");
            }
        });
    }



}
