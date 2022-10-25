package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    //Buttons Numbers Declaration
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven,
    buttonEight, buttonNine, buttonZero;

    //Buttons Operations Declaration
    Button buttonAddition, buttonSoustraction, buttonMultiplication, buttonDivision;

    //Others buttons
    Button buttonEqual, buttonDot, buttonClear;

    float first, second;

    //Ecran LCD
    TextView ecran;

    boolean add, sous, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonZero = findViewById(R.id.button0);
        buttonOne = findViewById(R.id.button1);
        buttonTwo = findViewById(R.id.button2);
        buttonThree = findViewById(R.id.button3);
        buttonFour = findViewById(R.id.button4);
        buttonFive = findViewById(R.id.button5);
        buttonSix = findViewById(R.id.button6);
        buttonSeven = findViewById(R.id.button7);
        buttonEight = findViewById(R.id.button8);
        buttonNine = findViewById(R.id.button9);

        buttonAddition = findViewById(R.id.addition);
        buttonSoustraction = findViewById(R.id.soustraction);
        buttonMultiplication = findViewById(R.id.multiplication);
        buttonDivision = findViewById(R.id.division);

        buttonClear = findViewById(R.id.clear);
        buttonEqual = findViewById(R.id.equal);

        ecran = findViewById(R.id.ecran);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "0");
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "1");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "2");
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "3");
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "4");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "5");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "6");
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "7");
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "8");
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText(ecran.getText() + "9");
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ecran == null)
                    ecran.setText("");
                else {
                    first = Float.parseFloat(ecran.getText() + "");
                    add = true;
                    ecran.setText(null);
                }
            }
        });

        buttonSoustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ecran == null)
                    ecran.setText("");
                else {
                    first = Float.parseFloat(ecran.getText() + "");
                    sous = true;
                    ecran.setText(null);
                }
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ecran == null)
                    ecran.setText("");
                else {
                    first = Float.parseFloat(ecran.getText() + "");
                    mul = true;
                    ecran.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ecran == null)
                    ecran.setText("");
                else {
                    first = Float.parseFloat(ecran.getText() + "");
                    div = true;
                    ecran.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = Float.parseFloat(ecran.getText() + "");
                if(add == true){
                    ecran.setText(first + second + "");
                    add = false;
                }
                if(sous == true){
                    ecran.setText(first - second + "");
                    sous = false;
                }
                if(mul == true){
                    ecran.setText(first * second + "");
                    mul = false;
                }
                if(div == true){
                    ecran.setText(first / second + "");
                    div = false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ecran.setText("");
            }
        });
        }

}