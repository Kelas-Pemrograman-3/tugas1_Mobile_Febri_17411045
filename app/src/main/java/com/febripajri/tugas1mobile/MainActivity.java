package com.febripajri.tugas1mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnnext;

    String npm ="17411045";
    String nama = "Febri Pajri";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnext=findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent next = new Intent(MainActivity.this,page2.class);
                next.putExtra("npm",npm);
                next.putExtra("nama",nama);
                startActivity(next);
                finish();
            }
        });
    }
}


