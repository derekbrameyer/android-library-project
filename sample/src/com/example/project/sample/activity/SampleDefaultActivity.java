package com.example.project.sample.activity;

import com.example.project.Utils;
import com.example.project.sample.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * User: derek Date: 3/17/13 Time: 3:59 PM
 */
public class SampleDefaultActivity extends BaseSampleActivity {

    private TextView text;
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_and_button);

        text = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);

        text.setText("--");
        button.setText("Click me!");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SampleDefaultActivity.this, Utils.getLibraryValue(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
