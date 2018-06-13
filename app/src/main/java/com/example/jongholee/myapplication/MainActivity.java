package com.example.jongholee.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click_btn;
    TextView displays_textView;
    EditText input_editText;
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.display_textview:
                    input_editText.setText(displays_textView.getText().toString());
                    break;

                case R.id.click_btn:
                    displays_textView.setText(input_editText.getText().toString());
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_btn = findViewById(R.id.click_btn);
        displays_textView = findViewById(R.id.display_textview);
        input_editText = findViewById(R.id.input_editText);

        click_btn.setOnClickListener(mClickListener);
        displays_textView.setOnClickListener(mClickListener);
    }
}
