package com.calcapp.philipp.calcapp;

import android.app.Application;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        // App Name
        TextView appName = (TextView) findViewById(R.id.tv_Name);
        appName.setText("Calculator V3");

        // Display
        final TextView tvDisplay = (TextView) findViewById(R.id.tv_Display);
        String displayText = "";
        tvDisplay.setText(displayText);

        // All Buttons

        // Row 1
        Button btDEG = (Button) findViewById(R.id.bt_DEG);
        Button btRAD = (Button) findViewById(R.id.bt_RAD);
        Button btMultiply = (Button) findViewById(R.id.bt_Multiply);
        Button btDivide = (Button) findViewById(R.id.bt_Divide);
        Button btClear = (Button) findViewById(R.id.bt_Clear);
        // Row 2
        Button btSquare = (Button) findViewById(R.id.bt_Square);
        Button btSeven = (Button) findViewById(R.id.bt_Seven);
        Button btEight = (Button) findViewById(R.id.bt_Eight);
        Button btNine = (Button) findViewById(R.id.bt_Nine);
        Button btPlus = (Button) findViewById(R.id.bt_Plus);
        // Row 3
        Button btCube = (Button) findViewById(R.id.bt_Cube);
        Button btFour = (Button) findViewById(R.id.bt_Four);
        Button btFive = (Button) findViewById(R.id.bt_Five);
        Button btSix = (Button) findViewById(R.id.bt_Six);
        Button btMinus = (Button) findViewById(R.id.bt_Minus);
        // Row 4
        Button btPowerOf = (Button) findViewById(R.id.bt_PowerOf);
        Button btOne = (Button) findViewById(R.id.bt_One);
        Button btTwo = (Button) findViewById(R.id.bt_Two);
        Button btThree = (Button) findViewById(R.id.bt_Three);
        Button btCalc = (Button) findViewById(R.id.bt_Calc);
        // Row 5
        Button btZero = (Button) findViewById(R.id.bt_Zero);

        // Functionality of Buttons
        final Calculator mainCalculator = new Calculator();

        // Setting Button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // DEG Button - TODO

        // RAD Button - TODO

        // Multiply Button
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.multiply();
                tvDisplay.append("*");
            }

        });

        // Divide Button
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.divide();
                tvDisplay.append("/");
            }

        });

        // Clear Button
        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.resetButtonState();
                tvDisplay.setText("");
            }

        });

        // Squared Button
        btSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.squared();
                tvDisplay.append("^2");
            }

        });

        // "7" Button
        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(7);
                tvDisplay.append("7");
            }

        });

        // "8" Button
        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(8);
                tvDisplay.append("8");
            }

        });

        // "9" Button
        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(9);
                tvDisplay.append("9");
            }

        });

        // Plus Button
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.plus();
                tvDisplay.append("+");
            }

        });

        // Cube Button
        btCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.cubed();
                tvDisplay.append("^3");
            }

        });

        // "4" Button
        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(4);
                tvDisplay.append("4");
            }

        });

        // "5" Button
        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(5);
                tvDisplay.append("5");
            }

        });

        // "6" Button
        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(6);
                tvDisplay.append("6");
            }

        });

        // Minus Button
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.minus();
                tvDisplay.append("-");
            }

        });

        // "Power of" Button
        /*
        btPowerOf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainCalculator.powerOf();
                tvDisplay.append("^");
            }

        });
        */

        // "1" Button
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(1);
                tvDisplay.append("1");
            }

        });

        // "2" Button
        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(2);
                tvDisplay.append("2");
            }

        });

        // "3" Button
        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(3);
                tvDisplay.append("3");
            }

        });

        // Calc Button
        btCalc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    //tvDisplay.setText("");
                    tvDisplay.append("\n =" + mainCalculator.calculateResult());
                }

        });

        // "0" Button
        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainCalculator.handleUserNumbers(0);
                tvDisplay.append("0");
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
