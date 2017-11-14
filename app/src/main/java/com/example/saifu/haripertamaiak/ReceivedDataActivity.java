package com.example.saifu.haripertamaiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceivedDataActivity extends AppCompatActivity {
    TextView tv_email, tv_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_data);

        tv_email = (TextView) findViewById(R.id.data_email);
        tv_password = (TextView) findViewById(R.id.data_password);

        Intent reveivedDataIntent = getIntent();
        tv_email.setText(reveivedDataIntent.getStringExtra("email"));
        tv_password.setText(reveivedDataIntent.getStringExtra("password"));

    }
}
