package com.example.mj2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.ButtonBarLayout;

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        final Button btnApply = (Button) findViewById(R.id.btnApply);
        final Button btnGet1 = (Button) findViewById(R.id.btnGet1);
        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btnApply = (Button) findViewById(R.id.btnApply);
                btnApply.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), FourActivity.class);
                        startActivity(intent);
                    }
                });
                btnGet1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button btnGet1 = (Button) findViewById(R.id.btnGet1);
                        btnGet1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                AlertDialog.Builder dlg = new AlertDialog.Builder(ThirdActivity.this);
                                dlg.setTitle("지문인식");
                                dlg.setMessage("택배수령을 하시려면 지문인식하세요");
                                dlg.setIcon(R.mipmap.ic_launcher);
                                dlg.show();
                            }
                        });
                    }
                });
            }
        });
    }
}