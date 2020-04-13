package com.example.mj2;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckedTextView;

public class FourActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
        Button btnApply1 = (Button) findViewById(R.id.btnApply1);
        btnApply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "신청되었습니다",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.chBox1:
                if(checked) {
                    Toast.makeText(getApplicationContext(), "chBox1 checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "chBox1 unchecked", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chBox2:
                if(checked) {
                    Toast.makeText(getApplicationContext(), "chBox2 checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "chBox2 unchecked", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chBox3:
                if(checked) {
                    Toast.makeText(getApplicationContext(), "chBox3 checked", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "chBox3 unchecked", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}