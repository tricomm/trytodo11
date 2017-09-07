package com.apress.gerber.trytodo11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bn;
    EditText tv;
    int abc ()
    {
        return 2;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn = (Button) findViewById(R.id.button);

        //int tow = abc();

        //Toast.makeText(this,tow,Toast.LENGTH_LONG);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv = (EditText) findViewById(R.id.textView);
                Intent intent = new Intent(MainActivity.this,ohteractivity.class);
                intent.putExtra("name",tv.getText().toString());
                startActivity(intent);
                finish();

            }
        });

    }
}
