package com.example.saifu.haripertamaiak;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextInputEditText et_email, et_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_email = (TextInputEditText) findViewById(R.id.email);
        et_password = (TextInputEditText) findViewById(R.id.password);
        btn_login = (Button) findViewById(R.id.button_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = et_email.getText().toString().trim();
                String password = et_password.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    et_email.setError(getString(R.string.error_email));
                    et_email.setFocusableInTouchMode(true);
                    et_email.requestFocus();
                } else  if (password.length()<8){
                    TextUtils.isEmpty(password);
                    et_password.setError(getText(R.string.error_password_1));
                } else {
                    Intent sendDataIntent = new Intent(MainActivity.this, ReceivedDataActivity.class);
                    sendDataIntent.putExtra("email", email);
                    sendDataIntent.putExtra("password", password);
                    startActivity(sendDataIntent);
                }
            }
        });
    }
}
