package com.example.guest.kodelayouting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //1 kenalan
    Button btnLinear, btnRelative, btnFrame, btnConstraint, btnScroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //2 sambungin, insialisasi variable
        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnFrame = findViewById(R.id.btn_frame);
        btnConstraint = findViewById(R.id.btn_constraint);
        btnScroll = findViewById(R.id.btn_scroll);

        //3ngapain - event handing
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "ini toast Linear", Toast.LENGTH_SHORT).show();
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //komponwen variable = new Komponen()
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity.this);
                pesan.setTitle("alert dialog");
                pesan.setMessage("ini alert dialog");
                pesan.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "memilih ok", Toast.LENGTH_SHORT).show();
                    }
                });
                pesan.setNegativeButton("no", null);
                pesan.show();
            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, FrameLayout.class);
                startActivity(intent);
            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity.this);
                pesan.setTitle("alert dialog");
                pesan.setMessage("ini alert dialog");
                pesan.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "memilih ok", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MenuActivity.this, ConstraintLayout.class);
                        startActivity(intent);
                    }
                });
                pesan.setNegativeButton("no", null);
                pesan.show();
            }
        });

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ScrollView.class);
                startActivity(intent);
            }
        });
    }
}
