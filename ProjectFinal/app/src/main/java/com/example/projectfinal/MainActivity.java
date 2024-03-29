package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void infoBtn(View view) {
        Intent Info = new Intent(this, InfoActivity.class);
        startActivity(Info);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void eduBtn(View view) {
        Intent EDU = new Intent(this, EducationActivity.class);
        startActivity(EDU);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void ppBtn(View view) {
        Intent PP = new Intent(this, PersonActivity.class);
        startActivity(PP);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void roomBtn(View view) {
        Intent Room = new Intent(this, RoomActivity.class);
        startActivity(Room);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void atvBtn(View view) {
        Intent Atv = new Intent(this, AtvActivity.class);
        startActivity(Atv);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void mapBtn(View view) {
        Intent MAP = new Intent(this, MapActivity.class);
        startActivity(MAP);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}