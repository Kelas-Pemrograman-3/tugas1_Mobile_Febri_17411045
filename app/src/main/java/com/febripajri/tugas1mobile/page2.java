package com.febripajri.tugas1mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
TextView txtData ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        txtData= (TextView) findViewById(R.id.txtData);
        Intent datas = getIntent();
        String npm = datas.getStringExtra("npm");
        String nama = datas.getStringExtra("nama");

        txtData.setText(npm +"\n"+ nama);
    }
    public void  onBackPressed(){
        Intent back = new Intent (page2.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
