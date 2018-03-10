package com.example.nathapong.app41_masterusingcheckboxradiobuttonratingbarseeker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener,
        RatingBar.OnRatingBarChangeListener, RadioGroup.OnCheckedChangeListener{

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;

    SeekBar seekBar;
    RatingBar ratingBar;

    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox)findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox)findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox)findViewById(R.id.checkBox8);

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        ratingBar = (RatingBar)findViewById(R.id.ratingBar);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);

        checkBox1.setOnCheckedChangeListener(MainActivity.this);
        checkBox2.setOnCheckedChangeListener(MainActivity.this);
        checkBox3.setOnCheckedChangeListener(MainActivity.this);
        checkBox4.setOnCheckedChangeListener(MainActivity.this);
        checkBox5.setOnCheckedChangeListener(MainActivity.this);
        checkBox6.setOnCheckedChangeListener(MainActivity.this);
        checkBox7.setOnCheckedChangeListener(MainActivity.this);
        checkBox8.setOnCheckedChangeListener(MainActivity.this);

        seekBar.setOnSeekBarChangeListener(MainActivity.this);

        ratingBar.setOnRatingBarChangeListener(MainActivity.this);

        radioGroup.setOnCheckedChangeListener(MainActivity.this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
        switch (radioButtonId){
            case R.id.radioButton1 :
                Toast.makeText(MainActivity.this, "Android is Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2 :
                Toast.makeText(MainActivity.this, "iOS is Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3 :
                Toast.makeText(MainActivity.this, "Windows Phone is Checked", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
        Toast.makeText(MainActivity.this, "The number Of stars are : " + rating,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        Toast.makeText(MainActivity.this, "The current value of the seek bar is : " + progress,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(MainActivity.this, "Now the seek bar is started : ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(MainActivity.this, "Now the seek bar is stopped : ",
                Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

        switch (compoundButton.getId()){
            case R.id.checkBox1 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Boxing is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox2 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Kick Boxing is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox3 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Judo is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox4 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Aikido is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox5 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Football is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox6 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Taekwondo is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox7 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Wrestling is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox8 :
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Swimming is Checked!", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
