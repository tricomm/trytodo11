package com.apress.gerber.trytodo11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ohteractivity extends AppCompatActivity {

    Button  bn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohteractivity);
        String name = getIntent().getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
        bn = (Button) findViewById(R.id.button2);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ohteractivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
