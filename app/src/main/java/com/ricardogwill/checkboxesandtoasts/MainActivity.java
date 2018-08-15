package com.ricardogwill.checkboxesandtoasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3;

    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2, radioButton3;
    private Button submitButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.check_box_1);
        checkBox2 = (CheckBox) findViewById(R.id.check_box_2);
        checkBox3 = (CheckBox) findViewById(R.id.check_box_3);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        submitButton = (Button) findViewById(R.id.submit_button);
        radioButton1 = (RadioButton) findViewById(R.id.radio_button_1);
        radioButton2 = (RadioButton) findViewById(R.id.radio_button_2);
        radioButton3 = (RadioButton) findViewById(R.id.radio_button_3);

        checkBoxListener();
        radioButtonListener();
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

    public void radioButtonListener() {

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((RadioButton) radioButton1).isChecked()) {
                    Toast.makeText(MainActivity.this, "Radio Button 1 is checked.", Toast.LENGTH_SHORT).show();
                } else if (((RadioButton) radioButton2).isChecked()) {
                    Toast.makeText(MainActivity.this, "Radio Button 2 is checked.", Toast.LENGTH_SHORT).show();
                } else if (((RadioButton) radioButton3).isChecked()) {
                    Toast.makeText(MainActivity.this, "Radio Button 3 is checked.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "No Radio Button is checked.", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

}
