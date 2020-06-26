package com.example.householder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.net.SocketException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignin = (Button) findViewById(R.id.btn_signin);
        btnSignin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_signin:
                Toast.makeText(getApplicationContext(), "request connect", Toast.LENGTH_SHORT).show();
                Tunnel tunnel = new Tunnel("seokkyu");
                new Thread(tunnel).start();
                break;
            default:
                break;
        }
    }
}
