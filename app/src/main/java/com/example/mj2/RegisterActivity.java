package com.example.mj2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        TextView idText = (TextView)findViewById(R.id.idText);
        TextView passwordText = (TextView)findViewById(R.id.passwordText);
        TextView nameText = (TextView)findViewById(R.id.nameText);
        TextView ageText = (TextView)findViewById(R.id.ageText);

        Button registerButton = (Button)findViewById(R.id.registerButton);
    }
}
