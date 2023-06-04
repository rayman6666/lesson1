package ru.mirea.komaristyi.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);

        TextView tv = findViewById(R.id.textView);
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text in MIREA");

        Button button = findViewById(R.id.button8);
        button.setText("MireaButton");

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);


    }
}