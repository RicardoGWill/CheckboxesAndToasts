package com.ricardogwill.checkboxesandtoasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.check_box_1);
        checkBox2 = (CheckBox) findViewById(R.id.check_box_2);
        checkBox3 = (CheckBox) findViewById(R.id.check_box_3);

        checkBoxListener();
    }

    public void checkBoxListener() {

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (((CheckBox) buttonView).isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox 1 is checked.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Checkbox 1 is unchecked.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (((CheckBox) buttonView).isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox 2 is checked.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Checkbox 2 is unchecked.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (((CheckBox) buttonView).isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox 3 is checked.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Checkbox 3 is unchecked.", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

}
